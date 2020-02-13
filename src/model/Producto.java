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
public class Producto {

    /**
     * @return the idProducto
     */
    public int getIdProducto() {
        return idProducto;
    }

    /**
     * @param idProducto the idProducto to set
     */
    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

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
     * @return the nombreProducto
     */
    public String getNombreProducto() {
        return nombreProducto;
    }

    /**
     * @param nombreProducto the nombreProducto to set
     */
    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }
    private int idProducto;
    private double valor;
    private String nombreProducto;
  
    public Producto(int idProducto, double valor, String nombreProducto){
        this.idProducto = idProducto;
        this.valor = valor;
        this.nombreProducto = nombreProducto;
    }
    
    public Producto(String idProducto, String valor, String nombreProducto){
        this.idProducto = Integer.parseInt(idProducto);
        this.valor = Double.parseDouble(valor);
        this.nombreProducto = nombreProducto;
    }
}
