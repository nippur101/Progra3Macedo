package com.company.Guia3.Ejercicio1;

public class Circulo {
    private double radio;
    private String color;

    public Circulo() {
        this.radio = 1.0;
        this.color = "Rojo";
    }
    public Circulo(double radio) {
        this.radio = radio;
        this.color = "Rojo";
    }

    public Circulo(double radio, String color) {
        this.radio = radio;
        this.color = color;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public double areaCirculo(){
        return  Math.PI*Math.pow(radio,2);
    }

    @Override
    public String toString() {
        return "\nCirculo{" +
                "  radio=" + radio +
                "\n  color='" + color + '\'' +"\n  area='" + this.areaCirculo()+
        '}';
    }
}
