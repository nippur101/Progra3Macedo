package com.company.Guia1.Ejercicio2;

import java.lang.String;

public class Empleado {
    private int dni;
    private String nombre;
    private String apellido;
    private double salario;
    public Empleado(){

    }
    public Empleado(int dni, String nombre, String apellido, double salario){
        this.dni=dni;
        this.nombre=nombre;
        this.apellido=apellido;
        this.salario=salario;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
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

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "\nEmpleado[" +
                "dni=" + dni +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", salario=" + salario +
                ']';
    }

    public void incrementarSalario(double porcentaje){
        this.setSalario(this.salario*porcentaje/100+this.salario);
    }
}

