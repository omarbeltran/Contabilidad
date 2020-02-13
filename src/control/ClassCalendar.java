/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author Omar Beltran
 */
public class ClassCalendar {
    
    public ClassCalendar(){
        
    }
    
    private int second, minute, hour, day, month, year;
    private Calendar calendar;
    public String getCurrentTime(int option){
        //Calendar calendario = Calendar.getInstance();
        String timeString;
        calendar = new GregorianCalendar();
        hour = calendar.get(Calendar.HOUR_OF_DAY);
        minute = calendar.get(Calendar.MINUTE);
        second = calendar.get(Calendar.SECOND);
        timeString = "";
        switch (option){
            case 1:{
                timeString = String.valueOf(hour) + ":"+String.valueOf(minute)+":"+String.valueOf(second);
                break;
            }
            case 2:{
                timeString = String.valueOf(hour) + String.valueOf(minute) + String.valueOf(second);
                break;
            }
        }
        return timeString;
    }
    
    public String getDate(int option){
        String dateString;
        calendar = new GregorianCalendar();
        day = calendar.get(Calendar.DAY_OF_MONTH);
        month = calendar.get(Calendar.MONTH)+1;
        year = calendar.get(Calendar.YEAR);
        dateString = "";
        switch (option){
            case 1:{
                dateString = day+"/"+month+"/"+year;
                break;
            }
            case 2:{
                dateString = String.valueOf(day+month+year);
                break;
            }
        }
            
        return dateString;
    }

    /**El valor de l retorno determina si son fechas iguales o si una esmayor que la otra
     * @param date
     * @return  0 cuando las fechas son iguales
     *          mayor que 0 cuando la fecha recibida como parametro es mayor que la fecha del sistema 
     *          menor que 0 cuando la fecha recibida como parametro es menor que la fecha del sistema
     */
    public int validateCurrentDate(String date){
        return Integer.parseInt(date) - Integer.parseInt(getDate(2));
    }    
}