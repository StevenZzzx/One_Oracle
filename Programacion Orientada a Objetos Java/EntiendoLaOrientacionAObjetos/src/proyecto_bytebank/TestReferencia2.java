/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto_bytebank;

/**
 *
 * @author Steven
 */
public class TestReferencia2 {
    public static void main(String[] args) {
        Cliente diego = new Cliente();
        diego.setNombre("Diego");
        diego.setDocumento("4555444332"); 
        diego.setTelefono("888444997"); 

        Cuenta cuentaDeDiego = new Cuenta(454);
        cuentaDeDiego.setAgencia(1);
        cuentaDeDiego.setTitular(diego);

        System.out.println(cuentaDeDiego.getTitular().getDocumento());
        System.out.println(cuentaDeDiego.getTitular());
        System.out.println(diego);

    }
}
