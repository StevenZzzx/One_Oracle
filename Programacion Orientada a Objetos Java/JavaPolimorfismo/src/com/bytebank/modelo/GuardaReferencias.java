package com.bytebank.modelo;

public class GuardaReferencias {
	//Crear un objeto para guardar muchas cuentas
	// Permitirnos agregar cuentas con un metodo
	//guardaCuentas.adiciona(cuenta);
	//obtener, remover, etc.
	
	Object[] referencia = new Object[10];
	int indice = 0;
	
	public void adicionar(Cuenta cc) {
		referencia[indice] = cc;
		indice++;
	} 
	
	public Object obtener(int indice) {
		return referencia[indice];
	}
}
