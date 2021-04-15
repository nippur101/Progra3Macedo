package com.company.Guia4;

import java.util.UUID;

public class Cliente {
    private String idCliente;
    private String nombre;
    private String telefono;
    private String direccion;

    public Cliente() {
        this.idCliente = UUID.randomUUID().toString().toUpperCase().substring(0,6);
    }
//VERIFICAR SI ESTA EL CLIENTE
    public Cliente( String nombre, String telefono, String direccion) {
        this.idCliente = UUID.randomUUID().toString().toUpperCase().substring(0,6);
        this.nombre = nombre;
        this.telefono = telefono;
        this.direccion = direccion;
    }

    public String getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(String idCliente) {
        this.idCliente = idCliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nombre='" + nombre + '\'' +
                ", telefono='" + telefono + '\'' +
                ", direccion='" + direccion + '\'' +
                '}';
    }
}
