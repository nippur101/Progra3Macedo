package com.company.Guia4;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String nombre;

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

        VideoStores v=new VideoStores();
        ArrayList<Pelicula> pelis=new ArrayList<>();
        ArrayList<Cliente> cliens=new ArrayList<>();
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
        v.setClientes(cliens);
        v.setPeliculas(pelis);


        Scanner entradaEscaner = new Scanner (System.in);
        nombre = entradaEscaner.nextLine ();
        boolean existe = v.getClientes().contains(nombre);

        System.out.println(existe);





    }
}
