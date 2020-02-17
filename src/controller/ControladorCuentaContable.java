/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.ArrayList;
import model.BaseDatos;
import model.CuentaContable;
import static control.Validation.verifyDataCuentaContable;
import static control.Validation.isDigit;
import java.util.Iterator;

/**
 *
 * @author Omar Beltrán
 */
public class ControladorCuentaContable {
    private static ArrayList<CuentaContable> cuentasContable = BaseDatos.getInstance().getCuentasContables();
    
    public ControladorCuentaContable(){
        loadDefaultCuentaContable();
    }

    ControladorCuentaContable(BaseDatos BD) {
        cuentasContable = BD.getCuentasContables();
        loadDefaultCuentaContable();
    }
    
    private void loadDefaultCuentaContable()
    {
        /**Cuando se crea una cuenta contable se debe asignar un número de 
         * identificación el cual debe coincidir con el establecido en el PUC
         * (PLAN UNICO DE CUENTAS).
         */
        CuentaContable cuentaContable = new CuentaContable(0, " ");
        if(verifyDataCuentaContable(cuentaContable.getNombreCta(), cuentaContable.getIdCta()))
            addCuentaContable(cuentaContable);
    }
    
    public boolean addCuentaContable(String id, String name){
        CuentaContable cuentaContableTmp = new CuentaContable(Integer.valueOf(id), name);
        return addCuentaContable(cuentaContableTmp);
    }
    
    private boolean addCuentaContable(CuentaContable cuentaContableNew)
    {
        boolean flag = false;
        if(cuentasContable.isEmpty()){
            cuentasContable.add(cuentaContableNew);
            flag = true;
        }    
        else
        {
            for (int index = 0; index < cuentasContable.size() ; index++)
            {
                if(findAccountById(cuentaContableNew.getIdCta()) == null)
                {//if not exist, agree cuentaContable
                   cuentasContable.add(cuentaContableNew);
                   flag = true;
                   index = cuentasContable.size();
                }
            }
        }
        return flag;
    }
    
    //metodos de busquedas para cuentas contables
    private static CuentaContable findAccountById(int id)
    {      
        CuentaContable cuentaContable;
        //se esta insertando el primer registro
        if(cuentasContable.isEmpty())
        {
            return null;
        }    
        else
        {
            //recorrido del ArrayList usando un iterador
            Iterator it = cuentasContable.iterator();
            while(it.hasNext())
            {
                cuentaContable = (CuentaContable)it.next();//casting del iterador al objeto CuentaContable
                if(cuentaContable.getIdCta()== id)
                {
                    return cuentaContable;
                }    
            }    
        }       
        return null;
    }
    
    private static CuentaContable findAccountByName(String name)
    {      
        CuentaContable cuentaContable;
        //se esta insertando el primer registro
        if(cuentasContable.isEmpty())
        {
            return null;
        }    
        else
        {
            //recorrido del ArrayList usando un iterador
            Iterator it = cuentasContable.iterator();
            while(it.hasNext())
            {
                cuentaContable = (CuentaContable)it.next();//casting del iterador al objeto CuentaContable
                if(cuentaContable.getNombreCta().equals(name))
                {
                    return cuentaContable;
                }    
            }    
        }       
        return null;
    }
    
    private CuentaContable getAccountByName(String name){
        CuentaContable cuentaContable;
        cuentaContable = findAccountByName(name);
        return cuentaContable;
    }
        
    public boolean existAccountId(String id){
        return isDigit(id) && findAccountById(Integer.parseInt(id)) != null;
    }
     
    public static String getAccountName(String id){
        CuentaContable cuentaContable;
        cuentaContable = findAccountById(Integer.parseInt(id));
        return cuentaContable.getNombreCta();
    }
    
    public int getAccountId(String name){
        CuentaContable cuentaContable;
        cuentaContable = findAccountByName(name);
        return cuentaContable.getIdCta();
    }
}
