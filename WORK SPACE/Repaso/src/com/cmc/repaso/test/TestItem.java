package com.cmc.repaso.test;
import com.cmc.repaso.entidades.Item;
public class TestItem {

	public static void main(String[] args) {
		Item it1 = new Item("PS5");
		Item it2 = new Item("XBOX");
		
		it1.imprimir();
		it1.vender(4);
		it1.imprimir();
		it1.devolver(2);
		it1.imprimir();
		
		it2.imprimir();
		it2.vender(7);
		it2.imprimir();
		it2.devolver(6);
		it2.imprimir();
		
	}

}
