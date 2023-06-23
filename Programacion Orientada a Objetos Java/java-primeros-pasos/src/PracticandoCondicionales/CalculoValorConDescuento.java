/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PracticandoCondicionales;

/**
 *
 * @author Steven
 */
public class CalculoValorConDescuento {
    public static void main(String[] args) {
        
        double valorCompra = 250.0;
        double descuento = 0.0;
        
        boolean Descuento10 = valorCompra >= 100.0 && valorCompra < 199.99;
        boolean Descuento15 = valorCompra >= 200.0 && valorCompra < 299.99;
        boolean CompraSuperior = valorCompra >= 300.0;
        
        if(Descuento10){
            descuento = 10.0;
        }else if(Descuento15){
            descuento = 15.0;
        }else if(CompraSuperior){
            descuento = 20.0;
        }
        
        double valorFinal = valorCompra - (valorCompra * (descuento/100));
        
        System.out.println("Valor de la compra: $" + valorCompra);
        System.out.println("Descuento: " + descuento);
        System.out.println("Valor final: $" + valorFinal);
    }
}
