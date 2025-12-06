package com.krakedev.controlflujo.test;
import com.krakedev.controlflujo.Validador;

public class TestValidador {
	public static void main(String[] args) {
		Validador validador = new Validador();
		validador.ValidarEdad(10);
		validador.ValidarEdad(15);
		validador.ValidarEdad(18);
		validador.ValidarEdad(-1);
		

	}

}
