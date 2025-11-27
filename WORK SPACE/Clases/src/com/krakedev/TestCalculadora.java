package com.krakedev;

public class TestCalculadora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculadora calcu;
		calcu = new Calculadora();
		int resultado = calcu.sumar(5, 8);
		int resultadoResta = calcu.restar(20, 10);
		double resultadoMult = calcu.multiplicar(2, 10);
		double resultadoDiv = calcu.dividir(2, 10);
		double resultadoProm = calcu.promediar(2, 10, 5);
		String msg = calcu.mostrarResultado();
		System.out.println("RESULTADO SUMA: "+resultado);
		System.out.println("RESULTADO RESTA: "+ resultadoResta);
		System.out.println("RESULTADO MULTIPLICACION: "+ resultadoMult);
		System.out.println("RESULTADO DIVISION: "+ resultadoDiv);
		System.out.println("RESULTADO PROMEDIO: "+ resultadoProm);
		System.out.println(msg);
	}
}
