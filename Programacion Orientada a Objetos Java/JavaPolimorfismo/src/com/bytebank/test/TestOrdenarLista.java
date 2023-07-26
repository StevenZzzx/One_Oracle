package com.bytebank.test;

import com.bytebank.modelo.CuentaCorriente;
import com.bytebank.modelo.Cuenta;
import com.bytebank.modelo.CuentaAhorros;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class TestOrdenarLista {
	
	public static void main(String[] args) {
		
		Cuenta cc1 = new CuentaCorriente(33, 20);
		cc1.depositar(333.0);
		
		Cuenta cc2 = new CuentaAhorros(44, 21);
		cc2.depositar(444.0);
		
		Cuenta cc3 = new CuentaCorriente(11, 62);
		cc3.depositar(111.0);
		
		Cuenta cc4 = new CuentaAhorros(22, 33);
		cc4.depositar(222.0);
		
		List<Cuenta> lista = new ArrayList<>();
		lista.add(cc1);
		lista.add(cc2);
		lista.add(cc3);
		lista.add(cc4);
		
		System.out.println("Antes de ordenar");
		for(Cuenta cuenta : lista) {
			System.out.println(cuenta);
		}
		
		// Ordenar las cuentas
		//          cualquier clase hija de Cuenta
		// Comparator <? extend Cuenta> c
		//Comparator<Cuenta> comparator = new OrdenadorPorNumeroCuenta();
		//lista.sort(new OrdenadorPorNumeroCuenta());
		
		Collections.sort(lista, new OrdenadorPorNumeroCuenta());
		
		System.out.println("Despues de ordenar");
		for(Cuenta cuenta : lista) {
			System.out.println(cuenta);
		}
		
		Collections.sort(lista);
		
		System.out.println("Despues de ordenar por orden natural");
		for(Cuenta cuenta : lista) {
			System.out.println(cuenta);
		}
	}
}

class OrdenadorPorNumeroCuenta implements Comparator<Cuenta>{

	@Override
	public int compare(Cuenta o1, Cuenta o2) {
		//Forma basica
//		if(o1.getNumero() == o2.getNumero()) {
//			return 0;
//		}else if(o1.getNumero() > o2.getNumero()) {
//			return 1;
//		}else {
//			return -1;
//		}
		
		// Forma intermedia
		//return o1.getNumero() - o2.getNumero();
		
		//Forma Wrapper
		return Integer.compare(o1.getNumero(), o2.getNumero());
		
		
	}
	
}