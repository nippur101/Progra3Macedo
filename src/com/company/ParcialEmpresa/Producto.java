package com.company.ParcialEmpresa;

public class Producto {
    private int numStock;
    private String nombre;
    private double precio;

    public Producto() {
    }

    public Producto(int numStock, String nombre, double precio) {
        this.numStock = numStock;
        this.nombre = nombre;
        this.precio = precio;
    }

    public int getNumStock() {
        return numStock;
    }

    public void setNumStock(int numStock) {
        this.numStock = numStock;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    public boolean ventaProducto(int vendidos){

        if(vendidos<=numStock) {
            numStock = numStock - vendidos;
            return true;
        }

        return false;
    }

    @Override
    public String toString() {
        return "Productos{"+ nombre + '\'' +
                ", precio=" + precio +
                '}';
    }
}
