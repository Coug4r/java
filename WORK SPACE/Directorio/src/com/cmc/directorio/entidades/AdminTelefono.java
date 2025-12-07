package com.cmc.directorio.entidades;

public class AdminTelefono {
	public void activarMensajeria(Telefono telefono) {
		if(telefono.getOperadora() == "movi") {
			telefono.setTieneWhatsapp(true);
		}
	}
	public int contarMovi(Telefono tel1, Telefono tel2, Telefono tel3) {
		int cont = 0;		
		if(tel1.getOperadora()== "movi") {
			cont +=1;
		}
		if(tel2.getOperadora()== "movi") {
			cont +=1;
		}
		if(tel3.getOperadora()== "movi") {
			cont +=1;
		}
		return cont;
	}
	public int contarClaro(Telefono tel1, Telefono tel2, Telefono tel3, Telefono tel4) {
		int cont = 0;		
		if(tel1.getOperadora()== "claro") {
			cont +=1;
		}
		if(tel2.getOperadora()== "claro") {
			cont +=1;
		}
		if(tel3.getOperadora()== "claro") {
			cont +=1;
		}
		if(tel4.getOperadora()== "claro") {
			cont +=1;
		}
		return cont;
	}
}
