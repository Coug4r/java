package com.cmc.repaso.entidades;

public class Producto {
	private String nombre;
	private double precio;
	
	public Producto(String nombre, double precio) {
		this.nombre = nombre;
		this.precio = precio;
	}
	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		if(precio < 0) {
			precio *= (-1);
		}
		this.precio = precio;
	}
	public double calcularPrecioPromo(int porcentaje) {
		return precio - (precio *porcentaje) / 100;
	}
}
