package com.cmc.repaso.test;
import com.cmc.repaso.entidades.Producto;
public class TestProducto {
	public static void main(String[] args) {
		Producto producto1 = new Producto("PS5", 400);
		System.out.println(producto1.getPrecio());
		producto1.setPrecio(465.99);
		System.out.println(producto1.getPrecio());
		System.out.println(producto1.calcularPrecioPromo(10));
	}
}
