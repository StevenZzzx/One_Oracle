/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bytebankHeredado;

/**
 *
 * @author Steven
 */
public class CuentaCorriente extends Cuenta {
    
    public CuentaCorriente(int agencia){
        super(agencia);
    }

    @Override
    public void retirar(double valor) {
        double comision = 0.2;
        super.retirar(valor + comision);
    }

    @Override
    public void depositar(double valor) {
        
    }
}
