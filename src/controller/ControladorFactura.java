/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.ArrayList;
import java.util.Iterator;
import model.BaseDatos;
import model.Factura;
import model.Producto;

/**
 *
 * @author prog3
 */
public class ControladorFactura {
    
    private static ArrayList<Factura> facturas;
    private ControladorProducto controladorProducto;
    ControladorFactura() {
        facturas = BaseDatos.getInstance().getFacturas();     
    }
    
    ControladorFactura(BaseDatos BD, ControladorProducto controladorProducto) {
        facturas = BD.getFacturas();//carga las facturas existentes en la Base de Datos
        this.controladorProducto = controladorProducto;
    }
    
    public static boolean agregarFactura(int idInvoice, int idPersona, int idEmpresa, String fecha, double valorTotal){
        Factura invoiceTmp = new Factura(idInvoice, idPersona, idEmpresa, fecha, valorTotal);
        return addInvoice(invoiceTmp);
    }
    
    public static boolean agregarFactura(int idInvoice, int idPersona, int idEmpresa, String fecha, 
                                       ArrayList<Producto> products, double valorTotal){
        Factura invoiceTmp = new Factura(idInvoice, idPersona, idEmpresa, fecha, products, valorTotal);
        return addInvoice(invoiceTmp);
    }
    
    public static boolean agregarFactura(int idInvoice, int idPersona, int idEmpresa, String fecha, 
                                       String[] products, double valorTotal){
        
        Factura invoiceTmp = new Factura(idInvoice, idPersona, idEmpresa, fecha, getProducts(products), valorTotal);
        return addInvoice(invoiceTmp);
    }
    
    private static boolean addInvoice(Factura invoiceNew){
        boolean flag = false;
        if(facturas.isEmpty()){
            facturas.add(invoiceNew);
            flag = true;
        }    
        else
        {
            for (int index = 0; index < facturas.size() ; index++)
            {
                if(findInvoiceById(invoiceNew.getIdFactura()) == null)
                {//if not exist, agree invoice
                   facturas.add(invoiceNew);
                   flag = true;
                   index = facturas.size();
                }
            }
        }
        return flag;
    }
    
    private static Factura findInvoiceById(int id){      
        Factura invoice;
        //se esta insertando el primer registro
        if(facturas.isEmpty())
        {
            return null;
        }    
        else
        {
            //recorrido del ArrayList usando un iterador
            Iterator it = facturas.iterator();
            while(it.hasNext())
            {
                invoice = (Factura)it.next();//casting del iterador al objeto Client
                if(invoice.getIdFactura()== id)
                {
                    return invoice;
                }    
            }    
        }       
        return null;
    }
    
    public static int getnInvoice(){
        return facturas.size();
    }
    
    public static double getInvoiceValue(int idInvoice){
        Factura invoiceTmp = findInvoiceById(idInvoice);
        ArrayList<Producto> productsTmp = invoiceTmp.getProductos();
        Producto product;
        double totalValue = 0;
        //recorrido del ArrayList usando un iterador
        Iterator it = productsTmp.iterator();
        while(it.hasNext())
        {
            product = (Producto)it.next();//casting del iterador al objeto Client
            totalValue += product.getValor();
        } 
        return totalValue;
    }
    
    private static ArrayList<Producto> getProducts(String[] product){
        ArrayList<Producto> productsSelected = new ArrayList<>();
        int i = 0;//iterador que ayudara a recorrer el arreglo de Strings que viene como parametro
        while(product[i] != null){
           //BaseDatos.getInstance().get();
           //controladorProducto.
        }    
        return productsSelected;
    }

}
