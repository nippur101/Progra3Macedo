package com.company.ParcialAgroalimentaria;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Administracion {
    private List<Producto> productos=new ArrayList<>();

    public Administracion() {
    }

    public Administracion(List<Producto> productos) {
        this.productos = productos;
    }

    public List<Producto> getProductos() {
        return productos;
    }

    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }

    public void agregarProducto(Producto p){
        boolean bandera=true;
        for(Producto pr:productos){
            if(p.equals(pr)){
                bandera=false;
            }
        }
        if(bandera==true) {
            productos.add(p);
            System.out.println("\nCarga Extitosa");
        }else {
            System.out.println("\nEl producto ingresado ya se ecuentra en el sistema");
        }
    }
    public int contarProductosTipo(String tipoProducto){
        int cont=0;
        for (Producto p:productos){
            if(tipoProducto.equals(p.getTipoProducto()) ){
                cont++;

            }
        }
        return cont;
    }



    @Override
    public int hashCode() {
        return Objects.hash(productos);
    }
}
