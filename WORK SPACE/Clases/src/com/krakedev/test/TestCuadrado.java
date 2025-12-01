package com.krakedev.test;

import com.krakedev.Cuadrado;

public class TestCuadrado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cuadrado c1 = new Cuadrado(4);
		Cuadrado c2 = new Cuadrado(6);
		Cuadrado c3 = new Cuadrado(2);

		// c1.setLado(8);
		// c2.setLado(3);
		// c3.setLado(9);

		double area1 = c1.calcularArea();
		double area2 = c2.calcularArea();
		double area3 = c3.calcularArea();

		double per1 = c1.calcularPerimetro();
		double per2 = c2.calcularPerimetro();
		double per3 = c3.calcularPerimetro();

		System.out.println("El area del cuadrado 1 es: " + area1);
		System.out.println("El area del cuadrado 2 es: " + area2);
		System.out.println("El area del cuadrado 3 es: " + area3);

		System.out.println("------------------------------------");

		System.out.println("El perimetro del cuadrado 1 es: " + per1);
		System.out.println("El perimetro del cuadrado 2 es: " + per2);
		System.out.println("El perimetro del cuadrado 3 es: " + per3);
	}

}
