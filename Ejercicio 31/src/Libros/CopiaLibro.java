package Libros;

public class CopiaLibro {
    private Integer identificador;
    private Libro libro;
    private EstadoCopia estado;


    public CopiaLibro(Integer identificador, Libro libro, EstadoCopia estado){
        this.identificador = identificador;
        this.libro = libro;
        this.estado = estado;
    }

    public boolean puedePrestarse(){
        return estado == EstadoCopia.EN_BIBLIOTECA;
    }

    public Integer getIdentificador() {
        return identificador;
    }

    public Libro getLibro() {
        return libro;
    }

    public EstadoCopia getEstado() {
        return estado;
    }

    public void setEstado(EstadoCopia estado) {//una manera de setear el estado en reparación
        this.estado = estado;
    }

}
