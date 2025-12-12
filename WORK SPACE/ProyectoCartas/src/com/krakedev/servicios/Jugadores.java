package com.krakedev.servicios;

import java.util.ArrayList;

public class Jugadores {
	private ArrayList<String> jugadores;
	
	 public ArrayList<String> getJugadores() {
		return jugadores;
	}

	public void setJugadores(ArrayList<String> jugadores) {
		this.jugadores = jugadores;
	}
	
	 public void jugar() {
	        ArrayList<String> jugadores = new ArrayList<>();
	        jugadores.add("Ana");
	        jugadores.add("Luis");
	        jugadores.add("Carlos");

	        setJugadores(jugadores);

	        Juego juego = new Juego();
	        juego.setCartasJugador(new ArrayList<>());
	        for (int i = 0; i < jugadores.size(); i++) {
	            juego.getCartasJugador().add(new ArrayList<>());
	        }

	        juego.entregarCartas(5);

	        for (int i = 0; i < jugadores.size(); i++) {
	            int totalCartas = juego.getCartasJugador().get(i).size();
	            System.out.println("Jugador " + (i + 1) + " (" + jugadores.get(i) + ") tiene " + totalCartas + " cartas.");
	        }
	        int idGanador = juego.determinarGanador();
	        System.out.println("El ganador es: " + jugadores.get(idGanador));

	    }
}
