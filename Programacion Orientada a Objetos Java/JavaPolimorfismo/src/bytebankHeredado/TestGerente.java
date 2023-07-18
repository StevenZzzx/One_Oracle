/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bytebankHeredado;

/**
 *
 * @author Steven
 */
public class TestGerente {
    public static void main(String[] args) {
        Gerente gerente = new Gerente();
        //gerente.setSalario(5000);

        //Funcionario gerente = new Funcionario();
        gerente.setSalario(6000);
        gerente.setNombre("Juan");
        gerente.setTipo(1);

        gerente.setClave("Alura");

        
        System.out.println(gerente.iniciarSesion("Alura"));
        System.out.println(gerente.getBonificacion());
    }
}
