package run;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args)
    {
        ArrayList<Estudiante> estudiantes = new ArrayList<Estudiante>();
        estudiantes.add(new Estudiante("Valeria", "IND0414", 60.0));
        estudiantes.add(new Estudiante("Connie", "SIS0205", 65.5));
        estudiantes.add(new Estudiante("Dan", "SIS0202", 100.0));

        for(Estudiante estudiante : estudiantes)
        {
            /* Mostrar datos del estudiante */
            System.out.println("Datos del estudiante: " + estudiante.mostrarDatos());
            System.out.println( (estudiante.aprobado()) ? "Aprobó" : "Reprobó");
        }
    }
}