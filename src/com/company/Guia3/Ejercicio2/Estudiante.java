package com.company.Guia3.Ejercicio2;

public class Estudiante extends Persona{

    private int anioIngreso;
    private double cuotaMensual;
    private String carrera;

    public Estudiante() {
    }

    public Estudiante(String dni, String nombre, String apellido, String email, String direccion, int anioIngreso, double cuotaMensual, String carrera) {
        super(dni, nombre, apellido, email, direccion);
        this.anioIngreso = anioIngreso;
        this.cuotaMensual = cuotaMensual;
        this.carrera = carrera;
    }

    public int getAnioIngreso() {
        return anioIngreso;
    }

    public void setAnioIngreso(int anioIngreso) {
        this.anioIngreso = anioIngreso;
    }

    public double getCuotaMensual() {
        return cuotaMensual;
    }

    public void setCuotaMensual(double cuotaMensual) {
        this.cuotaMensual = cuotaMensual;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    @Override
    public String toString() {
        return super.toString()+"Estudiante{" +
                "\n anioIngreso=" + anioIngreso +
                "\n cuotaMensual=" + cuotaMensual +
                "\n carrera='" + carrera + '\'' +
                '}';
    }
}
