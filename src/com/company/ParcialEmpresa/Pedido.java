package com.company.ParcialEmpresa;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private static int count = 1;
    private List<Producto> productos=new ArrayList<>();
    private List<Cliente> clientes=new ArrayList<>();
    private int nroPedidos=0;
    private static double countIngresos = 0;




    public Pedido() {
        this.nroPedidos=count++;
    }

    public Pedido(List<Producto> productos, List<Cliente> clientes) {
        this.productos = productos;
        this.clientes = clientes;
        this.nroPedidos=count++;

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
                countIngresos=countIngresos+costoTotal;

                System.out.println("Cliente: "+cliente.toString()+"\nProducto: "+p.toString()+"\nCantidad: "+cantidad+"\nPRECIO TOTAL: "+costoTotal+"\nNro de Pedidos: "+nroPedidos);
            }else{
                costoTotal=p.getPrecio()*cantidad*0.85+kms*100;
                countIngresos=countIngresos+costoTotal;

                System.out.println("Cliente: "+cliente.toString()+"\nProducto: "+p.toString()+"\nCantidad: "+cantidad+"\nPRECIO TOTAL: "+costoTotal+"\nNro de Pedidos: "+nroPedidos);

            }

        }
        return costoTotal;

    }
    public double promedioVentas(){
        return countIngresos/nroPedidos;
    }


}
