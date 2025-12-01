package com.krakedev;

public class Mensajeria {
	private String nombre;
	private String apellido;

	public void saludar() {
		System.out.println("Hola humanos");
	}

	public Mensajeria(String nombre, String apellido) {
		this.nombre = nombre;
		this.apellido = apellido;
	}

	public void saludarAmigo() {
		System.out.println("Hola " + nombre + apellido);
	}
}
