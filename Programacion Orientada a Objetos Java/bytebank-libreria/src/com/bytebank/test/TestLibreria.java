/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bytebank.test;

import com.bytebank.modelo.Cuenta;
import com.bytebank.modelo.CuentaCorriente;

/**
 *
 * @author Steven
 */
public class TestLibreria {
    public static void main(String[] args) {
        Cuenta cuenta = new CuentaCorriente(12);
        cuenta.depositar(200);
    }
}
