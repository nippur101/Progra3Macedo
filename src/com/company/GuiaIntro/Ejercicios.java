package com.company.GuiaIntro;
import java.util.Scanner;
import java.util.*;
import java.lang.String;

public class Ejercicios {
    public Ejercicios(){

    }
    public void ejecicio1(){
        int N=2;
        double A=2.4;
        char C='j';
        int numC=C;

        System.out.println(N+A);
        System.out.println(numC);
    }

    public void ejercicio2(){
        int X,Y;
        double N,M;


        X=2;
        Y=3;
        N=3.5;
        M=5.8;

        System.out.println(X*Y);
        System.out.println(X*N);
        System.out.println(M/X);
    }

    public void ejercicio3(){
        int N=4;
        System.out.println("\nN= "+N);
        N=N+77;
        System.out.println("\nN+77= "+N);
        N=N-3;
        System.out.println("\nN-3= "+N);
        N=N*2;
        System.out.println("\nN*2= "+N);

    }
    public void ejercicio4(){
        int A,B,C,D;
        A=4;
        B=7;
        C=9;
        D=11;
        System.out.println("A= "+A+"| B= "+B+"| C= "+C+"| D= "+D);
        B=C;
        System.out.println("B=C "+B);
        C=A;
        System.out.println("C=A "+C);
        D=B;
        System.out.println("D=B "+D);
    }
    public void ejercicio5(int A){

        if(A%2==0){
            System.out.println("A es Par");
        }else{
            System.out.println("A es Impar");
        }


    }


    public void ejercicio6(int B){
        if(B==0){
            System.out.println("B es cero");
        }else {
            if (B > 0) {
                System.out.println("B es positivo");
            } else {
                System.out.println("B es Negativo");
            }
        }

    }



    public void ejercicio7(int C){
        this.ejercicio5(C);
        this.ejercicio6(C);
        if(C%5==0 && C%10==0){
            System.out.println("Es multiplo de 5 y de 10");
        }else{
            if(C%5==0){
                System.out.println("No es multiplo de 10 pero si es multiplo de 5");
            }else{
                System.out.println("No es multiplo de 5 ni de 10");
            }
        }


    }
    public void ejercicio8(){
        Scanner entrada=new Scanner(System.in);
        String nombre;
        System.out.println("Ingrese un nombre ");
        nombre=entrada.nextLine();
        System.out.println("El nombre que escribio fue: "+nombre);

    }
    public void ejercicio9(){
        Scanner entrada=new Scanner(System.in);
        int a;
        System.out.println("Ingrese un numero");
        a=entrada.nextInt();
        System.out.println("El doble es : "+2*a+"   Y el triple es: "+3*a);
    }
    public void ejercicio10(){
        Scanner entrada=new Scanner(System.in);
        double a,t;
        System.out.println("Ingrese la temperatura en grados Farenheit");
        a=entrada.nextDouble();
        System.out.println("La temperatura en grados Celicius es: "+(a-32)*5/9);


    }
    public void ejercicio11(){
        Scanner entrada=new Scanner(System.in);
        double r;
        System.out.println("Ingrese el radio de la circircunsferencia");
        r=entrada.nextDouble();
        System.out.printf("La circusferencia tiene un Area de : %.2f",Math.PI*r*r+" y tiene un perimetro de: "+2*Math.PI*r);

    }

    public void ejercicio12(){
        Scanner entrada=new Scanner(System.in);
        double v;
        System.out.println("Ingrese la velocidad en km/h a convertir a m/s");
        v=entrada.nextDouble();
        System.out.println("La velocidad es de: "+v*1000/3600+" m/s");
    }
     public void ejercicio13(){
         Scanner entrada=new Scanner(System.in);
         double a,o;
         System.out.println("Ingrese el primer cateto del triangulo rectangulo");
         a=entrada.nextDouble();
         System.out.println("Ingrese el segundo cateto del triangulo rectangulo");
         o=entrada.nextDouble();
         System.out.println("La hipotenusa tiene un largo de: "+Math.sqrt(a*a+o*o));
     }

     public void ejercicio14(){
         Scanner entrada=new Scanner(System.in);
         double r;
         System.out.println("Ingrese el radio de la circircunsferencia");
         r=entrada.nextDouble();
         System.out.printf("La circusferencia tiene un volumen de : %.2f",Math.PI*4/3*Math.pow(r,3));

     }

     public void ejercicio15() {
         Scanner entrada = new Scanner(System.in);
         double l1=0, l2=0, l3=0, s, area;
         boolean permiso = false;
         while (permiso == false) {
             System.out.println("Ingrese el primer lado de un triangulo");
             l1 = entrada.nextDouble();
             System.out.println("Ingrese el segundo lado de un triangulo");
             l2 = entrada.nextDouble();
             System.out.println("Ingrese el tercer lado de un triangulo");
             l3 = entrada.nextDouble();
             if ((l1 + l2) < l3 || (l2 + l3) < l1 || (l1 + l3) < l2) {
                 permiso = false;
                 System.out.println("Con el largo de esos lados no se puede formar un triangulo");
             } else {
                 permiso = true;
             }
         }
         //semiperimetro
         s = (l1 + l2 + l3) / 2;
         //area
         area = 1 / l1 * Math.sqrt(s * (s - l1) * (s - l2) * (s - l3)) * l1;
         System.out.println("El area del triangulo es: " + area);
     }
    public void ejercicio16(){
        Scanner entrada=new Scanner(System.in);

        System.out.println("Ingrese un numero de 3 cifras");
        double num=entrada.nextFloat();
        double a=Math.floor(num/100);
        double b=Math.floor((num-a*100)/10);
        double c=Math.floor(num-a*100-b*10);

        System.out.println("| "+a+" | "+b+" | "+c);

    }
    public void ejercicio17(){
        Scanner entrada=new Scanner(System.in);

        System.out.println("Ingrese un numero de 5 cifras");
        int num=entrada.nextInt();
        for(int i =0;i<3;i++){
            String numCadena= String.valueOf(num);
            System.out.println(numCadena.charAt(2*i));//la cifra 1 es el valor de string 0 y salta de 2 en 2
        }
    }

    public void ejercicio18(){
        Scanner entrada=new Scanner(System.in);
        boolean validar=true;
        int H=0,M=0,S=0;
        while(validar==true){


            System.out.println("Ingrese horas");
             H=entrada.nextInt();
            System.out.println("Ingrese minutos");
            M=entrada.nextInt();
            System.out.println("Ingrese segundos");
            S=entrada.nextInt();
            if(H>24 || H<0 || M>60 || M<0 || S>60 || S<0){
                System.out.println("Ingrese una hora valida");
            }else{
                validar=false;
            }

        }
        System.out.println("La hora ingresada es: "+H+" horas "+M+" minutos y "+S+" segundos");
    }

}

    

