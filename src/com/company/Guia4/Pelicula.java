package com.company.Guia4;

public class Pelicula {
    private int idPelicula;
    private String genero;
    private String titulo;
    private String fechaLanzamiento;
    private int duarcaion;
    private String clasificacionAudiencia;
    private String pais;
    private String descripcion;
    private int nroCopias;


    public Pelicula() {
    }

    public Pelicula(int idPelicula, String genero, String titulo, String fechaLanzamiento, int duarcaion, String clasificacionAudiencia, String pais, String descripcion, int nroCopias) {
        this.idPelicula = idPelicula;
        this.genero = genero;
        this.titulo = titulo;
        this.fechaLanzamiento = fechaLanzamiento;
        this.duarcaion = duarcaion;
        this.clasificacionAudiencia = clasificacionAudiencia;
        this.pais = pais;
        this.descripcion = descripcion;
        this.nroCopias = nroCopias;
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

    public int getDuarcaion() {
        return duarcaion;
    }

    public void setDuarcaion(int duarcaion) {
        this.duarcaion = duarcaion;
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

    @Override
    public String toString() {
        return "Pelicula{" +
                "genero='" + genero + '\'' +
                ", titulo='" + titulo + '\'' +
                ", fechaLanzamiento='" + fechaLanzamiento + '\'' +
                ", duarcaion=" + duarcaion +
                ", clasificacionAudiencia='" + clasificacionAudiencia + '\'' +
                ", pais='" + pais + '\'' +
                ", descripcion='" + descripcion + '\'' +
                '}';
    }
}
