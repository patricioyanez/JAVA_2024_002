/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Validacion;

import java.util.regex.Pattern;

/**
 *
 * @author patri
 */
public class Validacion {
    
    public static boolean soloLetras(String texto)
    {
        if(texto == null || texto.isEmpty())
            return false;
        
        return texto.matches("[a-zA-ZáéíóúÁÉÍÓÚÑñ]+");
    }
    public static boolean soloNumeros(String texto)
    {
        if(texto == null || texto.isEmpty())
            return false;
        
        return texto.matches("\\d+");
    }
    
    // se puede agregar varias validaciones  
    
    public static boolean esFormatoCorreo(String email)
    {
        if(email == null || email.isEmpty())
            return false;
        
        String emailRegex = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,6}$";
        return Pattern.matches(emailRegex, email);
    }
}
