package com.cmc.evaluacion;

import java.util.ArrayList;

public class Banco {
	private ArrayList<Prestamo> prestamos;
	private ArrayList<Cliente> clientes;
	
	public Cliente buscarCliente(String cedula) {
		Cliente cliente = null;
		for(int i=0; i<clientes.size(); i++) {
			cliente = clientes.get(i);
			if(cliente.getCedula() == cedula) {
				return cliente;
			}
		}
		return cliente;
	}
	
	public void registrarCliente(Cliente nuevoCliente) {
		Cliente cliente = null;
		for(int i=0; i<clientes.size(); i++) {
			cliente = clientes.get(i);
			if(cliente.getCedula() != nuevoCliente.getCedula()) {
				clientes.add(nuevoCliente);
			}else {
				System.out.println("Cliente ya existe: "+ cliente.getCedula());
			}
		}
	}
	
	public void asignarPrestamo(String cedula, Prestamo prestamo) {
		Cliente cliente = null;
		for(int i=0; i<clientes.size(); i++) {
			cliente = clientes.get(i);
			if(cliente.getCedula() != cedula) {
				Prestamo prestamoCliente = new Prestamo(5000, 12, 12);
				prestamos.add(prestamoCliente);
				cliente.setPrestamos(prestamos);
			}else {
				System.out.println("No es cliente del Banco");
			}
		}
	}
	public ArrayList<Prestamo> buscarPrestamos(String cedula){
		Prestamo prestamo = null;
		Cliente cliente = null;
		for(int i=0; i<clientes.size();i++) {
			cliente = clientes.get(i);
			if(cliente.getCedula() == cedula) {
				if(prestamos.get(i) != null) {
					return prestamos;
				}else {
					return null;
				}
			}
		}
		return null;
	}
	public ArrayList<Prestamo> getPrestamos() {
		return prestamos;
	}
	public void setPrestamos(ArrayList<Prestamo> prestamos) {
		this.prestamos = prestamos;
	}
	public ArrayList<Cliente> getClientes() {
		return clientes;
	}
	public void setClientes(ArrayList<Cliente> clientes) {
		this.clientes = clientes;
	}
	
	
}
