package com.krakedev.persistencia.entidades;

import java.util.Date;

public class Estudiante {
	private String cedula;
	private String nombre;
	private String apellido;
	private String email;
	private Date fecha_nacimiento;
	private Profesores codigoProfesor;
	
	@Override
	public String toString() {
		return "Estudiante [cedula=" + cedula + ", nombre=" + nombre + ", apellido=" + apellido + ", email=" + email
				+ ", fecha_nacimiento=" + fecha_nacimiento + ", codigoProfesor=" + codigoProfesor + "]";
	}

	public Estudiante() {}
	
	public Estudiante(String cedula, String nombre, String apellido, String email,Profesores codigoProfesor) {
		super();
		this.cedula = cedula;
		this.nombre = nombre;
		this.apellido = apellido;
		this.email = email;
		this.codigoProfesor = codigoProfesor;
	}
	public String getCedula() {
		return cedula;
	}
	public void setCedula(String cedula) {
		this.cedula = cedula;
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Date getFecha_nacimiento() {
		return fecha_nacimiento;
	}
	public void setFecha_nacimiento(Date fecha_nacimiento) {
		this.fecha_nacimiento = fecha_nacimiento;
	}
	public Profesores getCodigoProfesor() {
		return codigoProfesor;
	}
	public void setCodigoProfesor(Profesores codigoProfesor) {
		this.codigoProfesor = codigoProfesor;
	}
}
