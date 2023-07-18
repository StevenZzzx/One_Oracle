/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto_bytebank;

/**
 *
 * @author Steven
 */
public class TestReferencia3 {
    public static void main(String[] args) {
        Cuenta cuentaDeDiego = new Cuenta(464);

        // cuentaDeDiego.titular = new Cliente();
        // cuentaDeDiego.titular.nombre = "Diego";

        System.out.println(cuentaDeDiego.getTitular().getDocumento());
    }
}
