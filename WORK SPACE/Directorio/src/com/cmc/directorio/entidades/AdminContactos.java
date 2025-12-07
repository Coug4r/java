package com.cmc.directorio.entidades;

public class AdminContactos {
	public Contacto buscarMaspesado(Contacto c1, Contacto c2) {
		if(c1.getPeso() > c2.getPeso()) {
			return c1;
		}else if(c2.getPeso() > c1.getPeso()) {
			return c2;
		}else {
			return null;
		}
	}
	public boolean compararOperadoras(Contacto c1, Contacto c2) {
		Telefono op1 = c1.getTelefono(); 
		Telefono op2 = c2.getTelefono();
		if(op1.getOperadora() == op2.getOperadora()) {
			return true;
		}else {
			return false;
		}
	}
	public void activarUsuario(Contacto c) {
		Telefono whts = c.getTelefono();
		if(whts.isTieneWhatsapp()== true) {
			c.setActivo(true);
		}
	}
}
