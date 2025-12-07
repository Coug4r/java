package com.clearminds.test;

import java.util.ArrayList;

import com.clearminds.componente.Celda;
import com.clearminds.componente.Producto;
import com.clearminds.maquina.MaquinaDulces;

public class TestBuscarMenores {

	public static void main(String[] args) {
		MaquinaDulces maquina=new MaquinaDulces();
		maquina.agregarCelda(new Celda("A"));
		maquina.agregarCelda(new Celda("B"));
		maquina.agregarCelda(new Celda("C"));
		maquina.agregarCelda(new Celda("D"));
		maquina.agregarCelda(new Celda("E"));
		maquina.agregarCelda(new Celda("F"));
		
		Producto producto1=new Producto("HE45","Doritos",0.55);
		maquina.cargarProducto(producto1, "A", 4);
		Producto producto2=new Producto("KE34","Papitas",0.85);
		maquina.cargarProducto(producto2, "B", 4);
		Producto producto3 = new Producto("PRTO", "Gatorade", 2.54);
		maquina.cargarProducto(producto3, "C", 5);
		Producto producto4 = new Producto("IYTO", "CHICLES", 1.00);
		maquina.cargarProducto(producto4, "D", 5);
		Producto producto5 = new Producto("JOLA", "CHOCOLATE", 2.00);
		maquina.cargarProducto(producto5, "E", 7);
		Producto producto6 = new Producto("SURJ", "YOGURT", 3.00);
		maquina.cargarProducto(producto6, "F", 7);

		ArrayList<Producto> menores = maquina.buscarMenores(1);
		System.out.println("Productos menores: "+menores.size());
		Producto prd = null;
		for (int i=0;i<menores.size();i++) {
			prd = menores.get(i);
			System.out.println("Nombre: " + prd.getNombre()+" Precio: "+prd.getPrecio());
		}
	}

}
