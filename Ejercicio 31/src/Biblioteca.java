import java.util.*;

public class Biblioteca {
    private List<CopiaLibro> libros;
    private List<Prestamo> prestamos;

    private static Biblioteca _biblioteca = null;

    private Biblioteca() {
        libros = new ArrayList<CopiaLibro>();
        prestamos = new LinkedList<Prestamo>();
    }

    private CopiaLibro buscarCopia(Libro unLibro){
        for(CopiaLibro copia: libros){
            if(copia.getLibro() == unLibro && copia.puedePrestarse())
                return copia;
        }
        return null;
    }
    
    public static Biblioteca getInstance(){
        if(_biblioteca == null)
            _biblioteca = new Biblioteca();
        return _biblioteca;
    }
    
    
    public void prestarLibro(Libro un_libro, Lector un_lector){
        CopiaLibro copia = buscarCopia(un_libro);
        Prestamo prestamo;
        if(copia == null){
            System.out.println("No existe copia disponible para prestar de este libro");
            return;
        }
        if(!un_lector.puedeRecibirPrestamo()){
            System.out.println("El lector no esta habilitado a recibir mas prestamos");
            return;
        }
        prestamo = new Prestamo(copia, un_lector, Calendar.getInstance());
        prestamos.add(prestamo);
        un_lector.agregarPrestamo(prestamo);
        copia.setEstado(EstadoCopia.PRESTADA);
    }

    public void recibirLibro(Prestamo prestamo){
        prestamo.finalizarPrestamo();
        prestamo.getCopia().setEstado(EstadoCopia.EN_BIBLIOTECA);

        if(prestamo.diasDeRetraso() > 0){
            Multa multa = new Multa(prestamo.diasDeRetraso());
            prestamo.getLector().multarse(multa);
        }
        prestamo.getLector().quitarPrestamo(prestamo);
        prestamos.remove(prestamo);
    }

}
