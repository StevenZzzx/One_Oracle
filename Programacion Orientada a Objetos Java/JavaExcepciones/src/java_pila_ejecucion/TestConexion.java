/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java_pila_ejecucion;

/**
 *
 * @author Steven
 */
public class TestConexion {
    
    public static void main(String[] args) throws Exception {
        
        try(Conexion con = new Conexion()){
            con.leerDatos();
        }catch(IllegalStateException ex){
            System.out.println("Ejecutando catch");
            ex.printStackTrace();
        }
                
        /*
        Conexion con = null;
        try{
            con = new Conexion();
            con.leerDatos();             
        }catch(IllegalStateException ex){
            System.out.println("Recibiendo exception");
            ex.printStackTrace();
        }finally{
            System.out.println("Ejecutando finally");
            con.cerrar();
        }
        */
    }
}
