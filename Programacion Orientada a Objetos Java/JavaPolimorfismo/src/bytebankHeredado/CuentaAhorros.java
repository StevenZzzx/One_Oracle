/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bytebankHeredado;

/**
 *
 * @author Steven
 */
public class CuentaAhorros extends Cuenta {
    
    public CuentaAhorros(int agencia){
        super(agencia);
    }

    @Override
    public void depositar(double valor) {
        this.saldo = this.saldo + valor;
    }
}
