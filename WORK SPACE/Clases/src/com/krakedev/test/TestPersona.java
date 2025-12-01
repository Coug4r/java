package com.krakedev.test;

import com.krakedev.Persona;

public class TestPersona {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Persona p; // Paso 1 declaro una variable llamada p de tipo poersona
		Persona p2 = new Persona();
		p = new Persona();// Instanciar un objeto persona y referenciarlo con p
		// Accedo a los atributos
		System.out.println("Nombre: " + p.getNombre());
		System.out.println("Edad: " + p.getEdad());
		System.out.println("Estatura: " + p.getEstatura());
		// Modificar los atributos
		p.setNombre("Mario");
		p.setEdad(45);
		p.setEstatura(1.56);

		System.out.println("------------------------");
		// Accedo a los atributos
		System.out.println("Nombre: " + p.getNombre());
		System.out.println("Edad: " + p.getEdad());
		System.out.println("Estatura: " + p.getEstatura());

		System.out.println("***********************");
		p2.setNombre("Angelina");
		System.out.println("p.nombre " + p.getNombre());
		System.out.println("p2.nombre " + p2.getNombre());

	}

}
