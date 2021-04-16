package com.company.Guia4;

public class Alquiler {
    private String idAlquiler;
    private Pelicula pelicula;
    private  Cliente cliente;
    private String fprestamo;
    private String fdevolucion;

    public Alquiler() {
    }

    public Alquiler(String idAlquiler, Pelicula pelicula, Cliente cliente, String fprestamo, String fdevolucion) {
        this.idAlquiler = idAlquiler;
        this.pelicula = pelicula;
        this.cliente = cliente;
        this.fprestamo = fprestamo;
        this.fdevolucion = fdevolucion;
    }

    public String getIdAlquiler() {
        return idAlquiler;
    }

    public void setIdAlquiler(String idAlquiler) {
        this.idAlquiler = idAlquiler;
    }

    public Pelicula getPelicula() {
        return pelicula;
    }

    public void setPelicula(Pelicula pelicula) {
        this.pelicula = pelicula;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public String getFprestamo() {
        return fprestamo;
    }

    public void setFprestamo(String fprestamo) {
        this.fprestamo = fprestamo;
    }

    public String getFdevolucion() {
        return fdevolucion;
    }

    public void setFdevolucion(String fdevolucion) {
        this.fdevolucion = fdevolucion;
    }

    @Override
    public String toString() {
        return "Alquiler{" +
                "idAlquiler='" + idAlquiler + '\'' +
                ", pelicula=" + pelicula +
                ", cliente=" + cliente +
                ", fprestamo='" + fprestamo + '\'' +
                ", fdevolucion='" + fdevolucion + '\'' +
                '}';
    }
}
