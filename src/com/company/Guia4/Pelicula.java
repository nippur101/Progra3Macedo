package com.company.Guia4;

public class Pelicula {
    private static int count = 0;

    private int idPelicula=0;
    private String genero;
    private String titulo;
    private String fechaLanzamiento;
    private int duracion;
    private String clasificacionAudiencia;
    private String pais;
    private String descripcion;
    private int nroCopias;
    private int nroAlquileres;


    public Pelicula() {
        this.idPelicula=count++;
    }

    public Pelicula( String genero, String titulo, String fechaLanzamiento, int duracion, String clasificacionAudiencia, String pais, String descripcion, int nroCopias) {
        this.idPelicula=count++;
        this.genero = genero;
        this.titulo = titulo;
        this.fechaLanzamiento = fechaLanzamiento;
        this.duracion = duracion;
        this.clasificacionAudiencia = clasificacionAudiencia;
        this.pais = pais;
        this.descripcion = descripcion;
        this.nroCopias = nroCopias;
        this.nroAlquileres=nroAlquileres;
    }

    public int getIdPelicula() {
        return idPelicula;
    }

    public void setIdPelicula(int idPelicula) {
        this.idPelicula = idPelicula;
    }


    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getFechaLanzamiento() {
        return fechaLanzamiento;
    }

    public void setFechaLanzamiento(String fechaLanzamiento) {
        this.fechaLanzamiento = fechaLanzamiento;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public String getClasificacionAudiencia() {
        return clasificacionAudiencia;
    }

    public void setClasificacionAudiencia(String clasificacionAudiencia) {
        this.clasificacionAudiencia = clasificacionAudiencia;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getNroCopias() {
        return nroCopias;
    }

    public void setNroCopias(int nroCopias) {
        this.nroCopias = nroCopias;
    }

    public int getNroAlquileres() {
        return nroAlquileres;
    }

    public void setNroAlquileres(int nroAlquileres) {
        this.nroAlquileres = nroAlquileres;
    }

    @Override
    public String toString() {
        return "Pelicula{" +
                "genero='" + genero + '\'' +
                ", titulo='" + titulo + '\'' +
                ", fechaLanzamiento='" + fechaLanzamiento + '\'' +
                ", duarcaion=" + duracion +
                ", clasificacionAudiencia='" + clasificacionAudiencia + '\'' +
                ", pais='" + pais + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", nroCopias=" + nroCopias +"Nro ALQUILERES"+nroAlquileres+
                '}';
    }
}
