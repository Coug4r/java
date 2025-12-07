package com.clearminds.maquina;

import java.util.ArrayList;

import com.clearminds.componente.Celda;
import com.clearminds.componente.Producto;

public class MaquinaDulces {
	private ArrayList<Celda> celdas;
	private double saldo;
	
	public MaquinaDulces() {
		celdas = new ArrayList<Celda>();
	}
	
	public void agregarCelda(Celda cod) {
		Celda nuevaCelda = cod;
		celdas.add(nuevaCelda);
	}
	public void mostrarConfiguracion() {
		Celda elementoCelda = null;
		for (int i = 0; i<celdas.size();i++) {
			elementoCelda = celdas.get(i);
			System.out.println("Celda"+(i+1)+": "+elementoCelda.getCodigo());
	    }
	}
	public Celda buscarCelda(String cod) {
		Celda celda = null;
		for (int i = 0; i<celdas.size();i++) {
			celda = celdas.get(i);
			if (celda.getCodigo().equals(cod)) {
				return celda;
			}
		}
		return null;
	}
	public void cargarProducto(Producto prod, String cod, int stock) {
		Celda celdaRecuperada = buscarCelda(cod);
		celdaRecuperada.ingresarProducto(prod, stock);
	}
	public void mostrarProductos() {
		Celda elementoCelda = null;
		for (int i = 0; i<celdas.size();i++) {
			elementoCelda = celdas.get(i);
			if(elementoCelda.getProducto()!=null) {
				System.out.println("Celda"+(i+1)+"\nCodigo: "+elementoCelda.getProducto().getCodigo()+"\nStock: "+elementoCelda.getStock()+"\nNombre: "+elementoCelda.getProducto().getNombre()+"\nPrecio: "+elementoCelda.getProducto().getPrecio());
			}else {
				System.out.println("Celda"+(i+1)+"\nCodigo: "+elementoCelda.getCodigo()+"\nStock: "+elementoCelda.getStock()+"\nSin Producto asignado!");
			}
	    }
	}
	public Producto buscarProductoEnCelda(String cod) {
		Celda celda = null;
		for (int i = 0; i<celdas.size();i++) {
			celda = celdas.get(i);
			if (celda.getCodigo().equals(cod)) {
				return celda.getProducto();
			}
		}
		return null;
	}
	public double consultarPrecio(String cod) {
		Celda celda = null;
		for (int i = 0; i<celdas.size();i++) {
			celda = celdas.get(i);
			if (celda.getCodigo().equals(cod)) {
				return celda.getProducto().getPrecio();
			}
		}
		return 0.0;
	}
	public Celda buscarCeldaProducto(String cod) {
		Celda celda = null;
		for (int i = 0; i<celdas.size();i++) {
			celda = celdas.get(i);
			if (celda.getProducto()!= null && celda.getProducto().getCodigo().equals(cod)) {
				return celda;
			}
		}
		return null;
	}
	public void incrementarProductos(String cod, int cant) {
		Celda celdaEncontrada = buscarCeldaProducto(cod);
		celdaEncontrada.setStock(celdaEncontrada.getStock()+cant);
	}
	public void vender(String cod) {
		Celda celda = null;
		for (int i = 0; i<celdas.size();i++) {
			celda = celdas.get(i);
			if (celda.getCodigo().equals(cod)) {
				saldo = saldo + celda.getProducto().getPrecio();
				celda.setStock(celda.getStock()-1);
			}
		}
	}
	public double venderConCambio(String cod, double client) {
		Celda celda = null;
		for (int i = 0; i<celdas.size();i++) {
			celda = celdas.get(i);
			if (celda.getCodigo().equals(cod)) {
				saldo = saldo + celda.getProducto().getPrecio();
				celda.setStock(celda.getStock()-1);
				return client - celda.getProducto().getPrecio();
			}
		}
		return 0.0;
	}
	public ArrayList<Producto> buscarMenores(double limite){
		Celda celda = null;
		ArrayList<Producto> menores = new ArrayList<Producto>();
		for (int i = 0; i<celdas.size();i++) {
			celda = celdas.get(i);
			if (celda.getProducto().getPrecio() < limite) {
				menores.add(celda.getProducto());
			}
		}
		return menores;
	}
}
 	