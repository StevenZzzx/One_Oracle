/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bytebank.modelo;

/**
 *
 * @author Steven
 */
public class SistemaInterno {
    private String clave = "12345";

    public boolean autentica(Autenticable funcionario){
        boolean puedeIniciarSesion = funcionario.iniciarSesion(clave);
        if(puedeIniciarSesion){
            System.out.println("login exitoso!");
            return true;
        }else{
            System.out.println("Error en login");
            return false;
        }
    }
}
