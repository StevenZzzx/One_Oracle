/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PracticandoCiclos;

/**
 *
 * @author Steven
 */
public class EjercicioTablaMultiplicar {
    public static void main(String[] args) {
        
        for(int contador = 0; contador <= 10; contador++){

            for(int multiplicacion = 0; multiplicacion <= 10; multiplicacion++){
                System.out.print(contador * multiplicacion);
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
