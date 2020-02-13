/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import static control.Validation.isDigit;
import static control.Validation.verifyDataRegimen;
import java.util.ArrayList;
import java.util.Iterator;
import model.BaseDatos;
import model.Regimen;

/**
 *
 * @author prog3
 */
public class ControladorRegimen {
    private static ArrayList<Regimen> regimen = BaseDatos.getInstance().getRegimen();
    
    public ControladorRegimen(){
        loadDefaultRegimen();
    }

    ControladorRegimen(BaseDatos BD) {
        regimen = BD.getRegimen();
        loadDefaultRegimen();
    }
    
    private void loadDefaultRegimen()
    {
        Regimen regimen1 = new Regimen(1);
        if(verifyDataRegimen(regimen1.getTipoRegimen(), regimen1.getIdRegimen()))
            addRegimen(regimen1);
        
        Regimen regimen2 = new Regimen(2);
        if(verifyDataRegimen(regimen2.getTipoRegimen(), regimen2.getIdRegimen()))
            addRegimen(regimen2);
        
        Regimen regimen3 = new Regimen(3);
        if(verifyDataRegimen(regimen3.getTipoRegimen(), regimen3.getIdRegimen()))
            addRegimen(regimen3);
    }
    
    public boolean addRegimen(String id){
        Regimen regimenTmp = new Regimen(Integer.valueOf(id));
        return addRegimen(regimenTmp);
    }
    
    private boolean addRegimen(Regimen regimenNew)
    {
        boolean flag = false;
        if(regimen.isEmpty()){
            regimen.add(regimenNew);
            flag = true;
        }    
        else
        {
            for (int index = 0; index < regimen.size() ; index++)
            {
                if(findRegimenById(regimenNew.getIdRegimen()) == null)
                {//if not exist, agree regimen
                   regimen.add(regimenNew);
                   flag = true;
                   index = regimen.size();
                }
            }
        }
        return flag;
    }
    
    //metodos de busquedas para regimen
    private static Regimen findRegimenById(int id)
    {      
        Regimen regimenTmp;
        //se esta insertando el primer registro
        if(regimen.isEmpty())
        {
            return null;
        }    
        else
        {
            //recorrido del ArrayList usando un iterador
            Iterator it = regimen.iterator();
            while(it.hasNext())
            {
                regimenTmp = (Regimen)it.next();//casting del iterador al objeto Regimen
                if(regimenTmp.getIdRegimen()== id)
                {
                    return regimenTmp;
                }    
            }    
        }       
        return null;
    }
    
    private static Regimen findRegimenByName(String name)
    {      
        Regimen regimenTmp;
        //se esta insertando el primer registro
        if(regimen.isEmpty())
        {
            return null;
        }    
        else
        {
            //recorrido del ArrayList usando un iterador
            Iterator it = regimen.iterator();
            while(it.hasNext())
            {
                regimenTmp = (Regimen)it.next();//casting del iterador al objeto Regimen
                if(regimenTmp.getTipoRegimen().equals(name))
                {
                    return regimenTmp;
                }    
            }    
        }       
        return null;
    }
    
    private Regimen getRegimenByName(String name){
        Regimen regimenTmp;
        regimenTmp = findRegimenByName(name);
        return regimenTmp;
    }
        
    public boolean existRegimenId(String id){
        return isDigit(id) && findRegimenById(Integer.parseInt(id)) != null;
    }
     
    public static String getRegimenName(String id){
        Regimen regimenTmp;
        regimenTmp = findRegimenById(Integer.parseInt(id));
        return regimenTmp.getTipoRegimen();
    }
    
    public static int getRegimenId(String name){
        Regimen regimenTmp;
        regimenTmp = findRegimenByName(name);
        return regimenTmp.getIdRegimen();
    }
}
