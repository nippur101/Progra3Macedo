package com.company.Guia1.Ejercicio1;

public class Rectangulo {
    private double ancho=1.0;
    private double alto=1.0;

    public Rectangulo(){

    }
    public Rectangulo(double alto, double ancho){
        this.alto=alto;
        this.ancho=ancho;
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public double getAlto() {
        return alto;
    }

    public void setAlto(double alto) {
        this.alto = alto;
    }

    public String areaYperimetro(){
        double area=0,perimetro=0;
        area=this.alto*this.ancho;
        perimetro=2*this.alto+2*this.ancho;
        return "El area es de : "+area+" y el perimetro es de: "+perimetro;
    }
    @Override
    public String toString() {
        return "Rectangulo{" +
                "ancho=" + ancho +
                ", alto=" + alto +
                '}';
    }
}