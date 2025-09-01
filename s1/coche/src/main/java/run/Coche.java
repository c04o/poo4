package run;

public class Coche {
        String marca;
        String modelo;
        int anio;

        public String mostrarDatos()
        {
            return String.format("Marca: %s, Modelo: %s, Año: %d.", marca, modelo, anio);
        }
}
