package com.cmc.directorio.test;

import com.cmc.directorio.entidades.AdminContactos;
import com.cmc.directorio.entidades.Contacto;
import com.cmc.directorio.entidades.Telefono;

public class TestActivos {

	public static void main(String[] args) {
		Telefono telf1 = new Telefono("claro", "0979740616", 20);
		Contacto con1 = new Contacto("Mendieta", telf1 , 6.8);
		AdminContactos at = new AdminContactos();
		telf1.imprimir();
		at.activarUsuario(con1);
		con1.imrpimir();
	}

}
