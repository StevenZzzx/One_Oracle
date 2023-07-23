/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java_pila_ejecucion;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Steven
 */
public class TestCuentaExceptionChecked {
    
    public static void main(String[] args) {
        
        Cuenta cuenta = new Cuenta();
        try {    
            cuenta.deposita();
        } catch (MiException ex) {
           ex.printStackTrace();
        }
    }
}
