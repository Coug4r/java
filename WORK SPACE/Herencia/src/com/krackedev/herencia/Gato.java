package com.krackedev.herencia;

public class Gato extends Animal{
	@Override
	public void dormir() {
		System.out.println("Soy un gato");
	}
	public void maullar() {
		System.out.println("Miaaauuuuu!");
	}
	public void maullar(String adg) {
		System.out.println("Miaaauuuuu!" + adg);
	}
}
