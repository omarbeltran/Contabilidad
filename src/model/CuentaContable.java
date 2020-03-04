/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author prog3
 */
public class CuentaContable {

    /**
     * @return the naturaleza
     */
    public String getNaturaleza() {
        return naturaleza;
    }

    /**
     * @param naturaleza the naturaleza to set
     */
    public void setNaturaleza(String naturaleza) {
        this.naturaleza = naturaleza;
    }

    /**
     * @return the idCta
     */
    public int getIdCta() {
        return idCta;
    }

    /**
     * @param idCta the idCta to set
     */
    public void setIdCta(int idCta) {
        this.idCta = idCta;
    }

    /**
     * @return the nombreCta
     */
    public String getNombreCta() {
        return nombreCta;
    }

    /**
     * @param nombreCta the nombreCta to set
     */
    public void setNombreCta(String nombreCta) {
        this.nombreCta = nombreCta;
    }

    /**
     * @return the valorCta
     */
    public double getValorCta() {
        return valorCta;
    }

    /**
     * @param valorCta the valorCta to set
     */
    public void setValorCta(double valorCta) {
        this.valorCta = valorCta;
    }

    /**
     * @return the descripcionCta
     */
    public String getDescripcionCta() {
        return descripcionCta;
    }

    /**
     * @param descripcionCta the descripcionCta to set
     */
    public void setDescripcionCta(String descripcionCta) {
        this.descripcionCta = descripcionCta;
    }
    private int idCta;   
    private String nombreCta;
    private double valorCta;
    private String descripcionCta;
    private String naturaleza;
    
    private String getNaturaleza(String naturalezaCuenta){
        String naturaleza;
        return "";
    }
    
    public CuentaContable(int idCta, String nombreCuenta, String naturalezaCuenta) {
        this.idCta = idCta;
        this.nombreCta = nombreCuenta;
        this.valorCta = 0;
        this.descripcionCta = "";
        this.naturaleza = naturalezaCuenta;
    }
    
    public CuentaContable(int idCta, String nombreCuenta, double valorCta, String descripcion, String naturalezaCuenta) {
        this.idCta = idCta;
        this.nombreCta = nombreCuenta;
        this.valorCta = valorCta;
        this.descripcionCta = descripcion;
        this.naturaleza = naturalezaCuenta;
    }
    
    public CuentaContable(int idCta, String nombreCuenta, double valorCta, String naturalezaCuenta) {
        this.idCta = idCta;
        this.nombreCta = nombreCuenta;
        this.valorCta = valorCta;
        this.descripcionCta = "";
        this.naturaleza = naturalezaCuenta;
    }
    
    public CuentaContable(String idCta, String nombreCuenta, String naturalezaCuenta) {
        this.idCta = Integer.parseInt(idCta);
        this.nombreCta = nombreCuenta;
        this.valorCta = 0;
        this.descripcionCta = "";
        this.naturaleza = naturalezaCuenta;
    }
    
    public CuentaContable(String idCta, String nombreCuenta, String valorCta, String naturalezaCuenta) {
        this.idCta = Integer.parseInt(idCta);
        this.nombreCta = nombreCuenta;
        this.valorCta = Double.parseDouble(valorCta);
        this.descripcionCta = "";
        this.naturaleza = naturalezaCuenta;
    }
    
    public CuentaContable(String idCta, String nombreCuenta, String valorCta, String descripcion, String naturalezaCuenta) {
        this.idCta = Integer.parseInt(idCta);
        this.nombreCta = nombreCuenta;
        this.valorCta = Double.parseDouble(valorCta);
        this.descripcionCta = descripcion;
        this.naturaleza = naturalezaCuenta;
    }
}
