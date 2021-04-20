package com.company.Guia4;

public class Alquiler {
    private static int count = 0;
    private int idAlquiler=0;
    private Pelicula pelicula;
    private  Cliente cliente;
    private String fechaprestamo;
    private String fechadevolucion;

    public Alquiler() {
        this.idAlquiler = count++;
    }

    public Alquiler( Pelicula pelicula, Cliente cliente, String fechaprestamo, String fechadevolucion) {
        this.idAlquiler = count++;
        this.pelicula = pelicula;
        this.cliente = cliente;
        this.fechaprestamo = fechaprestamo;
        this.fechadevolucion = fechadevolucion;
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

    public int getIdAlquiler() {
        return idAlquiler;
    }

    public void setIdAlquiler(int idAlquiler) {
        this.idAlquiler = idAlquiler;
    }

    public String getFechaprestamo() {
        return fechaprestamo;
    }

    public void setFechaprestamo(String fechaprestamo) {
        this.fechaprestamo = fechaprestamo;
    }

    public String getFechadevolucion() {
        return fechadevolucion;
    }

    public void setFechadevolucion(String fechadevolucion) {
        this.fechadevolucion = fechadevolucion;
    }



    @Override
    public String toString() {
        return "Alquiler{" +
                "idAlquiler='" + idAlquiler + '\'' +
                "| pelicula=" + pelicula.getTitulo() +
                "| cliente=" + cliente.getNombre() +
                "| Fecha de prestamo='" + fechaprestamo + '\'' +
                "| Fecha de devolucion='" + fechadevolucion + '\'' +
                '}';
    }
}
