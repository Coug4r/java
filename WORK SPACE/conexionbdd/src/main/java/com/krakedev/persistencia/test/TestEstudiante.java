package com.krakedev.persistencia.test;

import com.krakdev.persistencia.utils.Convertidor;
import com.krakedev.persistencia.entidades.Estudiante;
import com.krakedev.persistencia.entidades.Profesores;
import com.krakedev.persistencia.servicios.AdminEstudiantes;

public class TestEstudiante {
	public static void main(String[] args) {
		Profesores prof = new Profesores(1001, "Guanin");
		Estudiante est = new Estudiante("E004", "David", "Burneo", "david@gmail",prof);
		try {
			est.setFecha_nacimiento(Convertidor.convertirFecha("2005/07/25"));
			AdminEstudiantes.insertar(est);
		} catch (Exception e) {
			System.out.println("Error del sistema: "+ e.getMessage());
		}
	}
}
