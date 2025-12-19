package com.krakedev.excepciones;

public class Ejercicio1 {

	public static void main(String[] args) {
		System.out.println("Inicio");
		String a = "dasda";
		try {
			a.substring(3);
			System.out.println("Fin");
		}catch(Exception ex){
			System.out.println("Entra al catch");
		}finally {
			System.out.println("INgresa al finally");
		}
		System.out.println("Fuera del catch");
	}

}
