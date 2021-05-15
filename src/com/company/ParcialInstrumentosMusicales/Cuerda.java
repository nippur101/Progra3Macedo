package com.company.ParcialInstrumentosMusicales;

public class Cuerda extends Instrumento {
    private int nroCuerdas;

    public Cuerda() {
    }

    public Cuerda(double precio, String marca, int nroCuerdas) {
        super(precio, marca);
        this.nroCuerdas = nroCuerdas;
    }

    public int getNroCuerdas() {
        return nroCuerdas;
    }

    public void setNroCuerdas(int nroCuerdas) {
        this.nroCuerdas = nroCuerdas;
    }

    @Override
    public String toString() {
        return "Cuerda{" +super.toString()+
                " nroCuerdas= " + nroCuerdas +
                " }";
    }
}
