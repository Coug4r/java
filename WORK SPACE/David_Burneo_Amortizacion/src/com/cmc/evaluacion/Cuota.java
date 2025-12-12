package com.cmc.evaluacion;
//import com.cmc.evaluacion.utilitario.Utilitario;
public class Cuota {
	private int Numero;
	private double cuota, capital,inicio, interes, abonoCapital, saldo;
	
	public Cuota(int numero) {
		Numero = numero;
	}
	
	public void mostrarPrestamo() {
		System.out.printf(" %d | %.2f | %.2f | %.2f | %.2f | %.2f"  ,Numero, cuota, capital, interes, abonoCapital,inicio );
		//System.out.print(Numero+ " | "+Utilitario.redondear(cuota)+" | "+Utilitario.redondear(inicio)+" | "+Utilitario.redondear(interes)+" | "+Utilitario.redondear(abonoCapital)+" | "+Utilitario.redondear(capital)+" | ");
	}
	public double getCuota() {
		return cuota;
	}
	public void setCuota(double cuota) {
		this.cuota = cuota;
	}
	public double getCapital() {
		return capital;
	}
	public void setCapital(double capital) {
		this.capital = capital;
	}
	public double getInteres() {
		return interes;
	}
	public void setInteres(double interes) {
		this.interes = interes;
	}
	public double getAbonoCapital() {
		return abonoCapital;
	}
	public void setAbonoCapital(double abonoCapital) {
		this.abonoCapital = abonoCapital;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public double getInicio() {
		return inicio;
	}

	public void setInicio(double inicio) {
		this.inicio = inicio;
	}
}
