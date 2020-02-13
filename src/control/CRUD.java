/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import model.Producto;
import model.Factura;
import model.Persona;
import control.Validation;
import static control.Validation.verifyDataPerson;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;
import model.BaseDatos;
import model.Regimen;

/**
 *
 * @author Omar Beltrán
 */
public class CRUD {

    private final BaseDatos baseDatos;
    private final ArrayList<Factura> facturas;
    private final ArrayList<Producto> productos;
    private final ArrayList<Persona> personas;
    private final ArrayList<Regimen> regimen;
    
    public CRUD(){
        baseDatos = BaseDatos.getInstance();
        facturas = baseDatos.getFacturas();
        productos = baseDatos.getProductos();
        personas = baseDatos.getPersonas();
        regimen = baseDatos.getRegimen();
    }
    
    public void initBD()
    {
        loadDefaultPersona();
        loadDefaultProductos();
    }
    
    public int getnFactura(){
        return facturas.size();
    }
    
    public double getPrecioProducto(String name){
        return getPrecioProductoByName(name);
    }
    
    private void loadDefaultPersona()
    {
        Persona person = new Persona(0, " ");
        if(verifyDataPerson(person.getName(), person.getIdPersona()))
            addPersona(person);
        
        Persona person1 = new Persona(80742375, "Omar Beltrán");
        if(Validation.verifyDataPerson(person1.getName(), person1.getIdPersona()))
            addPersona(person1);
        
        Persona person2 = new Persona(1098761089, "Maria Daza");
        if(Validation.verifyDataPerson(person2.getName(), person2.getIdPersona()))
            addPersona(person2);
        
        Persona person3 = new Persona(98761089, "Rigoberto Urán");
        if(Validation.verifyDataPerson(person3.getName(), person3.getIdPersona()))    
            addPersona(person3);
        
        Persona person4 = new Persona(108761489, "Piojo Lopéz");
        if(Validation.verifyDataPerson(person4.getName(), person4.getIdPersona()))
            addPersona(person4);
        
        Persona person5 = new Persona(1087614879, "Valentino Rossi");
        if(Validation.verifyDataPerson(person5.getName(), person5.getIdPersona()))
            addPersona(person5);
        
        Persona person6 = new Persona (76543897, "Gonzalo Cardenas");
        if(Validation.verifyDataPerson(person6.getName(), person6.getIdPersona()))            
            addPersona(person6);
        
        Persona person7 = new Persona (86543897, "Martha Durango");
        if(Validation.verifyDataPerson(person7.getName(), person7.getIdPersona()))
            addPersona(person7);
        
        Persona person8 = new Persona (96543897, "Jhon Milquiades" );
        if(Validation.verifyDataPerson(person8.getName(), person8.getIdPersona()))
            addPersona(person8);
        
        Persona person9 = new Persona (176543897, "William Perdomo");
        if(Validation.verifyDataPerson(person9.getName(), person9.getIdPersona()))
            addPersona(person9);
        
        Persona person10 = new Persona (186543897, "Héctor Valenzuela");
        if(Validation.verifyDataPerson(person10.getName(), person10.getIdPersona()))
            addPersona(person10);
        
        Persona person11 = new Persona (196543897, "Julio Pinzón");
        if(Validation.verifyDataPerson(person11.getName(), person11.getIdPersona()))
            addPersona(person11);
        
        Persona person12 = new Persona (276543897, "Bart Simpson");
        if(Validation.verifyDataPerson(person12.getName(), person12.getIdPersona()))
            addPersona(person12);
        
        Persona person13 = new Persona (376543897, "Cristian Fox");
        if(Validation.verifyDataPerson(person13.getName(), person13.getIdPersona()))
            addPersona(person13);
        
        Persona person14 = new Persona (476543897, "Miguel Sastoque");
        if(Validation.verifyDataPerson(person14.getName(), person14.getIdPersona()))
            addPersona(person14);
        
        Persona person15 = new Persona (576543897, "Edwin Franco");
        if(Validation.verifyDataPerson(person15.getName(), person15.getIdPersona()))
            addPersona(person15);
    }
    
    private void loadDefaultProductos()
    {
        Producto producto0 = new Producto(0, 0, "N.A");
        if(Validation.verifyDataProducto(producto0.getNombreProducto(), producto0.getIdProducto()))
            addProducto(producto0);
        
        Producto producto1 = new Producto(1, 5000, "compas");
        if(Validation.verifyDataProducto(producto1.getNombreProducto(), producto1.getIdProducto()))
            addProducto(producto1);
        
        Producto producto2 = new Producto(2, 2000, "regla");
        if(Validation.verifyDataProducto(producto2.getNombreProducto(), producto2.getIdProducto()))
            addProducto(producto2);
        
        Producto producto3 = new Producto(3, 1000, "borrador");
        if(Validation.verifyDataProducto(producto3.getNombreProducto(), producto3.getIdProducto()))    
            addProducto(producto3);
        
        Producto producto4 = new Producto(4, 800, "lapiz");
        if(Validation.verifyDataProducto(producto4.getNombreProducto(), producto4.getIdProducto()))
            addProducto(producto4);
        
        Producto producto5 = new Producto(5, 1000, "esfero");
        if(Validation.verifyDataProducto(producto5.getNombreProducto(), producto5.getIdProducto()))
            addProducto(producto5);
        
        Producto producto6 = new Producto (6, 100, "Hoja examen");
        if(Validation.verifyDataProducto(producto6.getNombreProducto(), producto6.getIdProducto()))            
            addProducto(producto6);
        
        Producto producto7 = new Producto (7, 5000, "resma papel");
        if(Validation.verifyDataProducto(producto7.getNombreProducto(), producto7.getIdProducto()))
            addProducto(producto7);
        
        Producto producto8 = new Producto (8, 3000, "cuaderno");
        if(Validation.verifyDataProducto(producto8.getNombreProducto(), producto8.getIdProducto()))
            addProducto(producto8);
        
        Producto producto9 = new Producto (9, 5000, "compas");
        if(Validation.verifyDataProducto(producto9.getNombreProducto(), producto9.getIdProducto()))
            addProducto(producto9);
        
        Producto producto10 = new Producto (10, 2500, "pegante");
        if(Validation.verifyDataProducto(producto10.getNombreProducto(), producto10.getIdProducto()))
            addProducto(producto10);
        
        Producto producto11 = new Producto (11, 3000, "tijeras");
        if(Validation.verifyDataProducto(producto11.getNombreProducto(), producto11.getIdProducto()))
            addProducto(producto11);
        
        Producto producto12 = new Producto (12, 15000, "multimaterias");
        if(Validation.verifyDataProducto(producto12.getNombreProducto(), producto12.getIdProducto()))
            addProducto(producto12);
    }
    
    public boolean addPersona(String id, String name){
        Persona personTmp = new Persona(Integer.valueOf(id), name);
        return addPersona(personTmp);
    }
    
    public boolean addProducto(String id, String valor, String nombre){
        Producto productoTmp = new Producto(id, valor, nombre);
        return addProducto(productoTmp);
    }
    
    public boolean addFactura(String id, String valor, String nombre){
        Producto productoTmp = new Producto(id, valor, nombre);
        return addProducto(productoTmp);
    }
    
    private boolean addPersona(Persona personNew)
    {
        boolean flag = false;
        if(personas.isEmpty()){
            personas.add(personNew);
            flag = true;
        }    
        else
        {
            for (int index = 0; index < personas.size() ; index++)
            {
                if(findPersonById(personNew.getIdPersona()) == null)
                {//if not exist, agree person
                   personas.add(personNew);
                   flag = true;
                   index = personas.size();
                }
            }
        }
        return flag;
    }
    
    private boolean addProducto(Producto productoNew)
    {
        boolean flag = false;
        if(productos.isEmpty()){
            productos.add(productoNew);
            flag = true;
        }    
        else
        {
            for (int index = 0; index < productos.size() ; index++)
            {
                if(findProductoById(productoNew.getIdProducto()) == null)
                {//if not exist, agree person
                   productos.add(productoNew);
                   flag = true;
                   index = productos.size();
                }
            }
        }
        return flag;
    }
    
    private boolean addFactura(Factura facturaNew)
    {
        boolean flag = false;
        if(facturas.isEmpty()){
            facturas.add(facturaNew);
            flag = true;
        }    
        else
        {
            for (int index = 0; index < personas.size() ; index++)
            {
                if(findFacturaById(facturaNew.getIdFactura()) == null)
                {//if not exist, agree factura
                   facturas.add(facturaNew);
                   flag = true;
                   index = facturas.size();
                }
            }
        }
        return flag;
    }
    
    //metodos de busquedas para personas
    private Persona findPersonById(int id)
    {      
        Persona person;
        //se esta insertando el primer registro
        if(personas.isEmpty())
        {
            return null;
        }    
        else
        {
            //recorrido del ArrayList usando un iterador
            Iterator it = personas.iterator();
            while(it.hasNext())
            {
                person = (Persona)it.next();//casting del iterador al objeto Client
                if(person.getIdPersona() == id)
                {
                    return person;
                }    
            }    
        }       
        return null;
    }
    
    private Persona findPersonByName(String name)
    {      
        Persona person;
        //se esta insertando el primer registro
        if(personas.isEmpty())
        {
            return null;
        }    
        else
        {
            //recorrido del ArrayList usando un iterador
            Iterator it = personas.iterator();
            while(it.hasNext())
            {
                person = (Persona)it.next();//casting del iterador al objeto Client
                if(person.getName().equals(name))
                {
                    return person;
                }    
            }    
        }       
        return null;
    }
    
    private Factura findFacturaById(int id)
    {      
        Factura factura;
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
                factura = (Factura)it.next();//casting del iterador al objeto Client
                if(factura.getIdFactura() == id)
                {
                    return factura;
                }    
            }    
        }       
        return null;
    }
    
    private Persona getPersonByName(String name){
        Persona person;
        person = findPersonByName(name);
        return person;
    }
        
    public boolean existPersonId(String id){
        return Validation.isDigit(id) && findPersonById(Integer.parseInt(id)) != null;
    }
     
    public String getPersonName(String id){
        Persona person;
        person = findPersonById(Integer.parseInt(id));
        return person.getName();
    }
    
    public int getPersonId(String name){
        Persona person;
        person = findPersonByName(name);
        return person.getIdPersona();
    }
    
    //metodos de busqueda para productos
    private Producto findProductoById(int id)
    {      
        Producto producto;
        //se esta insertando el primer registro
        if(productos.isEmpty())
        {
            return null;
        }    
        else
        {
            //recorrido del ArrayList usando un iterador
            Iterator it = productos.iterator();
            while(it.hasNext())
            {
                producto = (Producto)it.next();//casting del iterador al objeto Producto
                if(producto.getIdProducto()== id)
                {
                    return producto;
                }    
            }    
        }       
        return null;
    }
    
    private Producto findProductoByName(String name)
    {      
        Producto producto;
        //se esta insertando el primer registro
        if(productos.isEmpty())
        {
            return null;
        }    
        else
        {
            //recorrido del ArrayList usando un iterador
            Iterator it = productos.iterator();
            while(it.hasNext())
            {
                producto = (Producto)it.next();//casting del iterador al objeto Client
                if(producto.getNombreProducto().equals(name))
                {
                    return producto;
                }    
            }    
        }       
        return null;
    }
    
    private Producto getProductoByName(String name){
        Producto producto;
        producto = findProductoByName(name);
        return producto;
    }
        
    public boolean existProductoId(String id){
        return Validation.isDigit(id) && findProductoById(Integer.parseInt(id)) != null;
    }
     
    public String getProductoName(String id){
        Producto producto;
        producto = findProductoById(Integer.parseInt(id));
        return producto.getNombreProducto();
    }
    
    private double getPrecioProductoByName(String name){
        Producto producto;
        producto = findProductoByName(name);
        return producto.getValor();
    } 
    
    //metodos de consulta
    public DefaultTableModel getPersonas(){
        DefaultTableModel tableModel = new DefaultTableModel();
        tableModel.addColumn("ID");
        tableModel.addColumn("Nombre");
        
        Persona personaRep;
        //recorrido del ArrayList usando un iterador
        Iterator it = personas.iterator();
        
        while(it.hasNext())
        {
            personaRep = (Persona)it.next();//casting del iterador al objeto Persona
            
            String [] registro = {String.valueOf(personaRep.getIdPersona()), personaRep.getName()};
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
        Iterator it = productos.iterator();
        
        while(it.hasNext())
        {
            productoRep = (Producto)it.next();//casting del iterador al objeto Producto
            
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
            facturaRep = (Factura)it.next();//casting del iterador al objeto Producto
            
            String [] registro = {String.valueOf(facturaRep.getIdFactura()), 
                getPersonName(String.valueOf(facturaRep.getIdPersona())),
                ""};
            tableModel.addRow(registro);
        }      
        return tableModel;
    }
    
    //metodos para llenar listas
    public DefaultComboBoxModel fillProductosList(){
        DefaultComboBoxModel comboModel = new DefaultComboBoxModel();
        Iterator it = productos.iterator();
        Producto productoRep;
        while(it.hasNext())
        {
            productoRep = (Producto)it.next();//casting del iterador al objeto Producto
            comboModel.addElement(productoRep.getNombreProducto());
        }      
        return comboModel;
    }
    
    public DefaultComboBoxModel fillClientesList(){
        DefaultComboBoxModel comboModel = new DefaultComboBoxModel();
        Iterator it = personas.iterator();
        Persona personaRep;
        while(it.hasNext())
        {
            personaRep = (Persona)it.next();//casting del iterador al objeto Persona
            comboModel.addElement(personaRep.getName());
        }      
        return comboModel;
    }
}
