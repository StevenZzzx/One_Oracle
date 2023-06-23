/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PracticandoCiclos;

/**
 *
 * @author Steven
 */
public class DesafioMultiplosDe3 {
    public static void main(String[] args) {
        for (int numero = 0; numero <= 100; numero++) {
            if (numero % 3 == 0) {
                System.out.print(numero);
                System.out.print(" ");
            }
        }
        System.out.println();

        // otra forma de hacerlo
        for (int i = 3; i < 100; i += 3) {
            System.out.println(i);
        }
    }
}
