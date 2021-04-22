package com.company.Guia4;

import java.util.*;
import java.util.stream.Collectors;

public class VideoStores {
    private ArrayList<Pelicula> peliculas;
    private ArrayList<Cliente> clientes;
    private ArrayList<Alquiler> alquileres;

    public VideoStores() {
    }

    public ArrayList<Pelicula> getPeliculas() {
        return peliculas;
    }

    public void setPeliculas(ArrayList<Pelicula> peliculas) {
        this.peliculas = peliculas;
    }

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(ArrayList<Cliente> clientes) {
        this.clientes = clientes;
    }

    public ArrayList<Alquiler> getAlquileres() {
        return alquileres;
    }

    public void setAlquileres(ArrayList<Alquiler> alquileres) {
        this.alquileres = alquileres;
    }

    public boolean existeCliente(String nombre){

        for(Cliente c:clientes){
            if(c.getNombre().contains(nombre)){
                return true;
            }
        }
        return false;
    }

    public void  mostrarAlquilerVigente(){
        int cont=0;
        for(Alquiler a:alquileres){
            if(a.isEstado()==true & cont<10) {
                System.out.println(a.toString());
            }
        }
    }

    public void consultarAlquileresCliente(Cliente client){
        int cont=0;
        ArrayList<Alquiler> copia=new ArrayList<>();
        copia=alquileres;
        Collections.reverse(copia);
        for(Alquiler a:copia){
            if(a.getCliente().equals(client) & cont<10){
                System.out.println(a.toString());
                cont++;

            }
        }
    }

    public List<Pelicula> ordenarPeliculas(){
        List<Pelicula> pelisOrdenadas=peliculas;
        return pelisOrdenadas.stream()
                .sorted((Pelicula p1,Pelicula p2)->p2.getNroAlquileres() - p1.getNroAlquileres())
                .collect(Collectors.toList());
    }
    public List<Pelicula> ordenPorGenero(String genero){
        List<Pelicula> pelisGenero=new ArrayList<>();
        List<Pelicula> pelisOrdenadas=peliculas;
        pelisOrdenadas=this.ordenarPeliculas();
        for(Pelicula p:pelisOrdenadas){
            if(genero.equals(p.getGenero())){
                pelisGenero.add(p);
            }
        }
        return pelisGenero;
    }
    public String mostrarPelicula(String nombre){
        for(Pelicula p:peliculas){
            if(p.getTitulo().equals(nombre)){
                return p.toString();
            }
        }
        return null;
    }


}
