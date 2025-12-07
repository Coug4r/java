package com.cmc.directorio.test;

import com.cmc.directorio.entidades.AdminContactos;
import com.cmc.directorio.entidades.Contacto;
import com.cmc.directorio.entidades.Telefono;

public class TestContactos2 {

	public static void main(String[] args) {
		Telefono telf1 = new Telefono("claro", "0979740616", 20);
		Contacto con1 = new Contacto("Mendieta", telf1 , 6.8);
		Telefono telf2 = new Telefono("claro", "0979740515", 21);
		Contacto con2 = new Contacto("Ludeña", telf2 , 8.67);
		AdminContactos at = new AdminContactos();	
		
		at.buscarMaspesado(con1, con2).imrpimir();
		System.out.println("\n"+at.compararOperadoras(con1, con2));

	}

}
