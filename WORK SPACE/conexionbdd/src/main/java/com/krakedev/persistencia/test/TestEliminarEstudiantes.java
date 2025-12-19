package com.krakedev.persistencia.test;

import com.krakedev.persistencia.servicios.AdminEstudiantes;

public class TestEliminarEstudiantes {
	public static void main(String[] args) {
		try {
			AdminEstudiantes.eliminar("E004");
		} catch (Exception e) {
			System.out.println("Error del sistema: "+e.getMessage());
		}
	}
}
