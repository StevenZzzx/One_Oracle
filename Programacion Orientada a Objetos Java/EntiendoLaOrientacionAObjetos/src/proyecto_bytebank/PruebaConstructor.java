/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto_bytebank;

/**
 *
 * @author Steven
 */
public class PruebaConstructor {
    public static void main(String[] args) {
        Cuenta cuenta = new Cuenta(555);
        Cuenta cuenta2 = new Cuenta(444);    
        
        System.out.println(Cuenta.getTotal());
    }
}