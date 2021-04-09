package com.company.Guia3.Ejercicio3;

public abstract class Figuras {
    private String color;

    public Figuras() {
    }

    public Figuras(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public abstract double area();
    public abstract double perimetro();

    @Override
    public String toString() {
        return "Figuras{" +
                "color='" + color + '\'' +
                '}';
    }
}
