package com.company.Guia2.Ejercicio2;

import java.time.LocalDate;
import java.util.Date;
import java.util.UUID;

public class Factura {
    private String idFactura;
    private double montoTotal;
    private LocalDate fecha;
    private Cliente cliente;

    public Factura() {
    }

    public Factura( double montoTotal, Cliente cliente) {

        this.fecha=LocalDate.now();
        this.idFactura = UUID.randomUUID().toString().toUpperCase().substring(0,6);
        this.montoTotal = montoTotal;

        this.cliente = cliente;
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

    public double montoFinal(){
        return montoTotal-montoTotal*cliente.getDescuento()/100;
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
