package com.company.Guia3.Ejercicio2;

public class Staff extends Persona{
    private double salario;
    private String turno;

    public Staff() {
    }

    public Staff(String dni, String nombre, String apellido, String email, String direccion, double salario, String turno) {
        super(dni, nombre, apellido, email, direccion);
        this.salario = salario;
        this.turno = turno;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    @Override
    public String toString() {
        return super.toString()+"Staff{" +
                "\n salario=" + salario +
                "\n turno='" + turno + '\'' +
                '}';
    }
}
