package com.company.ParcialAgroalimentaria;

import com.company.ParcialFornite.*;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Congelado c1=new Congelado("12032025","12/02/2025",2,TipoProducto.CONGELADO,-5);
        Congelado c2=new Congelado("02052022","02/05/2022",7,TipoProducto.CONGELADO,-8);
        Congelado c3=new Congelado("22072026","22/07/2026",9,TipoProducto.CONGELADO,-10);
        Fresco f1 = new Fresco("23082022","23/08/2022",11,TipoProducto.FRESCOS,"12/08/2020","Argentina");
        Fresco f2 = new Fresco("29102024","23/10/2024",15,TipoProducto.FRESCOS,"03/11/2020","Bolivia");
        Fresco f3 = new Fresco("31122023","23/12/2023",19,TipoProducto.FRESCOS,"15/09/2020","Chile");
        Refrigerado r1=new Refrigerado("01022025","01/02/2025",22,TipoProducto.REFRIGERADOS,"212521-6");
        Refrigerado r2=new Refrigerado("30092024","31/09/2024",27,TipoProducto.REFRIGERADOS,"212521-9");
        Refrigerado r3=new Refrigerado("14042027","14/04/2027",29,TipoProducto.REFRIGERADOS,"212521-6");

       Administracion a=new Administracion();
       a.agregarProducto(c1);
        a.agregarProducto(c2);
        a.agregarProducto(c3);
        a.agregarProducto(f1);
        a.agregarProducto(f2);
        a.agregarProducto(f3);
        a.agregarProducto(r1);
        a.agregarProducto(r2);
        a.agregarProducto(r3);
        a.agregarProducto(c2);
        System.out.println(a.contarProductosTipo(TipoProducto.CONGELADO));
    }
}
