package com.company.ParcialInstrumentosMusicales;

public class Instrumento {
    private double precio;
    private String marca;

    public Instrumento() {
    }

    public Instrumento(String marca) {
        this.marca = marca;
    }

    public Instrumento(double precio, String marca) {
        this.precio = precio;
        this.marca = marca;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
    public void incrementarPrecio(double porcentaje){
        this.setPrecio(this.getPrecio()*(1+porcentaje/100));
    }

    @Override
    public String toString() {
        return "Instrumento{" +
                " precio= " + precio +
                " marca= " + marca ;
    }
}
