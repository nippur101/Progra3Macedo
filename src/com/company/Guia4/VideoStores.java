package com.company.Guia4;

import java.util.ArrayList;

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
        for(Alquiler a:alquileres){
            System.out.println(a.toString());
        }
    }

    public void consultarAlquileresCliente(Cliente client){
        for(Alquiler a:alquileres){
            if(a.getCliente().equals(client)){
                System.out.println(a.toString());

            }
        }
    }




}
