public class Libro {
    String titulo;
    String autor;
    int paginaCount;

    public Libro(String titulo, String autor, int paginaCount) {
        this.titulo = titulo;
        this.autor = autor;
        this.paginaCount = paginaCount;
    }

    public String infoLibro() {
        return "Titulo: " + titulo + ", Autor: " + autor + ", Paginas: " + paginaCount;
    }
}
