package Clases;

import java.util.ArrayList;
import java.util.Random;

public class CuentaBancaria {
    
    private double saldo;
    private Persona titular;
    private int numeroCuenta;

    private static ArrayList<CuentaBancaria> listaDeCuentasBancarias = new ArrayList<>();

    public CuentaBancaria(double saldoInicial, Persona titular) {
        this.saldo = saldoInicial;
        this.titular = titular;
        this.numeroCuenta = generarNumeroDeCuenta();
        listaDeCuentasBancarias.add(this);
    }
    private int generarNumeroDeCuenta(){
        Random random = new Random();
        return 100000 + random.nextInt(900000);
    }
    public double getSaldo() {
        return saldo;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public Persona getTitular() {
        return titular;
    }
    public void setTitular(Persona titular) {
        this.titular = titular;
    }
    public int getNumeroCuenta() {
        return numeroCuenta;
    }
    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }
    public void depositar(double monto) {
        if (monto > 0) {
            saldo += monto;
            System.out.println("Deposito de $" + monto + " realizado en la cuenta " + numeroCuenta);
        }
    }
    public void retirar(double monto) {
        if (monto > 0 && monto <= saldo) {
            saldo -= monto;
            System.out.println("Retiro de $" + monto + " realizado en la cuenta " + numeroCuenta);
        } else {
            System.out.println("Fondos insuficientes en la cuenta " + numeroCuenta);
        }
    }
    public void despliegaInformacion() {
        System.out.println("Cuenta: " + numeroCuenta + ", Saldo: $" + saldo);
        System.out.print("Titular - ");
        titular.desplegarInformacion();
        System.out.println("----------------------------------");
    }
    public static void imprimeInformacionDeTodasLasCuentas() {
        System.out.println("--- Informacion de todas las cuentas bancarias ---");
        for (CuentaBancaria cuenta : listaDeCuentasBancarias) {
            cuenta.despliegaInformacion();
        }
    }

}
