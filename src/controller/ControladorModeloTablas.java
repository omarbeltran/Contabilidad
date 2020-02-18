/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;
import model.BaseDatos;
import model.CuentaContable;
import model.Factura;
import model.Persona;
import model.Producto;
import model.Regimen;

/**
 *
 * @author prog3
 */
public class ControladorModeloTablas {
    
    private final ArrayList<Persona> people;
    private final ArrayList<Producto> products;
    private final ArrayList<Factura> facturas;
    private final ArrayList<Regimen> regimen;
    private final ArrayList<CuentaContable> cuentasContables;
    private final ControladorProducto productController;
    private final ControladorPersona peopleController;
    //private final ControladorRegimen regimenController;
    
    public ControladorModeloTablas()
    {
        people = BaseDatos.getInstance().getPersonas();
        products = BaseDatos.getInstance().getProductos();
        facturas = BaseDatos.getInstance().getFacturas();
        regimen = BaseDatos.getInstance().getRegimen();
        cuentasContables = BaseDatos.getInstance().getCuentasContables();
        //(P) productController y  peopleController estan siendo instanciados 
        //para simplemente llamar un metodo, no es eficiente dado 
        //que se esta realizando nuevamente carga de valores por defecto
        //en las tablas de personas y productos
        productController = new ControladorProducto();
        peopleController = new ControladorPersona();
        //regimenController = new ControladorRegimen();
    }
    
    //metodos de consulta
    public DefaultTableModel getPersonas(){
        DefaultTableModel tableModel = new DefaultTableModel();
        tableModel.addColumn("ID");
        tableModel.addColumn("Nombre");
        tableModel.addColumn("Tipo Regimen");
        
        Persona personaRep;
        //recorrido del ArrayList usando un iterador
        Iterator it = people.iterator();
        
        while(it.hasNext())
        {
            personaRep = (Persona)it.next();//casting del iterador al objeto Persona
            
            String [] registro = {String.valueOf(personaRep.getIdPersona()), personaRep.getName(),
                String.valueOf(personaRep.getRegimen().getTipoRegimen())};
            tableModel.addRow(registro);
        }      
        return tableModel;
    }
    
    //metodos de consulta
    public DefaultTableModel getProductos(){
        DefaultTableModel tableModel = new DefaultTableModel();
        tableModel.addColumn("ID");
        tableModel.addColumn("Nombre");
        tableModel.addColumn("Valor");
        
        Producto productoRep;
        //recorrido del ArrayList usando un iterador
        Iterator it = products.iterator();
        
        while(it.hasNext())
        {
            productoRep = (Producto)it.next();//casting del iterador al objeto Product
            
            String [] registro = {String.valueOf(productoRep.getIdProducto()), productoRep.getNombreProducto(),
                String.valueOf(productoRep.getValor())};
            tableModel.addRow(registro);
        }      
        return tableModel;
    }
    
    public DefaultTableModel getFacturas(){
        DefaultTableModel tableModel = new DefaultTableModel();
        tableModel.addColumn("Nº Factura");
        tableModel.addColumn("Nombre Cliente");
        tableModel.addColumn("Valor");
        
        Factura facturaRep;
        //recorrido del ArrayList usando un iterador
        Iterator it = facturas.iterator();
        
        while(it.hasNext())
        {
            facturaRep = (Factura)it.next();//casting del iterador al objeto Product
            
            String [] registro = {String.valueOf(facturaRep.getIdFactura()), 
                ControladorPersona.getPersonName(String.valueOf(facturaRep.getIdPersona())),
                String.valueOf(facturaRep.getValor())};
            tableModel.addRow(registro);
        }      
        return tableModel;
    }
    
    public DefaultTableModel getContabilidad(){
        DefaultTableModel tableModel = new DefaultTableModel();
        tableModel.addColumn("Nº Cta Contable");
        tableModel.addColumn("Nombre Cta Contable");
        tableModel.addColumn("Valor");
        
        CuentaContable cuentasContablesRep;
        //recorrido del ArrayList usando un iterador
        Iterator it = cuentasContables.iterator();
        
        while(it.hasNext())
        {
            cuentasContablesRep = (CuentaContable)it.next();//casting del iterador al objeto CuentaContable
            
            String [] registro = {String.valueOf(cuentasContablesRep.getIdCta()), 
                cuentasContablesRep.getNombreCta(),
                String.valueOf(cuentasContablesRep.getValorCta())};
            tableModel.addRow(registro);
        }      
        return tableModel;
    }
    
    //metodos para llenar listas
    public DefaultComboBoxModel fillProductsList(){
        DefaultComboBoxModel comboModel = new DefaultComboBoxModel();
        Iterator it = products.iterator();
        Producto productoRep;
        while(it.hasNext())
        {
            productoRep = (Producto)it.next();//casting del iterador al objeto Product
            comboModel.addElement(productoRep.getNombreProducto());
        }      
        return comboModel;
    }
    
    public DefaultComboBoxModel fillClientesList(){
        DefaultComboBoxModel comboModel = new DefaultComboBoxModel();
        Iterator it = people.iterator();
        Persona personaRep;
        while(it.hasNext())
        {
            personaRep = (Persona)it.next();//casting del iterador al objeto Persona
            comboModel.addElement(personaRep.getName());
        }      
        return comboModel;
    }
    
    public DefaultComboBoxModel fillTipoRegimenList(){
        DefaultComboBoxModel comboModel = new DefaultComboBoxModel();
        Iterator it = regimen.iterator();
        Regimen regimenRep;
        while(it.hasNext())
        {
            regimenRep = (Regimen)it.next();//casting del iterador al objeto Regimen
            comboModel.addElement(regimenRep.getTipoRegimen());
        }      
        return comboModel;
    }
    
    public double getProductValue(String name){
        return productController.getPrecioProducto(name);
    }
    
    public int getPersonId(String name){
        return peopleController.getPersonId(name);
    }
    
}
