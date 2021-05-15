package com.company.ParcialInstrumentosMusicales;

public class Bajo extends Cuerda implements Electrico{
    private String nombreModelo;

    public Bajo() {
    }

    public Bajo(double precio, String marca, int nroCuerdas, String nombreModelo) {
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
        System.out.println("BAJO: SONIDO AMPLIFICADO");
    }
    @Override
    public String toString() {
        return " Bajo{" +super.toString()+
                " nombreModelo= " + nombreModelo ;
    }
}
