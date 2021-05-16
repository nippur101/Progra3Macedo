package com.company.PersistenciaArchivos;
import java.io.Serializable;
/**
 * @web https://www.jc-mouse.net
 * @author Mouse
 */
public class MiClase implements Serializable {

    //Esta variable es para identificar el archivo cuando lo vayamos a reconstruir del *.DAT
    private static final long serialVersionUID = 666L;
    //Para guardar el nombre de objeto de la clase
    private String Nombre_Objeto="";
    private int edad;

    /* Constructor de la clase */
    public MiClase(String Nombre,int edad){
        this.Nombre_Objeto = Nombre;
        this.edad=edad;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombreObjeto()
    {
        return this.Nombre_Objeto;
    }
    //algunos metodos
    public int Suma(int a , int b)
    {
        return a + b;
    }

    public int Resta(int a , int b)
    {
        return a - b;
    }
}
   // Una vez que tenemos la clase serializable, debemos crear una clase para guardar y leer este archivo binario, la siguiente clase la llame BITS (puede ser cualquier otro nombre), esta clase cuenta con dos métodos (escribir/leer)  los cuales no creo que deba explicar para que sirven :/