package com.company.ParcialEmpresa;

public class Empresa extends Cliente{
    private String Fantasia;

    public Empresa() {
    }

    public Empresa(String direccion, String telefono, String fantasia) {
        super(direccion, telefono);
        Fantasia = fantasia;
    }

    public String getFantasia() {
        return Fantasia;
    }

    public void setFantasia(String fantasia) {
        Fantasia = fantasia;
    }

    @Override
    public String toString() {
        return "Empresa{" +
                "Fantasia='" + Fantasia + '\'' +
                '}';
    }
}
