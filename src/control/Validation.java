/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import static java.util.regex.Pattern.matches;

/**
 *
 * @author Omar Beltrán
 */
public final class Validation {
    
    /**Este método permite determinar si una cadena de caracteres cualesquiera está
     * conformada unicamente por carácteres alfabeticos, los caracteres alfabeticos válidos son:
     * - Letras mayúsculas [A-Z]
     * - Letras minúsculas [a-z]
     * - Caracteres especiales como:
     *      - Vocales con acentuación
     *      - Espacio en blanco
     *      - Los caracteres Ñ, ñ
     * @param cadena contiene la cadena de caracteres que se desea evaluar
     * @return true si el parámetro de entrada satisface las reglas validadas
     *         false en cualquier otro caso
     */
    public static boolean isStringName(String cadena)
    {
        boolean flag = true;//se asume que la cadena es válida por tanto se deja por defecto true
        int index;
        for (index = 0; index < cadena.length(); index++) {
            if((cadena.charAt(index)< 65 || cadena.charAt(index)> 90) && //LETRAS MAYUSCULAS 
               (cadena.charAt(index)< 97 || cadena.charAt(index) > 122) &&//letras minúsculas 
               (cadena.charAt(index) != 'ñ' && cadena.charAt(index) != 'Ñ' && //la Ñ ñ se considera caracter especial
                cadena.charAt(index) != 'á' && cadena.charAt(index) != 'é' &&
                cadena.charAt(index) != 'í' && cadena.charAt(index) != 'ó' &&    
                cadena.charAt(index) != 'ú' &&//validar las vocales con tílde   
                cadena.charAt(index) != '.' &&//el punto debe ser permitido                    
                cadena.charAt(index) != ' ')){//el espacio en blanco debe ser permitido                   
                    flag = false;//como no cumple la regla el retorno se cambia a false
                    index = cadena.length()+1;//cuando se encuentra un carácter inválido se debe finalizar el bucle
            }//end if 
        }//end for index 
        return flag;
    }//end isString
    
    /**Evalúa si los valores contenidos en el parametro son solo digitos
     * @param id valor que se desea verificar
     * @return true si id contiene solo digitos
     *         false en cualquier otro caso
     */
    public static boolean isDigit(String id)
    {    
        return matches("[0-9]+",id);
    }
    
    public static boolean isValue(String cadena)
    {    
        boolean flag = true;//se asume que la cadena es válida por tanto se deja por defecto true
        int index;
        for (index = 0; index < cadena.length(); index++) {
            if((cadena.charAt(index) < 47 || cadena.charAt(index) > 57) && //acepta números
               cadena.charAt(index) == '.'){
                flag = false;//como no cumple la regla el retorno se cambia a false
                index = cadena.length()+1;//cuando se encuentra un carácter inválido se debe finalizar el bucle
            }    
        }
        return flag;
    }
    
    private boolean isStringAlphaNumeric(String cadena){
        boolean flag = true;//se asume que la cadena es válida por tanto se deja por defecto true
        int index;
        for (index = 0; index < cadena.length(); index++) {
            if((cadena.charAt(index) < 47 || cadena.charAt(index) > 57) && //acepta números
              ((cadena.charAt(index)< 65 || cadena.charAt(index)> 90) && //LETRAS MAYUSCULAS 
               (cadena.charAt(index)< 97 || cadena.charAt(index) > 122) &&//letras minúsculas
               (cadena.charAt(index) != 'ñ' && cadena.charAt(index) != 'Ñ' && //la Ñ ñ se considera caracter especial
                cadena.charAt(index) != 'á' && cadena.charAt(index) != 'é' &&
                cadena.charAt(index) != 'í' && cadena.charAt(index) != 'ó' &&    
                cadena.charAt(index) != 'ú' &&//validar las vocales con tílde     
                cadena.charAt(index) != '.' &&//el punto debe ser permitido                    
                cadena.charAt(index) != ' '))){//el espacio en blanco debe ser permitido                   
                    flag = false;//como no cumple la regla el retorno se cambia a false
                    index = cadena.length()+1;//cuando se encuentra un carácter inválido se debe finalizar el bucle
            }//end if 
        }//end for index 
        return flag; 
    }
    
    /*public boolean verifyDataPerson(Persona person){
        return isDigit(String.valueOf(person.getId())) && isStringName(person.getName());
    }*/
   
    public static boolean verifyDataPerson(String name, String id){
        return isDigit(id) && isStringName(name);
    }
    
    public static boolean verifyDataPerson(String name, int id){
        return isDigit(String.valueOf(id)) && isStringName(name);
    }
    
    public static boolean verifyDataPerson(String name, String id, String tipoRegimen) {
        return verifyDataPerson(name, id);
    }
     
    public static boolean verifyDataProducto(String name, int id){
        return isDigit(String.valueOf(id)) && isStringName(name);
    }
    
    public static boolean validateData(String name, String id)
    {
        return isDigit(id) && isStringName(name);
    }
    
    public static boolean verifyDataRegimen(String tipoRegimen, int idRegimen) {
        return verifyDataPerson(tipoRegimen, idRegimen);
    }
    
    public static boolean verifyDataRegimen(String tipoRegimen) {
        return isStringName(tipoRegimen);
    }
}
