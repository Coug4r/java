package com.krakedev.excepciones;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Ejercicio3 {
	private static final Logger LOGGER =LogManager.getLogger(Ejercicio3.class);
	
	public void metodo1() {
		String a = null;
		try {
			a.substring(3);
		}catch(Exception io) {
			System.out.println("Error");
			LOGGER.error("Error al obtener la subcadena",io);
		}
	}
	public static void main(String[] args) {
		Ejercicio3 eje3 = new Ejercicio3();
		eje3.metodo1();
	}
}