package com.company.ParcialAgroalimentaria;

public class Producto {
    private String codigoInterno;
    private String fechaCaducidad;
    private int nroLote;
    private String tipoProducto;

    public Producto() {
    }

    public Producto(String codigoInterno, String fechaCaducidad, int nroLote, String tipoProducto) {
        this.codigoInterno = codigoInterno;
        this.fechaCaducidad = fechaCaducidad;
        this.nroLote = nroLote;
        this.tipoProducto = tipoProducto;
    }

    public String getCodigoInterno() {
        return codigoInterno;
    }

    public void setCodigoInterno(String codigoInterno) {
        this.codigoInterno = codigoInterno;
    }

    public String getFechaCaducidad() {
        return fechaCaducidad;
    }

    public void setFechaCaducidad(String fechaCaducidad) {
        this.fechaCaducidad = fechaCaducidad;
    }

    public int getNroLote() {
        return nroLote;
    }

    public void setNroLote(int nroLote) {
        this.nroLote = nroLote;
    }

    public String getTipoProducto() {
        return tipoProducto;
    }

    public void setTipoProducto(String tipoProducto) {
        this.tipoProducto = tipoProducto;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "codigoInterno='" + codigoInterno + '\'' +
                ", fechaCaducidad='" + fechaCaducidad + '\'' +
                ", nroLote=" + nroLote +
                '}';
    }
}
