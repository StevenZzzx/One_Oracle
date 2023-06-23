/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PracticandoCiclos;

/**
 *
 * @author Steven
 */
public class EjemploCiclosWhile2 {
    public static void main(String[] args) {

        int contador = 0;
        int total = 0;

        while (contador <= 10) { 
            total += contador;
            contador++;
        }
        System.out.println(total);
    }
}
