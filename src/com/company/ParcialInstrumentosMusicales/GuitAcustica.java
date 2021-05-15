package com.company.ParcialInstrumentosMusicales;

public class GuitAcustica extends Cuerda{
    private String tipoMadera;

    public GuitAcustica() {
    }

    public GuitAcustica(double precio, String marca, int nroCuerdas, String tipoMadera) {
        super(precio, marca, nroCuerdas);
        this.tipoMadera = tipoMadera;
    }

    public String getTipoMadera() {
        return tipoMadera;
    }

    public void setTipoMadera(String tipoMadera) {
        this.tipoMadera = tipoMadera;
    }

    @Override
    public String toString() {
        return "GuitAcustica{ "+super.toString() +
                " tipoMadera= " + tipoMadera + '\'' +
                " }";
    }
}
