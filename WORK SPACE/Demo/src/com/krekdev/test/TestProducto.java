package com.krekdev.test;
import com.krackedev.demo.Producto;
public class TestProducto {

	public static void main(String[] args) {
		Producto pr1 = new Producto("Manzanas", 123);
		
		pr1.setDescripcion("Manzanas Rojas");
		pr1.setPeso(1.5);
		
		System.out.println("Producto Pr1: \n Nombre: " + pr1.getNombre());
		System.out.println("Codigo: " + pr1.getCodigo());
		System.out.println("Descripcion: " + pr1.getDescripcion());
		System.out.println("Peso: " + pr1.getPeso());
	}

}
