package com.company.PersistenciaArchivos;


import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        MiClase c1=new MiClase("Javier",44);
        MiClase c2=new MiClase("Joaquin",5);
        MiClase c3=new MiClase("Julieta",8);
        MiClase c4=new MiClase("Johanna",34);
        MiClase c5=new MiClase("Pamela",34);
        List<MiClase> miCl=new ArrayList<>();
        miCl.add(c1);
        miCl.add(c2);
        miCl.add(c3);
        miCl.add(c4);
        miCl.add(c5);



        bits b=new bits(miCl);
        //b.escribir();
        b.leer();

    }
}
