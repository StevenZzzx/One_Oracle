/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bytebank.modelo;

/**
 *
 * @author Steven
 */

//                 extiende de
public class Gerente extends Funcionario implements Autenticable{
    private String password;

    public double getBonificacion(){
        System.out.println("Ejecutando desde Gerente");
        return super.getSalario() + this.getSalario()  * 0.5;
    }

    public String getPassword() {
        return password;
    }

    @Override
    public void setClave(String password) {
        this.password = password;
    }

    @Override
    public boolean iniciarSesion(String password) {
        if(this.password == password){
            return true;
        }else{
            return false;
        }
    }
}
