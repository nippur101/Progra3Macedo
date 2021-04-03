package com.company.Guia2.Ejercicio2;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.UUID;

public class Factura {
    private String idFactura;
    private double montoTotal;
    private LocalDate fecha;
    private Cliente cliente;
    private ArrayList< ItemVenta>item;
    //private ArrayList<Integer> nroItems;
    private int nroDeProdutos=0;

    public Factura() {
        this.idFactura = UUID.randomUUID().toString().toUpperCase().substring(0,6);
        this.item=new ArrayList<ItemVenta>();
        this.nroDeProdutos=nroDeProdutos;
    }


    public Factura(double montoTotal, Cliente cliente) {

        this.fecha=LocalDate.now();
        this.idFactura = UUID.randomUUID().toString().toUpperCase().substring(0,6);
        this.montoTotal = montoTotal;
        this.item=new ArrayList<ItemVenta>();
        //this.nroItems=nroItems;
        this.cliente = cliente;
        this.nroDeProdutos=nroDeProdutos;
    }



    public String getIdFactura() {
        return idFactura;
    }

    public void setIdFactura(String idFactura) {
        this.idFactura = idFactura;
    }

    public double getMontoTotal() {
        return montoTotal;
    }

    public void setMontoTotal(double montoTotal) {
        this.montoTotal = montoTotal;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public ArrayList<ItemVenta> getItem() {
        return item;
    }

    public void setItem(ArrayList<ItemVenta> item) {
        this.item = item;
    }
    /*
    public ArrayList<Integer> getNroItems() {
        return nroItems;
    }

    public void setNroItems(ArrayList<Integer> nroItems) {
        this.nroItems = nroItems;
    }
    */
    public int getNroDeProdutos() {
        return nroDeProdutos;
    }

    public void setNroDeProdutos(int nroDeProdutos) {
        this.nroDeProdutos = nroDeProdutos;
    }

    public void agregarCompra(ItemVenta it, Integer cantidad){

        it.setCantidad(cantidad);
        this.item.add(it);
        this.nroDeProdutos++;

    }
    public double montoFinal(){
        return montoTotal-montoTotal*cliente.getDescuento()/100;
    }

    public double montoItems(ItemVenta it,Integer cantidad){
        return it.getPrecioUnitario()*it.getCantidad();
    }
    public double montoTotalItems(){
        double suma =0;
        for(ItemVenta i:item){
            suma += i.getPrecioUnitario()*i.getCantidad();
            System.out.println(i.getNombre());
            System.out.println(i.getPrecioUnitario());
            System.out.println(i.getCantidad());
        }

        return suma;
    }




    @Override
    public String toString() {
        return "Factura{" +
                "idFactura='" + idFactura + '\'' +
                ", montoTotal=" + montoTotal +
                ", monto c/ descuento=" + montoFinal() +
                ", fecha='" + fecha + '\'' +
                ", cliente=" + cliente +
                '}';
    }
}
