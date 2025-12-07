package com.cmc.directorio.test;
import com.cmc.directorio.entidades.AdminTelefono;
import com.cmc.directorio.entidades.Telefono;
public class TestTelefono4 {

	public static void main(String[] args) {
		Telefono tel1 = new Telefono("claro", "0993168120", 21);
		Telefono tel2 = new Telefono("claro", "0993168321", 21);
		Telefono tel3 = new Telefono("claro", "0993168765", 21);
		Telefono tel4 = new Telefono("movi", "09931568120", 21);
		AdminTelefono at = new AdminTelefono();
		int cont = at.contarClaro(tel1, tel2, tel3, tel4);
		System.out.println(cont+" Operadoras son de claro");
	}

}
