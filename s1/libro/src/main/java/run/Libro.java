package run;

public class Libro {
    String titulo;
    String autor;
    int paginas;

    public String mostrarDatos()
    {
        return String.format("Titulo: %s, Autor: %s, Páginas: %d.", titulo, autor, paginas);
    }
}