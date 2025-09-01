package run;

public class Main {
    public static void main(String[] args)
    {
        // Crear libro
        Libro libro = new Libro();

        // Asignarle atributos
        libro.titulo = "Crímen y Castigo";
        libro.autor = "Fiódor Dostoyevski";
        libro.paginas = 648;

        // Mostrar sus datos
        System.out.println("Datos del libro: " + libro.mostrarDatos());
    }
}