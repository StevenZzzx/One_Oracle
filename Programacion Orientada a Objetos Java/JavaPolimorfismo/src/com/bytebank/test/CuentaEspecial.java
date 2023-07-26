/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bytebank.test;

import com.bytebank.modelo.Cuenta;

/**
 *
 * @author Steven
 */
public class CuentaEspecial extends Cuenta {

    public CuentaEspecial(int agencia) {
        super(agencia);
    }

    @Override
    public void depositar(double valor) {
        super.saldo = 0.0;
    }
    
}
