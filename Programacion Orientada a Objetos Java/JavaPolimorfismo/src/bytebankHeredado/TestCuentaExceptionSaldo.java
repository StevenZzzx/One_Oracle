/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bytebankHeredado;

/**
 *
 * @author Steven
 */
public class TestCuentaExceptionSaldo {
    
    public static void main(String[] args) {
        Cuenta cuenta = new CuentaAhorros(123);
        cuenta.depositar(210);
        cuenta.retirar(210);
        cuenta.retirar(10);
    }
}
