/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PracticandoCondicionales;

/**
 *
 * @author Steven
 */
public class EjemploCondicionales2 {

    public static void main(String[] args) {

        int edad = 21;
        int cantidadPersonas = 2;
        
        boolean esPareja = cantidadPersonas > 1;
        boolean puedeEntrar = edad >= 18 && esPareja;

        if (puedeEntrar) {
            System.out.println("Usted puede entrar");
            System.out.println("Bienvenido!");
        } else {
            System.out.println("Usted no tiene permitido a entrar");
        }
    }
}
