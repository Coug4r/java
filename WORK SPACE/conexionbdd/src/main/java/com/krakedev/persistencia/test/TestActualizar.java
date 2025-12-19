package com.krakedev.persistencia.test;

import java.math.BigDecimal;
import java.util.Date;
import com.krakdev.persistencia.utils.Convertidor;
import com.krakedev.persistencia.entidades.EstadoCivil;
import com.krakedev.persistencia.entidades.Persona;
import com.krakedev.persistencia.servicios.AdminPersona;

public class TestActualizar {
	public static void main(String[] args) {
		EstadoCivil estadoCivil = new EstadoCivil("C", "Casado");
		Persona p = new Persona("1122334488","Paco","WEB",estadoCivil);
		
		try {
			Date fecha_nacimiento = Convertidor.convertirFecha("1970/07/25");
			Date horaa_nacimiento = Convertidor.convertirHora	("00:00");
			p.setFecha_nacimiento(fecha_nacimiento);
			p.setHora_nacimiento(horaa_nacimiento);
			p.setCantidad_ahorrada(new BigDecimal(1230.45));
			p.setNumero_hijos(50);
			p.setEstatura(1.72);
			AdminPersona.actualizar(p);
			
		} catch (Exception e) {
			System.out.println("Error en el sistema: "+e.getMessage());
		}
	}
}
