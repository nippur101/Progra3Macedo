package com.company.Guia2.Ejercicio2;

import java.time.LocalDate;
import java.util.Date;
import java.util.UUID;

public class Factura {
    private String idFactura;
    private double montoTotal;
    private LocalDate fecha;
    private Cliente cliente;
    private ItemVenta [] item;
    private int [] nroItems;
    private int nroDeProdutos=0;

    public Factura() {
    }

    public Factura( double montoTotal, Cliente cliente) {

        this.fecha=LocalDate.now();
        this.idFactura = UUID.randomUUID().toString().toUpperCase().substring(0,6);
        this.montoTotal = montoTotal;
        this.item=item;
        this.nroItems=nroItems;
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

    public ItemVenta[] getItem() {
        return item;
    }

    public void setItem(ItemVenta[] item) {
        this.item = item;
    }

    public int[] getNroItems() {
        return nroItems;
    }

    public void setNroItems(int[] nroItems) {
        this.nroItems = nroItems;
    }

    public int getNroDeProdutos() {
        return nroDeProdutos;
    }

    public void setNroDeProdutos(int nroDeProdutos) {
        this.nroDeProdutos = nroDeProdutos;
    }

    public void agregarCompra(ItemVenta it, int nroItems){

         ItemVenta this.item[nroDeProdutos]=new ItemVenta();
         item[nroDeProdutos]=it;
        this.nroItems[nroDeProdutos]=nroItems;
        this.nroDeProdutos++;

    }
    public double montoFinal(){
        return montoTotal-montoTotal*cliente.getDescuento()/100;
    }

    public double montoItems(int pos){
        return item[pos].getPrecioUnitario()*nroItems[pos];
    }
    public double montoTotalItems(){
        double suma =0;
        for(int i=0;i<item.length;i++){
            suma += item[i].getPrecioUnitario()*nroItems[i];
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
