/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import model.Producto;
import static control.Validation.verifyDataProducto;
import static control.Validation.isDigit;
import java.util.ArrayList;
import java.util.Iterator;
import model.BaseDatos;

public class ControladorProducto {
   
    //*****atributos de la clase*******
    private final ArrayList<Producto> productos;
       
    //*****************************************************
    //**************Métodos de acceso público**************
    //*****************************************************
    public ControladorProducto(){
        productos = BaseDatos.getInstance().getProductos();
        loadDefaultProductos();
    }

    ControladorProducto(BaseDatos BD) {
        productos = BD.getProductos();
        loadDefaultProductos();
    }

    ControladorProducto(ArrayList productos) {
        this.productos = productos;
        loadDefaultProductos();
    }
    
    public double getPrecioProducto(String name){
        return getPrecioProductoByName(name);
    }
    
    public String getNombreProducto(String id){
        Producto producto;
        producto = findProductoById(Integer.parseInt(id));
        return producto.getNombreProducto();
    }
    
    public boolean existeIdProducto(String id){
        return isDigit(id) && findProductoById(Integer.parseInt(id)) != null;
    }
    
    public boolean agregarProducto(String id, String valor, String nombre){
        Producto productoTmp = new Producto(id, valor, nombre);
        return agregarProducto(productoTmp);
    }
    //*****************************************************
    //***********Fin métodos de acceso público*************
    //*****************************************************
    
    private void loadDefaultProductos()
    {
        Producto producto0 = new Producto(0, 0, "N.A");
        if(verifyDataProducto(producto0.getNombreProducto(), producto0.getIdProducto()))
            agregarProducto(producto0);
        
        Producto producto1 = new Producto(1, 5000, "compas");
        if(verifyDataProducto(producto1.getNombreProducto(), producto1.getIdProducto()))
            agregarProducto(producto1);
        
        Producto producto2 = new Producto(2, 2000, "regla");
        if(verifyDataProducto(producto2.getNombreProducto(), producto2.getIdProducto()))
            agregarProducto(producto2);
        
        Producto producto3 = new Producto(3, 1000, "borrador");
        if(verifyDataProducto(producto3.getNombreProducto(), producto3.getIdProducto()))    
            agregarProducto(producto3);
        
        Producto producto4 = new Producto(4, 800, "lapiz");
        if(verifyDataProducto(producto4.getNombreProducto(), producto4.getIdProducto()))
            agregarProducto(producto4);
        
        Producto producto5 = new Producto(5, 1000, "esfero");
        if(verifyDataProducto(producto5.getNombreProducto(), producto5.getIdProducto()))
            agregarProducto(producto5);
        
        Producto producto6 = new Producto (6, 100, "Hoja examen");
        if(verifyDataProducto(producto6.getNombreProducto(), producto6.getIdProducto()))            
            agregarProducto(producto6);
        
        Producto producto7 = new Producto (7, 5000, "resma papel");
        if(verifyDataProducto(producto7.getNombreProducto(), producto7.getIdProducto()))
            agregarProducto(producto7);
        
        Producto producto8 = new Producto (8, 3000, "cuaderno");
        if(verifyDataProducto(producto8.getNombreProducto(), producto8.getIdProducto()))
            agregarProducto(producto8);
        
        Producto producto9 = new Producto (9, 5000, "compas");
        if(verifyDataProducto(producto9.getNombreProducto(), producto9.getIdProducto()))
            agregarProducto(producto9);
        
        Producto producto10 = new Producto (10, 2500, "pegante");
        if(verifyDataProducto(producto10.getNombreProducto(), producto10.getIdProducto()))
            agregarProducto(producto10);
        
        Producto producto11 = new Producto (11, 3000, "tijeras");
        if(verifyDataProducto(producto11.getNombreProducto(), producto11.getIdProducto()))
            agregarProducto(producto11);
        
        Producto producto12 = new Producto (12, 15000, "multimaterias");
        if(verifyDataProducto(producto12.getNombreProducto(), producto12.getIdProducto()))
            agregarProducto(producto12);
    }
    
    private boolean agregarProducto(Producto productoNew)
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
                producto = (Producto)it.next();//casting del iterador al objeto Product
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
        
    private double getPrecioProductoByName(String name){
        Producto producto;
        producto = findProductoByName(name);
        return producto.getValor();
    } 
    
}
