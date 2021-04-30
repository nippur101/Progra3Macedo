package com.company.ParcialEmpresa;

public class Particular extends Cliente{
    private String nombre;

    public Particular() {
    }

    public Particular(String direccion, String telefono, String nombre) {
        super(direccion, telefono);
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Particular{" +
                "nombre='" + nombre + '\'' +
                '}';
    }
}
