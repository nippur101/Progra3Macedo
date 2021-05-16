package com.company.PersistenciaArchivos;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * @web https://www.jc-mouse.net
 * @author Mouse
 */
public class bits {

    private String ruta_archivo = "E:\\Programacion\\Tecnicatura\\Programacion 3\\Github\\Progra3Macedo\\src\\com\\company\\PersistenciaArchivos\\archivo.dat";
    private String nombreObjeto;
    private List<MiClase> lmiclase=new ArrayList<>();

    public bits(List<MiClase> lmiclase) {
        this.lmiclase = lmiclase;
    }

    public String getNombreObjeto() {
        return nombreObjeto;
    }

    public void setNombreObjeto(String nombreObjeto) {
        this.nombreObjeto = nombreObjeto;
    }

    public void escribir()
    {
        try {
            //Objeto a guardar en archivo *.DAT


            //Se crea un Stream para guardar archivo
            ObjectOutputStream file = new ObjectOutputStream(new FileOutputStream( this.ruta_archivo ));
            //Se escribe el objeto en archivo
            file.writeObject(lmiclase);
            //se cierra archivo
            file.close();
        } catch (IOException ex) {
            System.out.println(ex);
        }
    }

    public void leer()
    {
        try {
            //Stream para leer archivo
            ObjectInputStream file = new ObjectInputStream(new FileInputStream( this.ruta_archivo ));
            //Se lee el objeto de archivo y este debe convertirse al tipo de clase que corresponde
            //MiClase clase = (MiClase) file.readObject();
            List<MiClase> mc=new ArrayList<>();
            mc =(ArrayList) file.readObject();
            //se cierra archivo
            file.close();
            //Se utilizan metodos de la clase asi como variables guardados en el objeto
            for(MiClase m:mc) {
                System.out.println("El objeto se llama:" + m.getNombreObjeto()+" Edad: "+m.getEdad());
            }
            //String res = String.valueOf(clase.Suma(234, 12)) ;
            //System.out.println("La suma de 3 + 12 es igual a : " + res);
        } catch (ClassNotFoundException ex) {
            System.out.println(ex);
        } catch (IOException ex) {
            System.out.println(ex);
        }
    }

}