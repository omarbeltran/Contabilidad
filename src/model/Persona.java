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
public class Persona {

    /**
     * @return the regimen
     */
    public Regimen getRegimen() {
        return regimen;
    }

    /**
     * @param regimen the regimen to set
     */
    public void setRegimen(Regimen regimen) {
        this.regimen = regimen;
    }

    /**
     * @return the idPersona
     */
    public int getIdPersona() {
        return idPersona;
    }

    /**
     * @param idPersona the idPersona to set
     */
    public void setIdPersona(int idPersona) {
        this.idPersona = idPersona;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }
    
    private int idPersona;
    private String name;
    private Regimen regimen;
    
    public Persona(int id, String name){
        this.name = name;
        this.idPersona = id;
        this.regimen = new Regimen(1);
    }
    
    public Persona(String id, String name){
        this.idPersona = Integer.parseInt(id);
        this.name = name;
        this.regimen = new Regimen(1);
    }
    
    public Persona(int id, String name, int regimen){
        this.idPersona = id;
        this.name = name;
        this.regimen = new Regimen(regimen);
    }
    
    public Persona(String id, String name, int regimen){
        this.idPersona = Integer.parseInt(id);
        this.name = name;
        this.regimen = new Regimen(regimen);
    }
}
