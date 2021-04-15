package com.company.Guia4;

import java.util.UUID;

public class Factura extends Cliente{
    private String idFactura;
    private Pelicula pelicula;
    private String fechaRetiro;
    private String fechaDevolucion;

    public Factura() {
        this.idFactura = UUID.randomUUID().toString().toUpperCase().substring(0,6);
    }

    public Factura(String idCliente, String nombre, String telefono, String direccion, String idFactura, Pelicula pelicula, String fechaRetiro, String fechaDevolucion) {
        super(idCliente, nombre, telefono, direccion);
        this.idFactura = idFactura;
        this.pelicula = pelicula;
        this.fechaRetiro = fechaRetiro;
        this.fechaDevolucion = fechaDevolucion;
    }

    public String getIdFactura() {
        return idFactura;
    }

    public void setIdFactura(String idFactura) {
        this.idFactura = idFactura;
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
