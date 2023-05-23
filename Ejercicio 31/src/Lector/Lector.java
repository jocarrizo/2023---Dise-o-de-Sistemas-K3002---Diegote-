package Lector;

import Prestamo_De_Libro.Multa;
import Prestamo_De_Libro.Prestamo;

import java.util.LinkedList;
import java.util.List;
import java.util.Calendar;

public class Lector {
    private List<Prestamo> prestamos;
    private Multa multa;

    public Lector() {
        prestamos = new LinkedList<>();
    }

    public boolean puedeRecibirPrestamo(){
        return !multa.getFin().before(Calendar.getInstance()) && prestamos.size() != 3;
    }

    public void agregarPrestamo(Prestamo prestamo){
        prestamos.add(prestamo);
    }

    public void quitarPrestamo(Prestamo prestamo){
        prestamos.remove(prestamo);
    }

    public void desmultarse(){
        multa = null;
    }

    public void multarse(Multa unaMulta){
        if(multa == null)
            multa = unaMulta;
        else
            multaMayor(unaMulta);
    }

    private void multaMayor(Multa nuevaMulta){
        if(nuevaMulta.getFin().after(multa.getFin())){
            multa = nuevaMulta;
        }
    }
}
