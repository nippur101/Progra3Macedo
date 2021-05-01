package com.company.ParcialFornite;

public class Jugador extends Plantel {
    private String posicion;
    private String nick;
    private int cantidadVictiorias;

    public Jugador() {
    }


    public Jugador(String nombre, String apellido, int edad, String localidad, String posicion, String nick, int cantidadVictiorias, String tipoMiembro) {
        super(nombre, apellido, edad, localidad, tipoMiembro);
        this.posicion = posicion;
        this.nick = nick;
        this.cantidadVictiorias = cantidadVictiorias;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

    public int getCantidadVictiorias() {
        return cantidadVictiorias;
    }

    public void setCantidadVictiorias(int cantidadVictiorias) {
        this.cantidadVictiorias = cantidadVictiorias;
    }
    public void agregarVictoria(){
        this.cantidadVictiorias++;
    }

    @Override
    public String toString() {
        return super.toString()+"\nJugador{" +
                "\nposicion='" + posicion + '\'' +
                "\nnick='" + nick + '\'' +
                "\ncantidadVictiorias=" + cantidadVictiorias +
                '}';
    }
}