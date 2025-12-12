package com.krakedev.test;
import com.krakedev.entidades.Random;
public class testRandom {
	public static void main(String[] args) {
		int pos = Random.obtenerPosicion();
		System.out.println("Posicion obtenida: "+ pos);
		if(pos== 1 || pos == 0 ) {
			System.out.println("Se obtubo "+ pos);
		}else {
			System.out.println("El metodo obtenerPosicion no ha arrojado 0 o 1");
		}
			
	}
}
