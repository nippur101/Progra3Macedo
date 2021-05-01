package com.company.ParcialFornite;

import java.util.Objects;

public class Entrenador extends Plantel {
    private int aniosExp;

    public Entrenador() {
    }


    public Entrenador(int aniosExp) {
        this.aniosExp = aniosExp;
    }

    public Entrenador(String nombre, String apellido, int edad, String localidad, int aniosExp, String tipoMiembro) {
        super(nombre, apellido, edad, localidad, tipoMiembro);
        this.aniosExp = aniosExp;
    }

    public int getAniosExp() {
        return aniosExp;
    }

    public void setAniosExp(int aniosExp) {
        this.aniosExp = aniosExp;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Entrenador that = (Entrenador) o;
        return aniosExp == that.aniosExp;
    }



    @Override
    public String toString() {
        return super.toString()+"\nEntrenador{" +
                "\naniosExp=" + aniosExp +
                '}';
    }
}
