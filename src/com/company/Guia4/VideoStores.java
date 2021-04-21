package com.company.Guia4;

import java.util.ArrayList;
import java.util.Collections;

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




}
