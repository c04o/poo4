package run;

public class Estudiante {
    String nombre;
    String matricula;
    double promedio;

    // Constructor que falta
    public Estudiante(String nombre, String matricula, double promedio) {
        this.nombre = nombre;
        this.matricula = matricula;
        this.promedio = promedio;
    }

    public Boolean aprobado()
    {
        return promedio >= 70;
    }

    public String mostrarDatos()
    {
        return String.format("Nombre: %s, Matricula: %s, Promedio: %.1f", nombre, matricula, promedio);
    }
}