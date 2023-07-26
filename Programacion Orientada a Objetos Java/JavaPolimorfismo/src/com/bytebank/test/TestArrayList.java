package com.bytebank.test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Vector;

import com.bytebank.modelo.CuentaCorriente;
import com.bytebank.modelo.Cliente;
import com.bytebank.modelo.Cuenta;

public class TestArrayList {
	
	public static void main(String[] args) {
		
		// <> Forzando a que acepte solo un tipo de objeto
//		List<Cliente> listaClientes = new LinkedList<>();
		
		List<Cuenta> lista = new Vector<>();
		Cuenta cc = new CuentaCorriente(10,22);
		Cuenta cc2 = new CuentaCorriente(12,33);
		Cuenta cc3 = new CuentaCorriente(12,33);
		
		
		lista.add(cc);
		lista.add(cc2);
		
//		Cliente cliente = new Cliente();
//		lista.add(cliente);
		
		Cuenta obtenerCuenta = (Cuenta) lista.get(0);
		System.out.println(obtenerCuenta);
		
		for(int i = 0; i < lista.size(); i++) {
			System.out.println(lista.get(i));
		}
		
		for(Cuenta cuenta : lista) {
			System.out.println(cuenta);
		}
		
		boolean contiene = lista.contains(cc3);
		if(contiene) {
			System.out.println("Si");
		}
		
		if(cc2.equals(cc3)) {
			System.out.println("Si, son iguales");
		}
		
	}
}
