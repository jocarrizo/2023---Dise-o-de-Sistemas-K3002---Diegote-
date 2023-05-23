import Prestamo_De_Libro.Multa;
import Prestamo_De_Libro.Prestamo;
import Lector.Lector;

public class Controler {
    public static void main(String[] args) {


    }
    public void DevolverLibro(Prestamo prestamo){
        Multa multa;
        int dias_retraso;
        Lector lector;
        prestamo.finalizarPrestamo();
        dias_retraso = prestamo.diasDeRetraso();
        if(dias_retraso == 0)
            return;
        lector = prestamo.getLector();
        multa = new Multa(dias_retraso);
        lector.multarse(multa);
    }
}