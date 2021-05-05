package com.company.ParcialVideoClub;

import java.util.List;
import java.util.Objects;

public class Pelicula extends Alquiler{
    private String horasEstimadas;
    private String compania;

    public Pelicula() {
        this.horasEstimadas = "1 hora";
    }

    public Pelicula(String titulo, String horasEstimadas) {
        super(titulo);
        this.horasEstimadas = horasEstimadas;
    }

    public Pelicula( String titulo, String genero, int nroCopias, String horasEstimadas, String compania) {
        super( titulo, genero, nroCopias);
        this.horasEstimadas = horasEstimadas;
        this.compania = compania;
    }

    public String getHorasEstimadas() {
        return horasEstimadas;
    }

    public void setHorasEstimadas(String horasEstimadas) {
        this.horasEstimadas = horasEstimadas;
    }

    public String getCompania() {
        return compania;
    }

    public void setCompania(String compania) {
        this.compania = compania;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Pelicula)) return false;
        Pelicula pelicula = (Pelicula) o;
        return horasEstimadas.equals(pelicula.horasEstimadas);
    }

    @Override
    public int hashCode() {
        return Objects.hash(horasEstimadas);
    }

    @Override
    public String toString() {
        return "Pelicula{"+super.toString() +
                "horasEstimadas='" + horasEstimadas + '\'' +
                ", compania='" + compania + '\'' +
                '}';
    }
}
