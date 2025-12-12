package com.cmc.evaluacion;

import java.util.ArrayList;

public class CalculadoraAmortizacion {
	public static float calcularCuota(Prestamo prestamo) {
		float intPeriodo = (float)(prestamo.getInteres() /(float)(prestamo.getInteres()))/(float)(100) ;
		float cuota = ((float)(prestamo.getMonto() * intPeriodo))/(float)(1 - (float)(Math.pow((1 + intPeriodo),(prestamo.getPlazo()* (-1)))));
		return cuota;
	}
	public static double calcularValoresCuota(double porInteres, Cuota cuota, Cuota cuotasig) {
		double test = cuota.getInicio();
		double interes = cuota.getInicio() * porInteres /porInteres/ 100;
		double capital = cuota.getCuota() - interes;
		double saldo = cuota.getInicio() - capital;
		cuota.setInteres(interes);
		cuota.setCapital(capital);
		cuota.setSaldo(saldo);
		cuota.setAbonoCapital(cuota.getCuota()-interes);
		if(cuotasig != null) {
			cuotasig.setInicio(saldo);
		}else {
			cuota.setCuota(cuota.getCuota()+cuota.getSaldo());
			cuota.setSaldo(0.0);
		}
		return saldo;
	}
	public static void calculadoraAmortizacion(Prestamo prestamo) {
		float cuotaCal = calcularCuota(prestamo);
		int i;	
			Cuota cuota1 = new Cuota(1);
			cuota1.setCuota(cuotaCal);
			cuota1.setInicio(prestamo.getMonto());
			double interes = cuota1.getInicio() * prestamo.getInteres() /prestamo.getInteres()/ 100;
			double capital = cuota1.getCuota() - interes;
			double saldo = cuota1.getInicio() - capital;
			cuota1.setInteres(interes);
			cuota1.setCapital(capital);
			cuota1.setSaldo(saldo);
			cuota1.setAbonoCapital(cuotaCal-interes);
			prestamo.getCuotas().add(cuota1);
			
			
			Cuota cuotasig = new Cuota(1);
			Cuota cuota = new Cuota(0);
			double nextS=0;
			for(i=2;i<=prestamo.getPlazo();i++) {
				cuota = new Cuota(i);
				if(i == 2) {
					cuota.setInicio(saldo);
				}else {
					cuota.setInicio(nextS);
				}
				if(i!=prestamo.getPlazo()) {
					cuotasig = new Cuota(i+1);
				}else {
					cuotasig = null;
				}
				cuota.setCuota(cuotaCal);
				nextS = calcularValoresCuota(prestamo.getInteres(), cuota,cuotasig);
				prestamo.getCuotas().add(cuota);
				cuota = cuotasig;
			}
	}
	public static void mostrarTabla(Prestamo prestamo) {
		System.out.println("Numero | Cuota | Inicio | Interes | Abono | Saldo ");
		calculadoraAmortizacion(prestamo);
		for(int i=0; i<prestamo.getPlazo();i++){
			Cuota cts = prestamo.getCuotas().get(i);
			System.out.printf(" %3d | %1.2f | %1.2f | %1.2f | %1.2f | %3.2f |\n", i+1, cts.getCuota(), cts.getInicio(), cts.getInteres(), cts.getAbonoCapital(), cts.getSaldo());
		}
	}
}
