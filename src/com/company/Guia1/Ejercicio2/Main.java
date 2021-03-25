package com.company.Guia1.Ejercicio2;
import java.lang.String;


public class Main {
    public static void main(String[] args) {
        Empleado e1 = new Empleado(23456345,"Carlos","Gutierrez",25000);
        Empleado e2 = new Empleado(34234123,"Ana","Sanchez",27500);
        System.out.printf(e1.toString());
        System.out.printf(e2.toString());
        e1.incrementarSalario(15);
        System.out.printf(e1.toString());



    };
}
