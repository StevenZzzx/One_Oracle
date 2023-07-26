/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bytebank.test;

import com.bytebank.modelo.CuentaAhorros;
import com.bytebank.modelo.CuentaCorriente;

/**
 *
 * @author Steven
 */
public class TestCuenta {
    public static void main(String[] args) {
        CuentaCorriente cc = null;
        CuentaAhorros ca = new CuentaAhorros(2);
        cc.depositar(2000);
        cc.transferir(1000, ca);
        System.out.println(cc.getSaldo());
        System.out.println(ca.getSaldo());
    }
}
