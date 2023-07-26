package com.bytebank.test;

import java.util.ArrayList;
import java.util.List;

public class TestRepasoArray {
	
	public static void main(String[] args) {
		
		int[] numeros = new int[10];
		
		int numero = 40;
		// Wrapper
		//Integer numeroObjeto = new Integer(40); deprecado
		Integer numeroObjeto = Integer.valueOf(40);
		
		List<Integer> lista = new ArrayList();
		//primitivo != object
		lista.add(Integer.valueOf(40)); // autoboxing
		lista.add(numeroObjeto);
		
		//unboxing
		//int valorPrimitivo = numeroObjeto;
		int valorPrimitivo = numeroObjeto.intValue();
		
		byte byteInteger = numeroObjeto.byteValue();
		double doubleInteger = numeroObjeto.doubleValue();
		float floatInteger = numeroObjeto.floatValue();
		
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		
		System.out.println(Integer.SIZE);
		System.out.println(Integer.BYTES);
	}
}
