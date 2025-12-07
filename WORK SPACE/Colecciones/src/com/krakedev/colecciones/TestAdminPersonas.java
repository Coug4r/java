package com.krakedev.colecciones;

import java.util.ArrayList;

public class TestAdminPersonas {

	public static void main(String[] args) {
		AdminPersonas admin = new AdminPersonas();
		admin.agregar(new Persona("David", "Benedetti", 50));
		admin.agregar(new Persona("Juan", "Benedetti", 40));
		admin.agregar(new Persona("Pedro", "Benedetti", 30));
		admin.imprimir();
		
		ArrayList<Persona> personasMayores = admin.buscarMayores(25);
		System.out.println(personasMayores.size());

	}

}
