public class Libro {
    String titulo;
    Integer anio;
    Autor autor;
    Categoria categoria;
    String editorial;

    public Libro(String titulo, Integer anio, Autor autor, Categoria categoria, String editorial){
        this.titulo = titulo;
        this.anio = anio;
        this.autor = autor;
        this.categoria = categoria;
        this.editorial = editorial;
    }

    public Autor getAutor() {
        return autor;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public Integer getAnio() {
        return anio;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getEditorial() {
        return editorial;
    }
}
