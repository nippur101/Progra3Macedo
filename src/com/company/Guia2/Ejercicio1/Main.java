package com.company.Guia2.Ejercicio1;

public class Main {

    public static void main(String[] args) {
        //a)b)
        Autor au1=new Autor("Joshua","Blosh","joashua@email.com",'M');
        System.out.println(au1);
        //c)d)
        Libro libr1=new Libro("Efective Java", 450.0,150,au1);
        System.out.println(libr1);
        //e)
        libr1.setPrecio(500);
        System.out.println(libr1);
        libr1.setStock(200);
        System.out.println(libr1);
        //f)
        System.out.println(libr1.getAutor());
        System.out.println(libr1.cartel());

    }
}
