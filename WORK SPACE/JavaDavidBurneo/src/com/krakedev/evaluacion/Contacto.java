package com.krakedev.evaluacion;

import java.util.ArrayList;

public class Contacto {
	private String cedula;
	private String nombre;
	private String apellido;
	private Direccion direccion;
	private ArrayList<Telefono> telefonos;
	
	public Contacto() {
		telefonos = new ArrayList<Telefono>();
	}
	public Contacto(String cedula, String nombre, String apellido) {
		this.cedula = cedula;
		this.nombre = nombre;
		this.apellido = apellido;
		
	}
	public void imprimir() {
		if(direccion != null) {
			System.out.println("***"+nombre+" "+apellido+"***\nDireccion: "+direccion.getCallePrincipal()+" y "+direccion.getCalleSecundaria());
		}else {
			System.out.println("***"+nombre+" "+apellido+"***\nNo tiene asociada una direccion");
		}
	}
	public void agregarTelefono(Telefono telefono) {
		telefonos = new ArrayList<Telefono>();
		telefonos.add(telefono);
	}
	public void mostrarTelefonos() {
		Telefono tel = null;
		for (int i=0;i<telefonos.size();i++) {
			tel = telefonos.get(i);
			if(tel.getEstado().equals("C")) {
				System.out.println("Telefonos con estado 'C'\nNumero: "+tel.getNumero()+", Tipo: "+tel.getTipo());
			}
		}
	}
	public ArrayList<Telefono> recuperarIncorrectos() {
		Telefono tel = null;
		ArrayList<Telefono> cont = new ArrayList<Telefono>();
		for (int i=0;i<telefonos.size();i++) {
			tel = telefonos.get(i);
			if(tel.getEstado().equals("E")) {
				cont.add(tel);
			}
		}
		return cont;
	}
	public void setCedual(String cedual) {
		this.cedula = cedual;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public Direccion getDireccion() {
		return direccion;
	}
	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}
	public String getCedula() {
		return cedula;
	}
	public void setCedula(String cedula) {
		this.cedula = cedula;
	}
	public ArrayList<Telefono> getTelefonos() {
		return telefonos;
	}
	public void setTelefonos(ArrayList<Telefono> telefonos) {
		this.telefonos = telefonos;
	}
	
	
}
