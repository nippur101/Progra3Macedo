package com.company.ParcialAgroalimentaria;

public class Congelado extends Producto{
    private double tempCongelacion;

    public Congelado() {
    }

    public Congelado(String codigoInterno, String fechaCaducidad, int nroLote, String tipoProducto, double tempCongelacion) {
        super(codigoInterno, fechaCaducidad, nroLote, tipoProducto);
        this.tempCongelacion = tempCongelacion;
    }

    public double getTempCongelacion() {
        return tempCongelacion;
    }

    public void setTempCongelacion(double tempCongelacion) {
        this.tempCongelacion = tempCongelacion;
    }

    @Override
    public String toString() {
        return "Congelado{" +super.toString()+
                "tempCongelacion=" + tempCongelacion +
                '}';
    }
}
