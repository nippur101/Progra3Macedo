package com.company.Guia2.Ejercicio2;

public class Main {

    public static void main(String[] args) {
        Cliente c1=new Cliente("Juan","juan@gmail.com",7);
        ItemVenta i1=new ItemVenta( "001","jabon","Rexona",80.23);
        ItemVenta i2=new ItemVenta( "002","Shampoo","head ands howlders",167.24);
        ItemVenta i3=new ItemVenta( "003","Crema de Enjuague","head ands howlders",150.20);
        Factura f1=new Factura( 25368.05,c1);
        Factura f2=new Factura( 25368.05,c1);
        f2.agregarCompra(i2,2);
        f2.agregarCompra(i3,4);
        f1.agregarCompra(i1,3);
        f1.agregarCompra(i2,4);

        System.out.println(f1.montoTotalItems());
        System.out.println(f2.montoTotalItems());
        System.out.println(f1);

    }
}
