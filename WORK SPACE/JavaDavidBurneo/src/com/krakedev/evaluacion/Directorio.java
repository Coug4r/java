package com.krakedev.evaluacion;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Directorio {
	private ArrayList<Contacto> contactos;
	private Date fechaModificacion;
	private ArrayList<Contacto> correctos;
	private ArrayList<Contacto> incorrectos;
	public Directorio() {
		contactos =  new ArrayList<Contacto>();
		fechaModificacion = null;
	}
	public boolean agregarContacto(Contacto con) {
		for (Contacto c : contactos) {
            if (c.getCedula().equals(con.getCedula())) {
                return false;
            }
        }
        contactos.add(con);
        fechaModificacion = new Date(); // ✅ Se actualiza la fecha
        return true;
    }
	public int contarFijos() {
		int cont=0;
	    ArrayList<Telefono> con = null;
	    for(int i=0;i<contactos.size();i++) {
	    	con = contactos.get(i).getTelefonos();
	    	for(int a=0;a<con.size();a++) {
	    		Telefono tel = con.get(a);
	    		if(tel.getTipo().equals("Fijo")&&tel.getEstado().equals("C")) {
	    			cont ++;
	    		}
	    	}
	    }
	    return cont;
	}
	public void depurar() {
		System.out.println("Correctos: "+correctos+"Incorrectos: "+incorrectos);
	}
	public int contarPerdidos() {
	    int contador = 0;
	    for (Contacto c : contactos) {
	        if (c.getDireccion() == null) {
	            contador++;
	        }
	    }
	    return contador;
	}
	public Contacto buscarPorCedula(String cedula) {
		for (Contacto c : contactos) {
            if (c.getCedula().equals(cedula)) {
                return c;
            }
        }
        return null;
	}
	public String consultarUltimaModificacion() {
        if (fechaModificacion == null) {
            return "No se ha realizado ninguna modificación.";
        }
        SimpleDateFormat formato = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        return formato.format(fechaModificacion);
    }
	public ArrayList<Contacto> getCorrectos() {
		return correctos;
	}
	public void setCorrectos(ArrayList<Contacto> correctos) {
		this.correctos = correctos;
	}
	public ArrayList<Contacto> getIncorrectos() {
		return incorrectos;
	}
	public void setIncorrectos(ArrayList<Contacto> incorrectos) {
		this.incorrectos = incorrectos;
	}
	public ArrayList<Contacto> getContactos() {
		return contactos;
	}
	public void setContactos(ArrayList<Contacto> contactos) {
		this.contactos = contactos;
	}
	
}
	