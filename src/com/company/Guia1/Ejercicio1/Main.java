package com.company.Guia1.Ejercicio1;

public class Main {

    public static void main(String[] args) {
        Rectangulo r =new Rectangulo(40,20);
        System.out.println(r);
        System.out.println(r.areaYperimetro());
        Rectangulo r2=new Rectangulo();
        System.out.println(r2);
        System.out.println(r2.areaYperimetro());


    };
}