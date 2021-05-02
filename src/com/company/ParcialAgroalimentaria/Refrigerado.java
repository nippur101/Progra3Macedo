package com.company.ParcialAgroalimentaria;

public class Refrigerado extends Producto{
    private String codigoOrganismSupervisor;

    public Refrigerado() {
    }

    public Refrigerado(String codigoInterno, String fechaCaducidad, int nroLote, String tipoProducto, String codigoOrganismSupervisor) {
        super(codigoInterno, fechaCaducidad, nroLote, tipoProducto);
        this.codigoOrganismSupervisor = codigoOrganismSupervisor;
    }

    public String getCodigoOrganismSupervisor() {
        return codigoOrganismSupervisor;
    }

    public void setCodigoOrganismSupervisor(String codigoOrganismSupervisor) {
        this.codigoOrganismSupervisor = codigoOrganismSupervisor;
    }



    @Override
    public String toString() {
        return "Refrigerado{" +super.toString()+
                "codigoOrganismSupervisor='" + codigoOrganismSupervisor + '\'' +
                '}';
    }
}
