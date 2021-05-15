package com.company.ParcialInstrumentosMusicales;

public class GuitElectrica extends Cuerda implements Electrico{
    private String nombreModelo;

    public GuitElectrica() {
    }

    public GuitElectrica(double precio, String marca, int nroCuerdas, String nombreModelo) {
        super(precio, marca, nroCuerdas);
        this.nombreModelo = nombreModelo;
    }

    public String getNombreModelo() {
        return nombreModelo;
    }

    public void setNombreModelo(String nombreModelo) {
        this.nombreModelo = nombreModelo;
    }

    public void sonidoAmplificado(){
        System.out.println("GUITARRA ELECTRICA: SONIDO AMPLIFICADO");
    }
    @Override
    public String toString() {
        return " GuitElectrica{" +super.toString()+
                " nombreModelo= " + nombreModelo + '\'' +
                " } ";
    }
}
