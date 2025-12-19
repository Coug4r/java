package com.krakedev.persistencia.test;

import com.krakedev.persistencia.entidades.Estudiante;
import com.krakedev.persistencia.servicios.AdminEstudiantes;

public class TestBuscarPorCedulaEstudiantes {
	public static void main(String[] args) {
		try {
			Estudiante p = AdminEstudiantes.buscarPorCedula("E003");
			System.out.println(p);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
	}
}
