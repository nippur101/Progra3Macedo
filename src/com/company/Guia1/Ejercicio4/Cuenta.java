package com.company.Guia1.Ejercicio4;

public class Cuenta {
    private int nroCuenta;
    private String nombre;
    private double balance;

    public Cuenta() {
    }

    public Cuenta(int nroCuenta, String nombre, double balance) {
        this.nroCuenta = nroCuenta;
        this.nombre = nombre;
        this.balance = balance;
    }

    public int getNroCuenta() {
        return nroCuenta;
    }

    public void setNroCuenta(int nroCuenta) {
        this.nroCuenta = nroCuenta;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
    double credito(double deposito){
        return this.balance=this.balance+deposito;
    }

    double debito(double extraccion){
        if(this.balance<extraccion){
            System.out.println("Fondos insuficientes, la operacion no puede realizarse");
        }else{
            this.balance=this.balance-extraccion;
        }
        return this.balance;
    }


    @Override
    public String toString() {
        return "Cuenta{" +
                "nroCuenta=" + nroCuenta +
                ", nombre='" + nombre + '\'' +
                ", balance=" + balance +
                '}';
    }
}
