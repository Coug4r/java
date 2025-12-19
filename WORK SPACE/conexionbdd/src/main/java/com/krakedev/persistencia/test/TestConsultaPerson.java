package com.krakedev.persistencia.test;

import java.util.ArrayList;

import com.krakedev.persistencia.entidades.Persona;
import com.krakedev.persistencia.servicios.AdminPersona;

public class TestConsultaPerson {
	public static void main(String[] args) {
		try {
			ArrayList<Persona> personas = AdminPersona.buscarPorNombre("Macis");
			System.out.println(personas);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	
	
	}
}
