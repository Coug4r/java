package com.krakedev.servicios;

import java.util.ArrayList;

import com.krakedev.entidades.Carta;
import com.krakedev.entidades.Naipe;

public class Juego {
	private Naipe naipe;
	private ArrayList<ArrayList<Carta>> cartasJugador;
	private ArrayList<Carta> naipeBarajado;
	
	public Juego(){
		naipe = new Naipe();
		naipeBarajado = new ArrayList<Carta>();
		naipeBarajado = naipe.barajar();
		ArrayList <Carta> naipeBarajado = naipe.barajar();
	
	}
	public Juego(ArrayList<String> idsJugadores) {
	    cartasJugador = new ArrayList<>();
	    cartasJugador = new ArrayList<>();
        for (int i = 0; i < idsJugadores.size(); i++) {
            cartasJugador.add(new ArrayList<>());
        }
	    for (String id : idsJugadores) {
	        ArrayList<Carta> cartas = new ArrayList<>(); 
	        cartasJugador.add(cartas);
	    }
	}
	
	public void entregarCartas(int cartasPorJugador) {
		int totalJugadores = cartasJugador.size();
        int indexCarta = 0;

        for (int i = 0; i < cartasPorJugador; i++) {
        	naipeBarajado = new ArrayList<Carta>();
            for (int j = 0; j < totalJugadores; j++) {
                if (indexCarta < naipeBarajado.size()) {
                    Carta carta = naipeBarajado.get(indexCarta);
                    cartasJugador.get(j).add(carta);
                    indexCarta++;
                }
            }
        }
	}
	public ArrayList<ArrayList<Carta>> getCartasJugador() {
		return cartasJugador;
	}
	public void setCartasJugador(ArrayList<ArrayList<Carta>> cartasJugador) {
		this.cartasJugador = cartasJugador;
	}
	public int determinarGanador() {
	    int idGanador = 0;
	    int sumaGanador = sumarCartas(cartasJugador.get(0));

	    for (int i = 1; i < cartasJugador.size(); i++) {
	        int sumaActual = sumarCartas(cartasJugador.get(i));
	        if (sumaActual >= sumaGanador) {
	            sumaGanador = sumaActual;
	            idGanador = i;
	        }
	    }

	    return idGanador; // Retorna el índice del jugador ganador
	}

	private int sumarCartas(ArrayList<Carta> cartas) {
	    int suma = 0;
	    for (Carta carta : cartas) {
	        suma += carta.getNumero().getValor();
	    }
	    return suma;
	}


	public int devolverTotal(int idJugador) {
	    if (idJugador < 0 || idJugador >= cartasJugador.size()) {
	        throw new IllegalArgumentException("ID de jugador inválido.");
	    }

	    ArrayList<Carta> cartas = cartasJugador.get(idJugador);
	    int suma = 0;
	    for (Carta carta : cartas) {
	        suma += carta.getNumero().getValor(); // Usa getValor() desde la clase Numero
	    }
	    return suma;
	}

}
