package com.company.ParcialVideoClub;

import java.util.ArrayList;
import java.util.List;

public class VideoClub {
    private List<Alquiler> elementos=new ArrayList<>();

    public VideoClub() {
    }

    public VideoClub(List<Alquiler> elementos) {
        this.elementos = elementos;
    }

    public List<Alquiler> getElementos() {
        return elementos;
    }

    public void setElementos(List<Alquiler> elementos) {
        this.elementos = elementos;
    }
    public void agregarJuego(String titulo,String genero,int nroCopias,String duracion,String creador){
        boolean validacion=true;
        for(Alquiler a:elementos){
            if(a.equals(duracion)){
                validacion=false;
            }
        }
        if(validacion==true){
            Juego j=new Juego(titulo,genero,nroCopias,duracion,creador);
            elementos.add(j);
        }else{
            System.out.println("El juego ya se encuentra en el catalogo");
        }


    }
    public void agregarPelicula(String titulo,String genero,int nroCopias,String horasEstimadas,String compania){
        boolean validacion=true;
        for(Alquiler a:elementos){
            if(a.equals(horasEstimadas)){
                validacion=false;
            }
        }
        if(validacion==true){
            Pelicula j=new Pelicula(titulo,genero,nroCopias,horasEstimadas,compania);
            elementos.add(j);
        }else{
            System.out.println("El juego ya se encuentra en el catalogo");
        }

    }
    public void quitarCopia(Alquiler elemento){
        if(elemento.getNroCopias()>1){
            elemento.setNroCopias(elemento.getNroCopias()-1);
        }else{
            elementos.remove(elemento);
        }
    }
    public void eliminarElemento(String titulo){
        boolean validacion=true;
        for (Alquiler a:elementos){
            if(titulo.equals(a.getTitulo())){
                this.quitarCopia(a);
            }
        }
    }
    public void listarPeliculas(){
        System.out.println("\n===========Litado de Peliculas=============\n");
        for(Alquiler p:elementos){
            if(p instanceof Pelicula){
                System.out.println(p.toString());
            }
        }
    }
    public void listarJuegos(){
        System.out.println("\n===========Litado de Juegos=============\n");
        for(Alquiler p:elementos){
            if(p instanceof Juego){
                System.out.println(p.toString());
            }
        }
    }
    public int sumarizar(){
        int suma=0;
        for(Alquiler a:elementos){
            suma+=a.getNroCopias();
        }
        return suma;
    }
}
