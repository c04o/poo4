package run;

public class Main {
    public static void main(String[] args)
    {
        // Crear cuenta
        CuentaBancaria miCuenta = new CuentaBancaria("Connie", 1000);

        // Usar métodos
        miCuenta.depositar(500);

        // Mostrar saldo
        System.out.println("Saldo: C$" + miCuenta.obtenerSaldo());

        miCuenta.retirar(600);

        // Mostrar saldo
        System.out.println("Saldo: C$" + miCuenta.obtenerSaldo());
    }
}