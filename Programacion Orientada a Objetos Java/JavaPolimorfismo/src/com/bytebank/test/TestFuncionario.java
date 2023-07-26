/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bytebank.test;

import com.bytebank.modelo.Contador;
import com.bytebank.modelo.Funcionario;

/**
 *
 * @author Steven
 */
public class TestFuncionario {
    public static void main(String[] args) {
        Funcionario diego = new Contador();
        diego.setNombre("Diego");
        diego.setDocumento("4445566665");
        diego.setSalario(2000);
        diego.setTipo(0);

        System.out.println(diego.getSalario());
        System.out.println(diego.getBonificacion());
    }
}
