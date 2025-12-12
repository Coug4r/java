package com.cmc.evaluacion;

import java.util.ArrayList;

public class Prestamo {
	private double Monto;
	private double Interes;
	private int Plazo;
	private ArrayList<Cuota> cuotas;
	
	public Prestamo(double monto, double interes, int plazo) {
		cuotas = new  ArrayList<Cuota>(plazo); 
		Monto = monto;
		Interes = interes;
		Plazo = plazo;
	}
	public double getMonto() {
		return Monto;
	}
	public void setMonto(double monto) {
		Monto = monto;
	}
	public double getInteres() {
		return Interes;
	}
	public void setInteres(double interes) {
		Interes = interes;
	}
	public int getPlazo() {
		return Plazo;
	}
	public void setPlazo(int plazo) {
		Plazo = plazo;
	}
	public ArrayList<Cuota> getCuotas() {
		return cuotas;
	}		
}
