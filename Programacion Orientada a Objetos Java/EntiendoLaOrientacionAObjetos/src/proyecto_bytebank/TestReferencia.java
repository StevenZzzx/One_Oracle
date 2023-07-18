/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto_bytebank;

/**
 *
 * @author Steven
 */
public class TestReferencia {
    public static void main(String[] args) {
        Cuenta primeraCuenta = new Cuenta(233);
        primeraCuenta.depositar(200);

        Cuenta segundaCuenta = primeraCuenta;

        segundaCuenta.depositar(100);

        System.out.println("Saldo primera cuenta " + primeraCuenta.getSaldo() + 
        "\nSaldo segunda cuenta " + segundaCuenta.getSaldo()
        );

//        segundaCuenta.saldo += 400;

        System.out.println("Saldo primera cuenta " + primeraCuenta.getSaldo() + 
        "\nSaldo segunda cuenta " + segundaCuenta.getSaldo()
        );

        System.out.println(primeraCuenta);
        System.out.println(segundaCuenta);

        if(primeraCuenta == segundaCuenta){
            System.out.println("Son el mismo objeto");
        }
    }
}
