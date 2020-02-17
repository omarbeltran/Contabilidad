/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author Omar Beltran
 */
public class BaseDatos{

    /**
     * @return the cuentasContables
     */
    public ArrayList<CuentaContable> getCuentasContables() {
        return cuentasContables;
    }

    /**
     * @param cuentasContables the cuentasContables to set
     */
    public void setCuentasContables(ArrayList<CuentaContable> cuentasContables) {
        this.cuentasContables = cuentasContables;
    }

    /**
     * @return the regimen
     */
    public ArrayList<Regimen> getRegimen() {
        return regimen;
    }

    /**
     * @param regimen the regimen to set
     */
    public void setRegimen(ArrayList<Regimen> regimen) {
        this.regimen = regimen;
    }

    /**
     * @return the invoices
     */
    public ArrayList<Factura> getFacturas() {
        return facturas;
    }

    /**
     * @param facturas the invoices to set
     */
    public void setFacturas(ArrayList<Factura> facturas) {
        this.facturas = facturas;
    }

    /**
     * @return the productos
     */
    public ArrayList<Producto> getProductos() {
        return productos;
    }

    /**
     * @param productos the productos to set
     */
    public void setProductos(ArrayList<Producto> productos) {
        this.productos = productos;
    }

    /**
     * @return the personas
     */
    public ArrayList<Persona> getPersonas() {
        return personas;
    }

    /**
     * @param personas the personas to set
     */
    public void setPersonas(ArrayList<Persona> personas) {
        this.personas = personas;
    }
    
    private static BaseDatos baseDatos;
    private ArrayList<Factura> facturas;
    private ArrayList<Producto> productos;
    private ArrayList<Persona> personas;
    private ArrayList<Regimen> regimen;
    private ArrayList<CuentaContable> cuentasContables;
    
    public BaseDatos(){
        facturas = new ArrayList<>();
        productos = new ArrayList<>();
        personas = new ArrayList<>();
        regimen = new ArrayList<>();
    }
    /**Singleton
     * @return la base de datos
     */
    public static BaseDatos getInstance() {
        if(baseDatos == null)
        {
            baseDatos = new BaseDatos();
        }
        return baseDatos;
    }
}
