package com.company.ParcialEmpresa;

import com.company.GuiaIntro.Ejercicios;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Cliente p1=new Particular("Pedro Lopez","4856433","San Juan 2121",TipoCliente.PARTICULAR);
        Cliente p2=new Particular("Maria Fernandez","46675464","San Martin 2221",TipoCliente.PARTICULAR);
        Cliente e1=new Empresa("Delta Computacion","6456414","San Lorenzo 3131",TipoCliente.EMPRESA);
        Cliente e2=new Empresa("Luro Autohogar","6584668","Juan b justo 321",TipoCliente.EMPRESA);
        Producto pr1=new Producto(10,"Mouse",850.0);
        Producto pr2=new Producto(20,"Teclado Genius",950.0);
        Producto pr3=new Producto(5,"Monitor LG 22",2200.0);
        Producto pr4=new Producto(3,"Micro i5 3800",12000.0);
        
        List<Cliente> clientes=new ArrayList<>();
        List<Producto> productos=new ArrayList<>();
        productos.add(pr1);
        productos.add(pr2);
        productos.add(pr3);
        productos.add(pr4);
        clientes.add(p1);
        clientes.add(p2);
        clientes.add(e1);
        clientes.add(e1);






    }
}
