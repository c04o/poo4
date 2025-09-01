
package run;

public class Main {
    public static void main(String[] args)
    {
        // Crear nuevo coche
        Coche coche = new Coche();

        // Asignarle datos
        coche.marca = "Chery";
        coche.modelo = "Tiggo8";
        coche.anio = 2025;

        // Usar método
        System.out.println(coche.mostrarDatos());
    }
}
