package com.company.ParcialFornite;

import java.util.Objects;

public class SoporteTec extends Plantel{
    private String areaEspecializacion;

    public SoporteTec() {
    }

    public SoporteTec(String nombre, String apellido, int edad, String localidad, String areaEspecializacion, String tipoMiembro) {
        super(nombre, apellido, edad, localidad, tipoMiembro);
        this.areaEspecializacion = areaEspecializacion;
    }

    public String getAreaEspecializacion() {
        return areaEspecializacion;
    }

    public void setAreaEspecializacion(String areaEspecializacion) {
        this.areaEspecializacion = areaEspecializacion;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        SoporteTec that = (SoporteTec) o;
        return Objects.equals(areaEspecializacion, that.areaEspecializacion);
    }


    @Override
    public String toString() {
        return super.toString()+"\nSoporteTec{" +
                "\nareaEspecializacion='" + areaEspecializacion + '\'' +
                '}';
    }
}
