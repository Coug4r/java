package com.clearminds.maquina;

import com.clearminds.componentes.Celda;
import com.clearminds.componentes.Producto;

public class MaquinaDulces {
	private Celda celda1;
	private Celda celda2;
	private Celda celda3;
	private Celda celda4;
	private double saldo;
	public MaquinaDulces() {
		
	}
	public void configurarMaquina(String cod1, String cod2, String cod3, String cod4) {
		this.celda1 = new Celda(cod1);
		this.celda2 = new Celda(cod2);
		this.celda3 = new Celda(cod3);
		this.celda4 = new Celda(cod4);
	}
	public void mostrarConfiguracion() {
		System.out.println("Celda 1: "+celda1.getCodigo()+"\nCelda 2: "+celda2.getCodigo()+"\nCelda 3: "+celda3.getCodigo()+"\nCelda 4: "+celda4.getCodigo());
	}
	public Celda buscarCelda(String cod) {
		if (celda1.getCodigo() == cod) {
			return celda1;
		}else if(celda2.getCodigo()==cod) {
			return celda2;
		}else if(celda3.getCodigo()==cod) {
			return celda3;
		}else if(celda4.getCodigo()==cod) {
			return celda4;
		}else {
			return null;
		}
	}
	public void cargarProducto(Producto prod, String cod, int stock) {
		Celda celdaRecuperada = buscarCelda(cod);
		celdaRecuperada.ingresarProducto(prod, stock);
	}
	public void mostrarProductos() {
		Celda[] celdas = {celda1, celda2, celda3, celda4};
	    for (int i = 0; i < celdas.length; i++) {
	        Celda celda = celdas[i];
	        System.out.println("*********Celda" + (i + 1) + ": " + 
	            (celda.getCodigo() != null ? celda.getCodigo() : "----"));
	        System.out.println("Stock: " + celda.getStock());

	        if (celda.getProducto() != null) {
	            System.out.println("Producto: " + celda.getProducto().getNombre());
	            System.out.println("Precio: " + celda.getProducto().getPrecio());
	            System.out.println("Codigo Producto: " + celda.getProducto().getCodigo());
	        } else {
	            System.out.println("La celda no tiene producto!!!");
	            System.out.println("Precio: 0.0");
	        }

	        System.out.println("Saldo: "+saldo); // Línea en blanco entre celdas
	    }
	}
	public Producto buscarProductoEnCelda(String cod) {
		if (celda1.getCodigo() == cod) {
			return celda1.getProducto();
		}else if(celda2.getCodigo()==cod) {
			return celda2.getProducto();
		}else if(celda3.getCodigo()==cod) {
			return celda3.getProducto();
		}else if(celda4.getCodigo()==cod) {
			return celda4.getProducto();
		}else {
			return null;
		}
	}
	public double consultarPrecio(String cod) {
		if (celda1.getCodigo() == cod) {
			return celda1.getProducto().getPrecio();
		}else if(celda2.getCodigo()==cod) {
			return celda2.getProducto().getPrecio();
		}else if(celda3.getCodigo()==cod) {
			return celda3.getProducto().getPrecio();
		}else if(celda4.getCodigo()==cod) {
			return celda4.getProducto().getPrecio();
		}else {
			return 0.0;
		}
	}
	public Celda buscarCeldaProducto(String cod) {
		Celda[] celdas = {celda1, celda2, celda3, celda4};

	    for (Celda celda : celdas) {
	        Producto prod = celda.getProducto();
	        if (prod != null && prod.getCodigo().equals(cod)) {
	            return celda;
	        }
	    }

	    return null;
	}
	public void incrementarProductos(String cod, int stock) {
		Celda celdaEncontrada = buscarCeldaProducto(cod);
		celdaEncontrada.setStock(celdaEncontrada.getStock()+ stock);
	}
	public void vender(String cod) {
		Celda celdaEncontrada = buscarCelda(cod);
		if(celdaEncontrada.getStock() != 0) {
			celdaEncontrada.setStock(celdaEncontrada.getStock()-1);
			celdaEncontrada.getProducto().getPrecio();
			saldo = saldo + celdaEncontrada.getProducto().getPrecio();
		}
	}
	public double venderConCambio(String cod, double client) {
		Celda celdaEncontrada = buscarCelda(cod);
		celdaEncontrada.setStock(celdaEncontrada.getStock()-1);
		saldo = saldo + celdaEncontrada.getProducto().getPrecio();
		return client - celdaEncontrada.getProducto().getPrecio();
	}
}
