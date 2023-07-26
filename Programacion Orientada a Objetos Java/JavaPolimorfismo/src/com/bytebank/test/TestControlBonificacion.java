/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bytebank.test;

import com.bytebank.modelo.Contador;
import com.bytebank.modelo.ControlBonificacion;
import com.bytebank.modelo.Funcionario;
import com.bytebank.modelo.Gerente;

/**
 *
 * @author Steven
 */
public class TestControlBonificacion {
    public static void main(String[] args) {
        Funcionario diego = new Contador();
        diego.setSalario(2000);

        Gerente jimena = new Gerente();
        jimena.setSalario(10000);

        Contador alexis = new Contador();
        alexis.setSalario(5000);

        ControlBonificacion controlBonificacion = new ControlBonificacion();

        controlBonificacion.registrarSalario(diego);
        controlBonificacion.registrarSalario(jimena);
        controlBonificacion.registrarSalario(alexis);
    }
}
