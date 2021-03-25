package com.company.Guia1.Ejercicio5;

public class Main {

    public static void main(String[] args) {
        Hora h=new Hora(24,3,12);
        System.out.println(h);
        h.segundoAvance();
        System.out.println("Avance un segundo");
        System.out.println(h);
        System.out.println("Retrocede un segundo");
        h.segundoRetroceso();
        System.out.println(h);
    }
}