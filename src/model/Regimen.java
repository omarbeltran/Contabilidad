/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Omar Beltran
 */
public class Regimen {

    /**
     * @return the tipoRegimen
     */
    public String getTipoRegimen() {
        return tipoRegimen;
    }

    /**
     * @param tipoRegimen the tipoRegimen to set
     */
    public void setTipoRegimen(String tipoRegimen) {
        this.tipoRegimen = tipoRegimen;
    }

    /**
     * @return the idRegimen
     */
    public int getIdRegimen() {
        return idRegimen;
    }

    /**
     * @param idRegimen the idRegimen to set
     */
    public void setIdRegimen(int idRegimen) {
        this.idRegimen = idRegimen;
    }
    private String tipoRegimen;
    private int idRegimen;
    
    public Regimen(){
        this.tipoRegimen = "Regimen Contributivo";
    }
    
    public Regimen(int tipo){
        switch (tipo){
            case 1:
                this.idRegimen = tipo;
                this.tipoRegimen = "Regimen Contributivo";
                break;
            case 2:
                this.idRegimen = tipo;
                this.tipoRegimen = "Regimen Simplificado";
                break;
            case 3:
                this.idRegimen = tipo;
                this.tipoRegimen = "Regimen Gran Contribuyente";
                break;
            default:
                this.idRegimen = tipo;
                this.tipoRegimen = "Regimen Contributivo";
                break;
        }
    }
}
