package com.company.ParcialFornite;

import java.util.Objects;

public class Plantel {
    private String nombre;
    private String apellido;
    private int edad;
    private String localidad;
    private String tipoMiembro;

    public Plantel() {
    }

    public Plantel(String nombre, String apellido, int edad, String localidad,String tipoMiembro) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.localidad = localidad;
        this.tipoMiembro=tipoMiembro;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public String getTipoMiembro() {
        return tipoMiembro;
    }

    public void setTipoMiembro(String tipoMiembro) {
        this.tipoMiembro = tipoMiembro;
    }





    @Override
    public String toString() {
        return
                "\nnombre='" + nombre + '\'' +
                "\napellido='" + apellido + '\'' +
                "\nedad=" + edad +
                "\nlocalidad='" + localidad + '\'' +
                '}';
    }
}
