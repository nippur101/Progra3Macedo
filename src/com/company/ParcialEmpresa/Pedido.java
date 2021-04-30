package com.company.ParcialEmpresa;

import java.util.ArrayList;
import java.util.List;

public class Pedido {

    private List<Producto> productos=new ArrayList<>();
    private List<Cliente> clientes=new ArrayList<>();



    public Pedido() {
    }

    public Pedido(List<Producto> productos, List<Cliente> clientes) {
        this.productos = productos;
        this.clientes = clientes;
    }

    public List<Producto> getProductos() {
        return productos;
    }

    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }

    public List<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(List<Cliente> clientes) {
        this.clientes = clientes;
    }

    public double pedidoCompra(Cliente cliente, Producto p, int cantidad, double kms){
        double costoTotal=0;
        if(p.getNumStock()>cantidad){
            cliente.agregarCompra();//suma contador de ventas
            p.ventaProducto(cantidad);//resta 1 a numero producto
            if(cliente.getTipoCliente().equals(TipoCliente.PARTICULAR)){
                costoTotal=p.getPrecio()*cantidad+kms*100;
            }else{
                costoTotal=p.getPrecio()*cantidad*0.15+kms*100;
            }

        }
        return costoTotal;

    }


}
