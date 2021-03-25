package com.company.Guia2.Ejercicio1;
import java.lang.String;

public class Libro {
    private String titulo;
    private double precio;
    private int stock;
    private Autor autor;

    public Libro() {
    }

    public Libro(String titulo, double precio, int stock, Autor autor) {
        this.titulo = titulo;
        this.precio = precio;
        this.stock = stock;
        this.autor = autor;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String cartel(){
        return "El Libro, " + titulo  +
                " de " + this.autor.getNombre() +
                ". Se vende a " + precio +
                " pesos." ;
    }



    @Override
    public String toString() {
        return "Libro{" +
                "titulo='" + titulo + '\'' +
                ", precio=" + precio +
                ", stock=" + stock +
                ", autor='" + autor + '\'' +
                '}';
    }
}
