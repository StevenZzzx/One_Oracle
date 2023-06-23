/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PracticandoCondicionales;

/**
 *
 * @author Steven
 */
public class EjemploCondicionales {

    public static void main(String[] args) {

        int edad = 17;
        int cantidad = 2;

        if (edad >= 18) {
            System.out.println("Usted puede entrar");
            System.out.println("Bienvenido!");
        } else {
            if (cantidad >= 2) {
                System.out.println("Usted es menor de edad pero esta permitido su ingreso");
            } else {
                System.out.println("Usted no esta permitido a entrar");
            }
        }
    }
}
