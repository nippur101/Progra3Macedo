package com.company.Guia4;

public class Factura extends Cliente{
    private Pelicula pelicula;
    private String fechaRetiro;
    private String fechaDevolucion;

    public Factura() {
    }

    public Factura(String nombre, String telefono, String direccion, Pelicula pelicula, String fechaRetiro, String fechaDevolucion) {
        super(nombre, telefono, direccion);
        this.pelicula = pelicula;
        this.fechaRetiro = fechaRetiro;
        this.fechaDevolucion = fechaDevolucion;
    }

    public Pelicula getPelicula() {
        return pelicula;
    }

    public void setPelicula(Pelicula pelicula) {
        this.pelicula = pelicula;
    }

    public String getFechaRetiro() {
        return fechaRetiro;
    }

    public void setFechaRetiro(String fechaRetiro) {
        this.fechaRetiro = fechaRetiro;
    }

    public String getFechaDevolucion() {
        return fechaDevolucion;
    }

    public void setFechaDevolucion(String fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }

    @Override
    public String toString() {
        return "Factura{" +
                "pelicula=" + pelicula +
                ", fechaRetiro='" + fechaRetiro + '\'' +
                ", fechaDevolucion='" + fechaDevolucion + '\'' +
                '}';
    }
}
