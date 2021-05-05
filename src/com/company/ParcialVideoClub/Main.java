package com.company.ParcialVideoClub;

import com.company.ParcialFornite.*;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        VideoClub v=new VideoClub();
        v.agregarJuego("Fornite","Shooter",3,"40 horas","Epic");
        v.agregarJuego("Valheim","Survival",3,"80 horas","Steam");
        v.agregarJuego("Cyeberpunk2077","Rol",5,"50 horas","Blizzard");
        v.agregarPelicula("Duro de Matar","Accion",4,"2horas","20 century fox");
        v.agregarPelicula("Titanic","Romance",2,"3horas","Paramount Pictures");
        v.agregarPelicula("Guason","Drama",4,"2horas","WarnerBros");
        v.listarJuegos();
        v.listarPeliculas();
        v.eliminarElemento("Titanic");
        v.listarPeliculas();
        v.eliminarElemento("Titanic");
        v.listarPeliculas();
        System.out.println("Nro de titulos totales : "+v.sumarizar());

    }
}
