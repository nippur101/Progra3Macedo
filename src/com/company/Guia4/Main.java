package com.company.Guia4;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String nombre;
        boolean existe =false;

        Pelicula p1=new Pelicula(Genero.accion, "Duro de Matar","1988",139,"R","Estados Unidos","John McClane, policía de Nueva York, llega a Los Ángeles para celebrar la Navidad, pero se ve envuelto en una lucha contra un grupo de malhechores que toman de rehén a su esposa en un rascacielos, el Nakatomi Plaza.",4);
        Pelicula p2=new Pelicula(Genero.accion, "Duro de Matar 2","1990",124,"R","Estados Unidos","Un policía de Los Ángeles pelea contra una banda de terroristas que han tomado el aeropuerto de Washington D. C.",2);
        Pelicula p3=new Pelicula(Genero.drama, "Titanic","1997",195,"PG-13","Estados Unidos","Una joven de la alta sociedad abandona a su arrogante pretendiente por un artista humilde en el trasatlántico que se hundió durante su viaje inaugural.",4);
        Pelicula p4=new Pelicula(Genero.drama, "Guason","2019",122,"R","Estados Unidos","Arthur Fleck adora hacer reír a la gente, pero su carrera como comediante es un fracaso. El repudio social, la marginación y una serie de trágicos acontecimientos lo conducen por el sendero de la locura y, finalmente, cae en el mundo del crimen.",4);
        Pelicula p5=new Pelicula(Genero.accion, "John Wick","2014",114,"R","Estados Unidos","John Wick es una franquicia de medios de acción y suspenso neo-noir estadounidense",4);

        Cliente c1=new Cliente("Juan Perez","4875552","Juan B justo 116");
        Cliente c2=new Cliente("Melina Lopez","4165555","moreno2233");
        Cliente c3=new Cliente("Matias Dow","4858655","Santiago del Estero 4455");
        Cliente c4=new Cliente("JHernan Moyano","469885","Peralta Ramos 6465");
        Cliente c5=new Cliente("Julian Mendez","4532311","Acha 223");

        Alquiler a1=new Alquiler(p1,c2,"12/4/2021","17/4/2021" );
        Alquiler a2=new Alquiler(p2,c3,"13/4/2021","18/4/2021" );
        Alquiler a3=new Alquiler(p3,c1,"14/4/2021","19/4/2021" );
        Alquiler a4=new Alquiler(p4,c4,"15/4/2021","20/4/2021" );
        Alquiler a5=new Alquiler(p5,c1,"15/4/2021","20/4/2021" );
        Alquiler a6=new Alquiler(p4,c1,"15/4/2021","20/4/2021" );
        Alquiler a7=new Alquiler(p1,c1,"15/4/2021","20/4/2021" );
        Alquiler a8=new Alquiler(p1,c2,"15/4/2021","20/4/2021" );
        Alquiler a9=new Alquiler(p4,c4,"15/4/2021","20/4/2021" );
        Alquiler a10=new Alquiler(p5,c1,"15/4/2021","20/4/2021" );
        Alquiler a11=new Alquiler(p4,c1,"15/4/2021","20/4/2021" );
        Alquiler a12=new Alquiler(p4,c4,"15/4/2021","20/4/2021" );
        Alquiler a13=new Alquiler(p5,c1,"15/4/2021","20/4/2021" );
        Alquiler a14=new Alquiler(p4,c1,"15/4/2021","20/4/2021" );

        VideoStores v=new VideoStores();
        ArrayList<Pelicula> pelis=new ArrayList<>();
        ArrayList<Cliente> cliens=new ArrayList<>();
        ArrayList<Alquiler> alqui=new ArrayList<>();
        pelis.add(p1);
        pelis.add(p2);
        pelis.add(p3);
        pelis.add(p4);
        pelis.add(p5);
        cliens.add(c1);
        cliens.add(c2);
        cliens.add(c3);
        cliens.add(c4);
        cliens.add(c5);
        alqui.add(a1);
        alqui.add(a2);
        alqui.add(a3);
        alqui.add(a4);
        alqui.add(a5);
        alqui.add(a6);
        alqui.add(a7);
        alqui.add(a8);
        alqui.add(a9);
        alqui.add(a10);
        alqui.add(a11);
        alqui.add(a12);
        alqui.add(a13);
        alqui.add(a14);



        v.setClientes(cliens);
        v.setPeliculas(pelis);
        v.setAlquileres(alqui);



        //nombre = "Juan Lopez";

        //System.out.println(v.existeCliente(nombre));
        //v.mostrarAlquilerVigente();
       // v.consultarAlquileresCliente(c1);
        for (Pelicula p: v.ordenarPeliculas()){
            System.out.println(p.getTitulo());
        }
        //System.out.println(p1.toString());





    }
}
