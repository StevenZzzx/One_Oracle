/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bytebank.test;

import com.bytebank.modelo.Funcionario;
import com.bytebank.modelo.Gerente;

/**
 *
 * @author Steven
 */
public class TestReferencias {
    public static void main(String[] args) {

        //Elemento mas generico puede ser adaptado
        //                      al elemento mas especifico
        Funcionario funcionario = new Gerente();
        funcionario.setNombre("Steven");

        Gerente gerente = new Gerente();
        gerente.setNombre("Diego");

        funcionario.setSalario(2000);
        gerente.setSalario(10000);

        
    }
}
