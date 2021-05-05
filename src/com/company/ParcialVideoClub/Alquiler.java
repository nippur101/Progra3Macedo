package com.company.ParcialVideoClub;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

public class Alquiler {
    private String id;
    private String titulo;
    private boolean entregado=false;
    private String genero;
    private List<String> fecha=new ArrayList<>();
    private int nroCopias;
    public Alquiler() {
    }

    public Alquiler(String titulo) {
        this.titulo = titulo;
    }

    public Alquiler( String titulo, String genero, int nroCopias) {
        this.id = UUID.randomUUID().toString().toUpperCase().substring(0,6);;
        this.titulo = titulo;
        this.genero = genero;
        this.fecha = fecha;
        this.nroCopias = nroCopias;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public List<String> getFecha() {
        return fecha;
    }

    public void setFecha(List<String> fecha) {
        this.fecha = fecha;
    }

    public int getNroCopias() {
        return nroCopias;
    }

    public void setNroCopias(int nroCopias) {
        this.nroCopias = nroCopias;
    }
    public void entregado(){
        this.entregado=true;
    }
    public void devolver(){
        this.entregado=false;
    }
    public boolean isEntregado(){
        return this.entregado;
    }




    @Override
    public String toString() {
        return "Alquiler{" +
                " id= " + id + "| nombre= " + titulo +'\'' +
                ", entregado= " + entregado +
                ", genero= " + genero + '\''+
                ", nroCopias= " + nroCopias + '\'' ;
    }
}
