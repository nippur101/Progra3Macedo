package com.company.Guia2.Ejercicio3;

import java.util.ArrayList;
import java.util.ListIterator;
import java.util.SplittableRandom;

public class Cuenta {
    private String id;
    private double balance;
    private Cliente cliente;
    private ArrayList<String> resumenDepositos;
    private ArrayList<String> resumenExtracciones;
    private int nroDepositos;
    private int nroExtracciones;

    public Cuenta() {
        this.nroDepositos=0;
        this.nroExtracciones=0;
    }

    public Cuenta(String id, double balance, Cliente cliente) {
        this.id = id;
        this.balance = balance;
        this.cliente = cliente;
        this.resumenDepositos=new ArrayList<String>();
        this.resumenExtracciones=new ArrayList<String>();
        this.nroDepositos=0;
        this.nroExtracciones=0;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public ArrayList<String> getResumenDepositos() {
        return resumenDepositos;
    }

    public void setResumenDepositos(ArrayList<String> resumenDepositos) {
        this.resumenDepositos = resumenDepositos;
    }

    public ArrayList<String> getResumenExtracciones() {
        return resumenExtracciones;
    }

    public void setResumenExtracciones(ArrayList<String> resumenExtracciones) {
        this.resumenExtracciones = resumenExtracciones;
    }

    public int getNroDepositos() {
        return nroDepositos;
    }

    public void setNroDepositos(int nroDepositos) {
        this.nroDepositos = nroDepositos;
    }

    public int getNroExtracciones() {
        return nroExtracciones;
    }

    public void setNroExtracciones(int nroExtracciones) {
        this.nroExtracciones = nroExtracciones;
    }

    public void depositar(double deposito){
       this.balance=balance+deposito;
       this.resumenDepositos.add("Cliente: "+cliente.getNombre()+" Deposito: "+deposito);
       nroDepositos++;

    }
    public void extraccion(double dineroExtraer){
        if((balance-dineroExtraer)<0){
            System.out.println("FONDOS INSUFICIENTES");
        }else {
            this.balance=balance-dineroExtraer;
        }
    }
    public void listaDepositos(){
        ListIterator iter=resumenDepositos.listIterator(resumenDepositos.size());
        int cont=0;
        while(iter.hasPrevious() && cont<5){
            System.out.println(iter.previous());
            cont++;
        }
    }
    @Override
    public String toString() {
        return "Cuenta{" +
                "id='" + id + '\'' +
                ", balance=" + balance +
                ", cliente=" + cliente +
                '}';
    }
}
