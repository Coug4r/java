package com.cmc.directorio.test;

import com.cmc.directorio.entidades.Contacto;
import com.cmc.directorio.entidades.Telefono;

public class TestContacto1 {

	public static void main(String[] args) {
		Telefono telf = new Telefono("claro", "0979740616", 20);
		Contacto c = new Contacto("Burneo", telf, 7.8);
		
		telf.imprimir();
		c.imrpimir();

	}

}
