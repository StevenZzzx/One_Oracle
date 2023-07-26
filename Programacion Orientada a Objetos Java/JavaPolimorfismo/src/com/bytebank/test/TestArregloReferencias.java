package com.bytebank.test;

import com.bytebank.modelo.CuentaCorriente;
import com.bytebank.modelo.Cliente;
import com.bytebank.modelo.Cuenta;
import com.bytebank.modelo.CuentaAhorros;

public class TestArregloReferencias {
	public static void main(String[] args) {
		
		Object[] referencias = new Object[5];

		CuentaCorriente cc = new CuentaCorriente(23);

		referencias[1] = cc; 
		
		CuentaAhorros ca = new CuentaAhorros(5);
		referencias[3] = ca;
		
		Cliente cliente = new Cliente();
		referencias[4] = cliente;
		
		Cliente obtenido = (Cliente) referencias[4];
		System.out.println(obtenido);
		
		System.out.println(cc);
		
		referencias[0] = new CuentaCorriente(25);
		System.out.println(referencias[1]);
		System.out.println(referencias[0]);
		
		//Cast
		CuentaCorriente cuenta = (CuentaCorriente) referencias[1];
		
		for(int i = 0; i < referencias.length; i++) {
			System.out.println(referencias[i]);
		}
	}
}
