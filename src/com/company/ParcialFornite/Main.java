package com.company.ParcialFornite;

import com.company.ParcialEmpresa.*;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Entrenador e=new Entrenador("Carlos","Bilardo",74,"Rosario",37,TipoMiembro.ENTRENADOR);
        Jugador j1=new Jugador("Diego","Maradona",32,"Buenos Aires",PosicionJugador.TIRADOR,"Duraznito",268,TipoMiembro.JUGADOR);
        Jugador j2=new Jugador("Jorge","Burruchaga",28,"Buenos Aires",PosicionJugador.RECOLECTOR,"El Burru",200,TipoMiembro.JUGADOR);
        Jugador j3=new Jugador("Luis","Islas",26,"Buenos Aires",PosicionJugador.SOPORTER,"El Loco",213,TipoMiembro.JUGADOR);
        Jugador j4=new Jugador("Oscar","Rugieri",25,"Buenos Aires",PosicionJugador.RECOLECTOR,"El Cabezon",202,TipoMiembro.JUGADOR);
        SoporteTec s1=new SoporteTec("Nestor","Clausen",19,"Santa Fe","Maquinas",TipoMiembro.SOPORTETEC);
        SoporteTec s2=new SoporteTec("Nery","Pumpido",20,"Rosario","Perifericos",TipoMiembro.SOPORTETEC);
        List<Plantel> plantel=new ArrayList<>();
        plantel.add(j1);
        plantel.add(j2);
        plantel.add(j3);
        plantel.add(j4);
        plantel.add(e);
        plantel.add(s1);
        plantel.add(s2);
       /* for(Plantel p:plantel){
            System.out.println(p);
        }*/

        for(Plantel p:plantel){
            if(p instanceof Jugador){
                System.out.println(p);
            }
        }




        //j1.agregarVictoria();
        //System.out.println(j1.getCantidadVictiorias());


    }
}
