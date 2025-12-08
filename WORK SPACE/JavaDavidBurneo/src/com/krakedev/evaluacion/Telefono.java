package com.krakedev.evaluacion;

public class Telefono {

	private String numero;
	private String tipo;
	private String estado;
	
	public Telefono(String numero, String tipo) {
		this.numero=numero;
		this.tipo=tipo;
		if(numero != null && tipo != null) {
			if(tipo == "Movil" && numero.length()==10){
				this.tipo="Mobil";
				this.estado="C";
			}else if(tipo == "Fijo" && numero.length()==7){
				this.tipo="Fijo";
				this.estado="C";
			}else {
				this.estado="E";
			}
		}else {
			this.estado="E";
		}
	}
	public String getNumero() {
		return numero;
	}
	public String getTipo() {
		return tipo;
	}
	public String getEstado() {
		return estado;
	}
	
	
	
}
