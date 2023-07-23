/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java_pila_ejecucion;

/**
 *
 * @author Steven
 */
public class Flujo {
  public static void main(String[] args) {
    System.out.println("Inicio de main");
      try {
          metodo1();
      } catch (Exception e) {
          e.printStackTrace();
      }
    System.out.println("Fin de main");
  }
  public static void metodo1() throws MiException {
    System.out.println("Inicio de metodo1");
        metodo2();
    System.out.println("Fin de metodo1");
  }
  public static void metodo2() throws MiException {
    System.out.println("Inicio de metodo2");

    throw new MiException("Mi excepcion fue lanzada");
    //System.out.println("Fin de metodo2");
  }
}

