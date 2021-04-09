package com.company.Guia3.Ejercicio3;

public class Circulo extends Figuras{
    private double radio;

    public Circulo() {
    }

    public Circulo(double radio) {
        this.radio = radio;
    }

    public Circulo(String color, double radio) {
        super(color);
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    public double area(){
        return Math.PI*Math.pow(radio,2);
    }
    public double perimetro(){
        return 2*Math.PI*radio;
    }

    @Override
    public String toString() {
        return "Circulo{" +
                "radio=" + radio +
                '}';
    }
}
