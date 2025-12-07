package com.krakedev.colecciones;

import java.util.ArrayList;

public class Ejercicio2 {

	public static void main(String[] args) {
		ArrayList<Persona> personas;
		personas = new ArrayList<Persona>();
		
		personas.add(new Persona("David", "Burneo"));
		personas.add(new Persona("Juan", "Burneo"));
		personas.add(new Persona("Pedro", "Castillo"));
		personas.add(new Persona("Luis", "Carmen"));
		
		Persona elementoPersona; 
		for(int i=0; i<personas.size();i++) {
			elementoPersona = personas.get(i);
			System.out.println("Nombre: "+elementoPersona.getNombre() +" Apellido: "+elementoPersona.getApellido());
		}
	}

}
