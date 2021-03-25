package com.company.Guia1.Ejercicio4;

public class Main {

    public static void main(String[] args) {
        Cuenta c=new Cuenta(256,"Perez Juan",15500.0);
        System.out.println(c);
        System.out.println("Se agrega por credito 23000");
        c.credito(23000.0);
        System.out.println(c);
        System.out.println("Se hace una extraccion de 35000");
        c.debito(35000.0);
        System.out.println(c);
    }
}