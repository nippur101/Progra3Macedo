package com.company.ParcialAgroalimentaria;

public class Fresco extends Producto{
    private String fechaEnvasado;
    private String paisOrigen;

    public Fresco() {
    }

    public Fresco(String codigoInterno, String fechaCaducidad, int nroLote, String tipoProducto, String fechaEnvasado, String paisOrigen) {
        super(codigoInterno, fechaCaducidad, nroLote, tipoProducto);
        this.fechaEnvasado = fechaEnvasado;
        this.paisOrigen = paisOrigen;
    }

    public String getFechaEnvasado() {
        return fechaEnvasado;
    }

    public void setFechaEnvasado(String fechaEnvasado) {
        this.fechaEnvasado = fechaEnvasado;
    }



    @Override
    public String toString() {
        return "Fresco{" +
                "fechaEnvasado='" + fechaEnvasado + '\'' +
                ", paisOrigen='" + paisOrigen + '\'' +
                '}';
    }
}
