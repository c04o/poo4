package run;

public class CuentaBancaria {
    String titular;
    double saldo;

    public CuentaBancaria(String titular, double saldo)
    {
        this.saldo = saldo;
        this.titular = titular;
        System.out.println("Titular: " + this.titular + ". Saldo: C$" + this.saldo);
    }

    public void depositar(double monto)
    {
        this.saldo += monto;
        System.out.println("Se depositaron C$" + monto);
    }

    public void retirar(double monto)
    {
        this.saldo -= monto;
        System.out.println("Se retiraron C$" + monto);
    }

    public double obtenerSaldo()
    {
        return saldo;
    }
}