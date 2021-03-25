package com.company.Guia1.Ejercicio3;

public class Item {
    private int identificador;
    private String descripcion;
    private int cantidad;
    private double pUnitario;
    private double pTotal;

    public Item() {
    }

    public Item(int identificador, String descripcion, int cantidad, double pUnitario) {
        this.identificador = identificador;
        this.descripcion = descripcion;
        this.cantidad = cantidad;
        this.pUnitario = pUnitario;
        this.pTotal=cantidad*pUnitario;
    }

    public int getIdentificador() {
        return identificador;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getpUnitario() {
        return pUnitario;
    }

    public void setpUnitario(double pUnitario) {
        this.pUnitario = pUnitario;
    }

    public double getpTotal() {
        return pTotal;
    }

    public void setpTotal(double pTotal) {
        this.pTotal = pTotal;
    }


    @Override
    public String toString() {
        return "Item[" +
                "identificador=" + identificador +
                ", descripcion='" + descripcion + '\'' +
                ", cantidad=" + cantidad +
                ", pUnitario=" + pUnitario +
                ", pTotal=" + pTotal +
                ']';
    }
}
