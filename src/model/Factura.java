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
public class Factura {
    
    /**
     * @return the valor
     */
    public double getValor() {
        return valor;
    }

    /**
     * @param valor the valor to set
     */
    public void setValor(double valor) {
        this.valor = valor;
    }
    
    /**
     * @return the idEmpresa
     */
    public int getIdEmpresa() {
        return idEmpresa;
    }

    /**
     * @param idEmpresa the idEmpresa to set
     */
    public void setIdEmpresa(int idEmpresa) {
        this.idEmpresa = idEmpresa;
    }

    /**
     * @return the idFactura
     */
    public int getIdFactura() {
        return idFactura;
    }

    /**
     * @param idFactura the idFactura to set
     */
    public void setIdFactura(int idFactura) {
        this.idFactura = idFactura;
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
     * @return the fecha
     */
    public String getFecha() {
        return fecha;
    }

    /**
     * @param fecha the fecha to set
     */
    public void setFecha(String fecha) {
        this.fecha = fecha;
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
    private int idFactura;
    private int idPersona;
    private int idEmpresa;
    private String fecha;
    private ArrayList<Producto> productos;
    private double valor;
    
    public Factura(int idFactura, int idPersona, int idEmpresa, String fecha, ArrayList<Producto> productos, double valor){
        this.idFactura = idFactura;
        this.idPersona = idPersona;
        this.idEmpresa = idEmpresa;
        this.fecha = fecha;
        this.productos = new ArrayList<>();
        this.valor = valor;
    }
    
    public Factura(int idFactura, int idPersona, int idEmpresa, String fecha, double valor){
        this.idFactura = idFactura;
        this.idPersona = idPersona;
        this.idEmpresa = idEmpresa;
        this.fecha = fecha;
        this.productos = new ArrayList<>();
        this.valor = valor;
    }
}
