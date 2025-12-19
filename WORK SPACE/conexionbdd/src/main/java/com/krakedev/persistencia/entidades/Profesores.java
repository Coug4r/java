package com.krakedev.persistencia.entidades;

public class Profesores {
	private int codigo;
	private String nombre;
	@Override
	public String toString() {
		return "Profesores [codigo=" + codigo + ", nombre=" + nombre + "]";
	}
	public Profesores() {}
	public Profesores(int codigo, String nombre) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}
