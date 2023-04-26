import java.util.*;

public class Multa {
    private Calendar inicio;
    private Calendar fin;

    public Multa(int retraso){
        inicio = Calendar.getInstance();
        fin = Calendar.getInstance();
        fin.add(Calendar.DATE, retraso *2);
    }

    public Calendar getInicio() {
        return inicio;
    }

    public Calendar getFin() {
        return fin;
    }
}
