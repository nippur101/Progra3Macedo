package com.company.ParcialVideoClub;

import java.util.List;
import java.util.Objects;

public class Juego extends Alquiler{
    private String duracion;
    private String creador;


    public Juego() {
        this.duracion = "10 Horas";
    }

    public Juego( String titulo, String creador) {
        super(titulo);
        this.creador = creador;
        this.duracion = "10 Horas";
    }

    public Juego( String titulo, String genero, int nroCopias, String duracion, String creador) {
        super( titulo, genero, nroCopias);
        this.duracion = duracion;
        this.creador = creador;
    }

    public String getDuracion() {
        return duracion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    public String getCreador() {
        return creador;
    }

    public void setCreador(String creador) {
        this.creador = creador;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Juego)) return false;
        Juego juego = (Juego) o;
        return duracion.equals(juego.duracion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(duracion);
    }

    @Override
    public String toString() {
        return "Juego{" +super.toString()+
                "duracion= " + duracion +
                ", creador= " + creador  +

                 '}';
    }
}
