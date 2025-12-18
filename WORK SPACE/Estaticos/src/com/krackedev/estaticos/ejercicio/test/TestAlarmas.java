package com.krackedev.estaticos.ejercicio.test;

import java.util.ArrayList;

import com.krackedev.estaticos.ejercicio.entidades.Alarma;
import com.krackedev.estaticos.ejercicio.logica.AdminAlarmas;
import com.krackedev.estaticos.ejercicio.utils.DiasSemana;

public class TestAlarmas {
	public static void main(String[] args) {
		Alarma al1 = new Alarma(DiasSemana.LUNES, 12, 12);
		Alarma al2 = new Alarma(DiasSemana.MARTES, 20, 10);
		Alarma al3 = new Alarma(DiasSemana.MIERCOLES, 8, 5);
		AdminAlarmas ad = new AdminAlarmas();
		ad.agregarAlarma(al1);
		ad.agregarAlarma(al2);
		ad.agregarAlarma(al3);
		
		ArrayList<Alarma> alarmasActuales = ad.getAlarmas();
		System.out.println(alarmasActuales);
	}	
}
