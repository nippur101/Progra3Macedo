package com.company.Guia4;

import java.util.UUID;

public class Factura {
    private Cliente cliente;
    private String idFactura;
    private Pelicula pelicula;
    private String fechaRetiro;
    private String fechaDevolucion;

    public Factura() {
        this.idFactura = UUID.randomUUID().toString().toUpperCase().substring(0,6);
    }

    public Factura(Cliente cliente, String idFactura, Pelicula pelicula, String fechaRetiro, String fechaDevolucion) {
        this.cliente = cliente;
        this.idFactura = idFactura;
        this.pelicula = pelicula;
        this.fechaRetiro = fechaRetiro;
        this.fechaDevolucion = fechaDevolucion;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
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
        return "Factura{" +"Cliente="+cliente.toString()+
                "pelicula=" + pelicula +
                ", fechaRetiro='" + fechaRetiro + '\'' +
                ", fechaDevolucion='" + fechaDevolucion + '\'' +
                '}';
    }
}
