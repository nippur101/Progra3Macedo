package com.company.Guia3.Ejercicio2;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Estudiante e1=new Estudiante("23.342.233","Juan","Perez","juan@gmail.com","Cordoba 2134",2020,4500,"Programacion");
        Estudiante e2=new Estudiante("20.322.200","Lucas","Marinez","lucas@gmail.com","Santiago del Estero 2094",2020,5000,"Matematica");
        Estudiante e3=new Estudiante("18.382.233","Maria","Rodriguez","maria@gmail.com","jujuy 3434",2021,4600,"Fisica");
        Estudiante e4=new Estudiante("43.316.815","Luciana","Dow","luciana@gmail.com","acha 234",2021,4700,"Programacion");
        Staff s1=new Staff("16.258.369","Johanna","Langenhein","johanna@mail.com","mario bravo 2939",55000,"Nocturno");
        Staff s2=new Staff("32.258.369","Pamela","Langenhein","pamela@mail.com","garay 239",66000,"Nocturno");
        Staff s3=new Staff("44.558.369","Martin","Garcia","martin@mail.com","Puan 1139",51000,"Diurno");
        Staff s4=new Staff("33.356.369","Matias","Moran","matias@mail.com","Luro 10254",77000,"Nocturno");
        ArrayList<Persona> personas=new ArrayList<>();
        personas.add(e1);
        personas.add(e2);
        personas.add(e3);
        personas.add(e4);
        personas.add(s1);
        personas.add(s2);
        personas.add(s3);
        personas.add(s4);
        for(Persona p:personas){
            System.out.println(p);
        }
    }
}
