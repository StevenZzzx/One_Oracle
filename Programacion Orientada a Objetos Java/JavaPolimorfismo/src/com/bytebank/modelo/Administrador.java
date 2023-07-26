/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bytebank.modelo;

/**
 *
 * @author Steven
 */
public class Administrador extends Funcionario implements Autenticable {
    private String password;
    
    @Override
    public double getBonificacion(){
        return this.getSalario();
    }

    public String getPassword() {
        return password;
    }

    @Override
    public void setClave(String password) {
        this.setClave(password);
    }

    @Override
    public boolean iniciarSesion(String password) {
        return this.iniciarSesion(password);
    }
}
