package com.krakedev.entidades;

public class Carta {
	private Numero Numero;
	private String palo;
	private String estado;
	public Carta(Numero numero, String palo, String estado) {
		Numero = numero;
		this.palo = palo;
		this.estado = estado;
		
	}
	public Numero getNumero() {
		return Numero;
	}
	public void setNumero(Numero numero) {
		Numero = numero;
	}
	public String getPalo() {
		return palo;
	}
	public void setPalo(String palo) {
		this.palo = palo;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public void mostrar() {
		System.out.println(Numero + palo);
	}
}
