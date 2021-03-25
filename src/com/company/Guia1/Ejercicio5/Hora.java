package com.company.Guia1.Ejercicio5;
import java.util.Formatter;


public class Hora {
    private int hora;
    private int minuto;
    private int segundo;

    public Hora() {
    }

    public Hora(int hora, int minuto, int segundo) {
        if(hora>24 || hora <0 ||minuto<0|| minuto>60 ||segundo<0 || segundo>60){
            System.out.println("Ingrese una nueva intancia");

        }else {
            this.hora = hora;
            this.minuto = minuto;
            this.segundo = segundo;
        }
    }

    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public int getMinuto() {
        return minuto;
    }

    public void setMinuto(int minuto) {
        this.minuto = minuto;
    }

    public int getSegundo() {
        return segundo;
    }

    public void setSegundo(int segundo) {
        this.segundo = segundo;
    }
    public void segundoAvance(){
        this.segundo=this.segundo+1;
        this.toString();
    }
    public void segundoRetroceso(){
        this.segundo=this.segundo-1;
        this.toString();
    }

    @Override
    public String toString() {
        Formatter ftrh=new Formatter();
        Formatter ftrm=new Formatter();
        Formatter ftrs=new Formatter();
        ftrh.format("%02d",hora);
        ftrm.format("%02d",minuto);
        ftrs.format("%02d",segundo);
        return "Hora: " + ftrh +
                ":" +  ftrm+
                ":" +ftrs ;
    }
}
