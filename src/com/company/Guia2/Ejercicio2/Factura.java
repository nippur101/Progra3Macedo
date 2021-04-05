package com.company.Guia2.Ejercicio2;

import java.beans.PropertyEditorSupport;
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
    private ArrayList<Integer> cantidadF =new ArrayList<Integer>();
    private int nroDeProdutos=0;
    private String resumen;

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
        this.cliente = cliente;
        this.nroDeProdutos=nroDeProdutos;
        this.resumen= resumen;
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

    public ArrayList<Integer> getCantidadF() {
        return cantidadF;
    }

    public void setCantidadF(ArrayList<Integer> cantidadF) {
        this.cantidadF = cantidadF;
    }

    public int getNroDeProdutos() {
        return nroDeProdutos;
    }

    public void setNroDeProdutos(int nroDeProdutos) {
        this.nroDeProdutos = nroDeProdutos;
    }

    public String getResumen() {
        return resumen;
    }

    public void setResumen(String resumen) {
        this.resumen = resumen;
    }

    public void agregarCompra(ItemVenta it, Integer cantidad){
        cantidadF.add(cantidad);
        this.item.add(it);
        this.nroDeProdutos++;

    }
    public double montoFinal(){
        return montoTotal-montoTotal*cliente.getDescuento()/100;
    }

    public double montoItems(ItemVenta it,Integer cantidad){
        return it.getPrecioUnitario()*cantidad;
    }
    public double montoTotalItems(){

        double suma =0;
        int j=0;
        for(ItemVenta i:item){

                suma += i.getPrecioUnitario() * cantidadF.get(j);
                resumen=("| "+i.getNombre()+" | "+cantidadF.get(j)+" | "+ i.getPrecioUnitario() +" |\n");
                System.out.println(resumen);
                j++;

        }
        this.setMontoTotal(suma);
        return suma;
    }

    public double montoTotalCDescuento(){
        return this.getMontoTotal()-this.getMontoTotal()/100*this.cliente.getDescuento();
    }


    @Override
    public String toString() {

        return "Factura{" +
                "idFactura='" + idFactura + '\'' +
                ", montoTotal=" + montoTotal +
                ", monto c/ descuento=" + this.montoTotalCDescuento() +
                ", fecha='" + fecha + '\'' +
                ", cliente=" + cliente +
                '}';
    }
}
