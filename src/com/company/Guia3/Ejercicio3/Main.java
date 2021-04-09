package com.company.Guia3.Ejercicio3;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Figuras> arr=new ArrayList<>();

        Circulo c1= new Circulo("Rojo",2);
        Circulo c2= new Circulo("verde",3);
        Rectangulo r1=new Rectangulo("Amarillo",6,4);
        Rectangulo r2=new Rectangulo("Naranja",11,5);
        arr.add(c1);
        arr.add(c2);
        arr.add(r1);
        arr.add(r2);
        for(Figuras f:arr){
            if(f instanceof Circulo) {
                System.out.println("Color = " + f.getColor() + " Area : " + f.area());
            }
        }

        System.out.println();


    }
}
