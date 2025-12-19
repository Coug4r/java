package com.krakedev.persistencia.test;

import java.util.ArrayList;

import com.krakedev.persistencia.entidades.Estudiante;
import com.krakedev.persistencia.servicios.AdminEstudiantes;

public class TestConsultarPorNombre {
	public static void main(String[] args) {
		try {
			ArrayList<Estudiante> estudiantes = AdminEstudiantes.buscarPorNombre("B");
			System.out.println(estudiantes);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}
}
