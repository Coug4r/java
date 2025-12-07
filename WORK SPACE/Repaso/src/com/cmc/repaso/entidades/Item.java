package com.cmc.repaso.entidades;

public class Item {
	private String nombre;
	private int productosActuales = 20;
	private int productosDevueltos;
	private int productosVendidos;
	public Item(String nombre) {
		this.nombre=nombre;
	}
		public void imprimir() {
			System.out.println("Nombre: "+nombre+"\nProductos Actuales: "+productosActuales+"\nProductos Devueltos: "+productosDevueltos+"\nProductos Vendidos: "+productosVendidos);
		}
		public void vender(int productosVendidos) {
			this.productosActuales -= productosVendidos;
			this.productosVendidos += productosVendidos;
		}
		public void devolver(int productosVendidos) {
			productosActuales += productosVendidos;
			productosDevueltos += productosVendidos;
			this.productosVendidos -= productosVendidos;
	}
}
