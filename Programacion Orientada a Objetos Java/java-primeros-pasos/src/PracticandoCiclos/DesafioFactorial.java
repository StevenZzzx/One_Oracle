/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PracticandoCiclos;

/**
 *
 * @author Steven
 */
public class DesafioFactorial {
    public static void main(String[] args) {
        
        int factorial = 1;
        for(int i = 1; i <= 10; i++){
            factorial *= i;
            System.out.println("Factorial de " + i + " = " + factorial);
        }
    }
}
