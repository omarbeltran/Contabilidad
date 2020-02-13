/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.ArrayList;
import java.util.Iterator;
import model.BaseDatos;
import model.Persona;
import static control.Validation.verifyDataPerson;
import static control.Validation.isDigit;

/**
 *
 * @author prog3
 */
public class ControladorPersona{
    
    private static ArrayList<Persona> personas = BaseDatos.getInstance().getPersonas();
    
    public ControladorPersona(){
        loadDefaultPersona();
    }

    ControladorPersona(BaseDatos BD) {
        personas = BD.getPersonas();
        loadDefaultPersona();
    }
    
    private void loadDefaultPersona()
    {
        /**Cuando se crea una persona se debe asignar un tipo regimen,
         el tipo regimen está definido por un valor numérico cuya 
         equivalencia es: 
            1 "Regimen Contributivo"
            2 "Regimen Simplificado"
            3 "Regimen Gran Contribuyente"
        por defecto (si no se coloca el tipo regimen se deja "Regimen Contributivo"
        * */
        Persona person = new Persona(0, " ");
        if(verifyDataPerson(person.getName(), person.getIdPersona()))
            addPersona(person);
        
        Persona person1 = new Persona(80742375, "Omar Beltrán");
        if(verifyDataPerson(person1.getName(), person1.getIdPersona()))
            addPersona(person1);
        
        Persona person2 = new Persona(1098761089, "Maria Daza");
        if(verifyDataPerson(person2.getName(), person2.getIdPersona()))
            addPersona(person2);
        
        Persona person3 = new Persona(98761089, "Rigoberto Urán",2);
        if(verifyDataPerson(person3.getName(), person3.getIdPersona()))    
            addPersona(person3);
        
        Persona person4 = new Persona(108761489, "Piojo Lopéz",3);
        if(verifyDataPerson(person4.getName(), person4.getIdPersona()))
            addPersona(person4);
        
        Persona person5 = new Persona(1087614879, "Valentino Rossi",1);
        if(verifyDataPerson(person5.getName(), person5.getIdPersona()))
            addPersona(person5);
        
        Persona person6 = new Persona (76543897, "Gonzalo Cardenas");
        if(verifyDataPerson(person6.getName(), person6.getIdPersona()))            
            addPersona(person6);
        
        Persona person7 = new Persona (86543897, "Martha Durango");
        if(verifyDataPerson(person7.getName(), person7.getIdPersona()))
            addPersona(person7);
        
        Persona person8 = new Persona (96543897, "Jhon Milquiades" );
        if(verifyDataPerson(person8.getName(), person8.getIdPersona()))
            addPersona(person8);
        
        Persona person9 = new Persona (176543897, "William Perdomo");
        if(verifyDataPerson(person9.getName(), person9.getIdPersona()))
            addPersona(person9);
        
        Persona person10 = new Persona (186543897, "Héctor Valenzuela");
        if(verifyDataPerson(person10.getName(), person10.getIdPersona()))
            addPersona(person10);
        
        Persona person11 = new Persona (196543897, "Julio Pinzón");
        if(verifyDataPerson(person11.getName(), person11.getIdPersona()))
            addPersona(person11);
        
        Persona person12 = new Persona (276543897, "Bart Simpson");
        if(verifyDataPerson(person12.getName(), person12.getIdPersona()))
            addPersona(person12);
        
        Persona person13 = new Persona (376543897, "Cristian Fox");
        if(verifyDataPerson(person13.getName(), person13.getIdPersona()))
            addPersona(person13);
        
        Persona person14 = new Persona (476543897, "Miguel Sastoque");
        if(verifyDataPerson(person14.getName(), person14.getIdPersona()))
            addPersona(person14);
        
        Persona person15 = new Persona (576543897, "Edwin Franco");
        if(verifyDataPerson(person15.getName(), person15.getIdPersona()))
            addPersona(person15);
    }
    
    public boolean addPersona(String id, String name){
        Persona personTmp = new Persona(Integer.valueOf(id), name);
        return addPersona(personTmp);
    }
    
    public boolean addPersona(String id, String name, String tipoRegimen) {
        Persona personTmp = new Persona(id, name, ControladorRegimen.getRegimenId(tipoRegimen));
        return addPersona(personTmp);
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
    
    //metodos de busquedas para personas
    private static Persona findPersonById(int id)
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
    
    private static Persona findPersonByName(String name)
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
    
    private Persona getPersonByName(String name){
        Persona person;
        person = findPersonByName(name);
        return person;
    }
        
    public boolean existPersonId(String id){
        return isDigit(id) && findPersonById(Integer.parseInt(id)) != null;
    }
     
    public static String getPersonName(String id){
        Persona person;
        person = findPersonById(Integer.parseInt(id));
        return person.getName();
    }
    
    public int getPersonId(String name){
        Persona person;
        person = findPersonByName(name);
        return person.getIdPersona();
    }

}

