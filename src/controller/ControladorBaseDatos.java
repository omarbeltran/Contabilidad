/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import model.BaseDatos;

/**
 *
 * @author prog3
 */
public class ControladorBaseDatos extends BaseDatos{
    
    private static ControladorBaseDatos controladorBaseDatos;
    /**
     * @return the controladorPersona
     */
    public ControladorPersona getControladorPersona() {
        return controladorPersona;
    }

    /**
     * @return the controladorProducto
     */
    public ControladorProducto getControladorProducto() {
        return controladorProducto;
    }

    /**
     * @return the controladorRegimen
     */
    public ControladorRegimen getControladorRegimen() {
        return controladorRegimen;
    }

    /**
     * @return the controladorFactura
     */
    public ControladorFactura getControladorFactura() {
        return controladorFactura;
    }

    private static BaseDatos BD;
    private final ControladorPersona controladorPersona;
    private final ControladorProducto controladorProducto;
    private final ControladorRegimen controladorRegimen;
    private final ControladorFactura controladorFactura;
    
    /**
     *
     */
    public ControladorBaseDatos(){
        BD = BaseDatos.getInstance();
        controladorPersona = new ControladorPersona(BD);
        controladorProducto = new ControladorProducto(BD);
        controladorRegimen = new ControladorRegimen(BD);
        controladorFactura = new ControladorFactura(BD, controladorProducto);
    }
    
    /**Singleton
     * @return ControladorBaseDatos
     */
    public static ControladorBaseDatos getInstance() {
        if(controladorBaseDatos == null)
        {
            controladorBaseDatos = new ControladorBaseDatos();
        }
        return controladorBaseDatos;
    }
    
    public static int getConsecutiveNumberFactura(){
        return BD.getFacturas().size();
    }
}
