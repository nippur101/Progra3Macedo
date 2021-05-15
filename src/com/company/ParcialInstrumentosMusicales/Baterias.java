package com.company.ParcialInstrumentosMusicales;

public class Baterias extends Instrumento {
    private int nroTambores;
    private int nroPlatillos;

    public Baterias() {
    }

    public Baterias( String marca, int nroTambores, int nroPlatillos) {
        super( marca);
        this.nroTambores = nroTambores;
        this.nroPlatillos = nroPlatillos;
        super.setPrecio(nroTambores*3000+nroPlatillos*2000);
    }

    public int getNroTambores() {
        return nroTambores;
    }

    public void setNroTambores(int nroTambores) {
        this.nroTambores = nroTambores;
    }

    public int getNroPlatillos() {
        return nroPlatillos;
    }

    public void setNroPlatillos(int nroPlatillos) {
        this.nroPlatillos = nroPlatillos;
    }

    @Override
    public String toString() {
        return "Baterias{" +super.toString()+
                " nroTambores= " + nroTambores +
                " nroPlatillos = " + nroPlatillos +
                " }";
    }
}
