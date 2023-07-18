/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proyecto_bytebank;

/**
 *
 * @author Steven
 */
public class CrearCuenta {
    public static void main(String[] args) {
        //Variable           = Valor
        // Variable         ->  123FFD
        Cuenta primeraCuenta = new Cuenta(555);
        primeraCuenta.depositar(400);
        // primeraCuenta.pais = "Peru"; No compila 
        System.out.println(primeraCuenta.getSaldo());

        Cuenta segundaCuenta = new Cuenta(666);
        segundaCuenta.depositar(400);
        System.out.println(segundaCuenta.getSaldo());
        System.out.println(primeraCuenta.getAgencia());

        System.out.println(primeraCuenta);
        System.out.println(segundaCuenta);

        if(primeraCuenta == segundaCuenta){
            System.out.println("Son el mismo objeto");
        }else{
            System.out.println("No son el mismo objeto");
        }
    }
}
