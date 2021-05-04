package com.company.ParcialEmpresa;

public class Cliente {

    private String direccion;
    private String telefono;
    private int nroCompras=0;


    public Cliente() {

    }

    public Cliente(String direccion, String telefono) {
        this.direccion = direccion;
        this.telefono = telefono;

        this.nroCompras=nroCompras;
    }



    public int getNroCompras() {
        return nroCompras;
    }

    public void setNroCompras(int nroCompras) {
        this.nroCompras = nroCompras;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    public void agregarCompra(){
        this.nroCompras++;
    }

    @Override
    public String toString() {
        return "Cliente{" ;
    }
}
