package com.bytebank.test;

import com.bytebank.modelo.CuentaCorriente;
import com.bytebank.modelo.GuardaReferencias;
import com.bytebank.modelo.Cuenta;

public class TestGuardaCuentas {
	
	public static void main(String[] args) {
		GuardaReferencias guardaCuentas = new GuardaReferencias();
		Cuenta cc = new CuentaCorriente(11);
		guardaCuentas.adicionar(cc);
		Cuenta cc2 = new CuentaCorriente(12);
		guardaCuentas.adicionar(cc2);
		
		System.out.println(guardaCuentas.obtener(0));
		System.out.println(guardaCuentas.obtener(1));
	}
}
