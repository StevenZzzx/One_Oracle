/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto_bytebank;

/**
 *
 * @author Steven
 */
public class PruebaMetodos {
    public static void main(String[] args) {
        Cuenta miCuenta = new Cuenta(222);
        miCuenta.depositar(300);
        miCuenta.depositar(200);
        System.out.println(miCuenta.getSaldo());

        miCuenta.retirar(100);
        System.out.println(miCuenta.getSaldo());

        Cuenta cuentaDeJimena = new Cuenta(999);
        cuentaDeJimena.depositar(1000);
        
        boolean puedeTransferir = cuentaDeJimena.transferir(500, miCuenta);

        if(puedeTransferir){
            System.out.println("Transferencia exitosa");
        }else{
            System.out.println("No puede transferir");
        }

        System.out.println(miCuenta.getSaldo());
        System.out.println(cuentaDeJimena.getSaldo());
    }
}
