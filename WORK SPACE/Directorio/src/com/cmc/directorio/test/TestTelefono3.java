package com.cmc.directorio.test;
import com.cmc.directorio.entidades.AdminTelefono;
import com.cmc.directorio.entidades.Telefono;

public class TestTelefono3 {

	public static void main(String[] args) {
		Telefono tel1 = new Telefono("movi", "0993168120", 31);
		Telefono tel2 = new Telefono("movi", "0979740616", 32);
		Telefono tel3 = new Telefono("claro", "0998967621", 40);
		AdminTelefono at = new AdminTelefono();
		int cont = at.contarMovi(tel1, tel2, tel3);
		System.out.println(cont+" Operadoras son de movi");
	}
}
