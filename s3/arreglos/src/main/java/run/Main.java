package run;

public class Main {
    public static void main(String[] args) {
        int[] edades = new int[3];
        edades[0] = 12;
        edades[1] = 16;
        edades[2] = 18;

        for (int edad: edades){
            String msn = edad + ", " + (edad >= 18 ? "Mayor de edad" : "Prende cam");
            System.out.println(msn);
        }
    }
}