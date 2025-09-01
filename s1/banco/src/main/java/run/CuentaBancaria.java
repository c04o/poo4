package run;

public class CuentaBancaria {
    String titular;
    double saldo;

    public CuentaBancaria(String titular, double saldo)
    {
        this.saldo = saldo;
        this.titular = titular;
        System.out.println("Se creo la cuenta con titular: " + this.titular + " y saldo: " + this.saldo + "C$");
    }

    public void depositarDinero(double cargo)
    {
        this.saldo += cargo;
        System.out.println("Se depositaron " + cargo + "C$ de manera exitosa.");
    }

    public void retirarDinero(double retiro)
    {
        this.saldo -= retiro;
        System.out.println("Se retiraron " + retiro + "C$ de manera exitosa.");
    }

    public double obtenerSaldo()
    {
        return saldo;
    }
}2