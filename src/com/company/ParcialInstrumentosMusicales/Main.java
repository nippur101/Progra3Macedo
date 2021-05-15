package com.company.ParcialInstrumentosMusicales;

import com.company.ParcialFornite.*;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Baterias bat1=new Baterias("Sonor",4,3);
        Baterias bat2=new Baterias("Pearl",2,2);
        Baterias bat3=new Baterias("Yamaha",3,3);
        Baterias bat4=new Baterias("Mapex",2,1);
        Bajo baj1=new Bajo(22000,"Fender",4,"Electrico");
        Bajo baj2=new Bajo(30000,"Ibañex",4,"Recital");
        Bajo baj3=new Bajo(25000,"Warwick",4,"Orquesta");
        GuitAcustica guiA1=new GuitAcustica(33000,"Fender",6,"Caoba");
        GuitAcustica guiA2=new GuitAcustica(44000,"Area",6,"Roble");
        GuitAcustica guiA3=new GuitAcustica(45000,"BreadLove",6,"Nogal");
        GuitElectrica guiE1=new GuitElectrica(55000,"fender",6,"Destroyer");
        GuitElectrica guiE2=new GuitElectrica(65000,"Gibson",6,"FlayinV");
        GuitElectrica guiE3=new GuitElectrica(35000,"yamaha",6,"Superstar");
        List<Instrumento> instrumentos=new ArrayList<>();
        instrumentos.add(bat1);
        instrumentos.add(bat2);
        instrumentos.add(bat3);
        instrumentos.add(baj1);
        instrumentos.add(baj2);
        instrumentos.add(baj3);
        instrumentos.add(guiA1);
        instrumentos.add(guiA2);
        instrumentos.add(guiA3);
        instrumentos.add(guiE1);
        instrumentos.add(guiE2);
        instrumentos.add(guiE3);
        System.out.println("\n=================Listado instrumentos===============\n");
        for(Instrumento i:instrumentos){
            System.out.println(i);
        }
        for(Instrumento i:instrumentos){
            if(i instanceof GuitElectrica){
                i.incrementarPrecio(5);

            }else if (i instanceof GuitAcustica){
                i.incrementarPrecio(10);

            }else if (i instanceof Baterias){
                i.incrementarPrecio(15);

            }else if (i instanceof Bajo) {
                i.incrementarPrecio(20);
            }
        }
        System.out.println("\n=================Listado instrumentos con precio Aumentado===============\n");
        for(Instrumento i:instrumentos){
            System.out.println(i);
        }
        System.out.println("\n=================Metodo Sonido Amplificado===============\n");
        guiE1.sonidoAmplificado();
        baj1.sonidoAmplificado();


       //System.out.println(bat1);


    }
}
