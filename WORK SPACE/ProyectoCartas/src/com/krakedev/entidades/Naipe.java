package com.krakedev.entidades;

import java.util.ArrayList;

public class Naipe {
	private ArrayList<Numero> numerosPosibles;
	private ArrayList<Carta> cartas;
	private ArrayList<Carta> auxiliar;
	public Naipe() {
		numerosPosibles = new ArrayList<Numero>();
		numerosPosibles.add(new Numero("A", 11));
		numerosPosibles.add(new Numero("2", 2))	;
		numerosPosibles.add(new Numero("3", 3));
		numerosPosibles.add(new Numero("4", 4));
		numerosPosibles.add(new Numero("5",5));
		numerosPosibles.add(new Numero("6", 6));
		numerosPosibles.add(new Numero("7", 7));
		numerosPosibles.add(new Numero("8", 8));
		numerosPosibles.add(new Numero("9", 9));
		numerosPosibles.add(new Numero("10", 10));
		numerosPosibles.add(new Numero("J", 10));
		numerosPosibles.add(new Numero("Q", 10));
		numerosPosibles.add(new Numero("K", 10));
		
		Palos palo = new Palos();
		Numero num = null;
		for (int i=0 ; i!=4;i++) {
			num = numerosPosibles.get(i);
			cartas.add(new Carta(num, palo.getCorazonNegro(), "N"));
			cartas.add(new Carta(num, palo.getCorazonRojo(), "N"));
			cartas.add(new Carta(num, palo.getDiamante(), "N"));
			cartas.add(new Carta(num, palo.getTrebol(), "N"));
		}
	}
	public ArrayList<Carta> getCartas() {
		return cartas;
	}
	public ArrayList<Carta> barajar(){
		for(int i=1; i!=100; i++) {
			int pos = Random.obtenerPosicion();
			Carta carta = cartas.get(pos);
			if(carta.getEstado().equals("N")) {
				auxiliar.add(carta);
				carta.setEstado("C");
			}
		}
		for(int i=1;i!=cartas.size();i++) {
			Carta carta = cartas.get(i);
			if(carta.getEstado()=="N") {
				auxiliar.add(carta);
				carta.setEstado("C");
			}
		}
		return auxiliar;
	}
}
