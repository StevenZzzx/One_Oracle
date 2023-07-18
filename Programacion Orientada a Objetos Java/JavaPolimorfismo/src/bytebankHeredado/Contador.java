/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bytebankHeredado;

/**
 *
 * @author Steven
 */
public class Contador extends Funcionario {
    
    @Override
    public double getBonificacion(){
        System.out.println("Ejecutando desde contador");
        return 200;
    }
}
