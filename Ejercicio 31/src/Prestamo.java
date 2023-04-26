import java.time.Duration;
import java.util.Date;
import java.util.Calendar;

public class Prestamo {
    private CopiaLibro copia;
    private Lector lector;
    private Calendar entrega;
    private Calendar devolucion;


    public Prestamo(CopiaLibro copia, Lector lector, Calendar entrega) {
        this.copia = copia;
        this.lector = lector;
        this.entrega = entrega;
    }

    public CopiaLibro getCopia() {
        return copia;
    }

    public Lector getLector() {
        return lector;
    }

    public Calendar getEntrega() {
        return entrega;
    }

    public Calendar getDevolucion() {
        return devolucion;
    }

    public int diasDeRetraso() {
        Calendar calInicio = Calendar.getInstance();
        Calendar calFin = Calendar.getInstance();

        calInicio.setTime(devolucion.getTime());
        calFin.setTime(entrega.getTime());
        long diferenciaMillis = calFin.getTimeInMillis() - calInicio.getTimeInMillis();
        int dias = (int) (diferenciaMillis / (1000 * 60 * 60 * 24));

        // nota: 1000 (millsec * segundo) , 60 (segundos por minuto), 60 (minutos por hora), 24 (horas por dia)
        return dias > 30 ? dias - 30 : 0;
    }

    public void finalizarPrestamo(){
        devolucion = Calendar.getInstance();
    }
    public void setDevolucion(Calendar devolucion) {
        this.devolucion = devolucion;
    }

}
