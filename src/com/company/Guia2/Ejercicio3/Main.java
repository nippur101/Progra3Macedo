package com.company.Guia2.Ejercicio3;

public class Main {

    public static void main(String[] args) {
        Cliente c1=new Cliente("001","Juan Perez","Masculino");
        Cliente c2=new Cliente("002","Veronica Fernandez","Femenino");
        Cuenta cu1=new Cuenta("3201039",25698.25,c1);
        Cuenta cu2=new Cuenta("1655665",69898.27,c2);

        System.out.println(cu1);
        cu1.depositar(7500);

        cu1.depositar(3500);

        cu1.depositar(5500);

        cu1.depositar(9500);

        cu1.depositar(500);

        cu1.depositar(1500);

        cu1.depositar(3500);

        cu1.depositar(800);

        cu1.depositar(900);
        cu1.listaDepositos();


    }
}
