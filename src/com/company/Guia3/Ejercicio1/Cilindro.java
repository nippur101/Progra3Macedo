package com.company.Guia3.Ejercicio1;

import java.lang.management.MemoryType;

public class Cilindro extends Circulo {
    private double altura;

    public Cilindro() {
        this.altura = 1.0;
    }

    public Cilindro(double altura) {
        this.altura = altura;
    }
    public Cilindro(double radio, double altura) {
        super(radio);
        this.altura = altura;
    }
    public Cilindro(double radio, String color, double altura) {
        super(radio, color);
        this.altura = altura;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    public double volumen(){
        return super.areaCirculo()*this.altura;
    }
    public double areaCirculo(){
        return 2* Math.PI*super.getRadio()*altura+2*super.areaCirculo();
    }


    @Override
    public String toString() {
        return "Cilindro{" +
                "\n  altura=" + altura +"\n  Volumen :"+this.volumen()+"  "+super.toString()+
                "\n  Area de Cilindro: "+this.areaCirculo()+
                '}';
    }
}
