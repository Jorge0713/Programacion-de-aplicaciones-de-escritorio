package Banco;

public class Cuenta {
    private String numeroCuenta;
    private String nombre;
    double saldo;

    public void setNumeroCuenta(String Account) {
        this.numeroCuenta = Account;
    }

    public void setNombre(String name) {
        this.nombre = name;
    }

    public String getNombre() {
        return this.nombre;
    }

    public String getNumeroCuenta() {
        return this.numeroCuenta;
    }

    public void setSaldo(double sald) {
        this.saldo = sald;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public Cuenta(String numeroCuenta, String nombre, double saldo) {
        this.numeroCuenta = numeroCuenta;
        this.nombre = nombre;
        this.saldo = saldo;
    }
}
