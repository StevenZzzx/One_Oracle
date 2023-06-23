/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PracticandoCiclos;

/**
 *
 * @author Steven
 */
public class EjercicioMatriz {
    
    public static void main(String[] args) {
        
        for(int fila = 0; fila <= 10; fila++){

            for(int columna = 0; columna < fila; columna++){
                System.out.print("*");
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
