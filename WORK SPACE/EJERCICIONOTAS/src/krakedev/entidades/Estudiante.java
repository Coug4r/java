package krakedev.entidades;

import java.util.ArrayList;

public class Estudiante {
	private String nombre;
	private String apellido;
	private String cedula;
	private ArrayList<Nota> notas;
	
	public Estudiante( String cedula, String nombre, String apellido) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.cedula = cedula;
		this.notas = new ArrayList<>();
	}
	public void agregarNota(Nota nuevaNota) {
		Nota cal = null;
        double calificacion = nuevaNota.getCalificacion();
        if(notas.size()!=0) {
        	for (int i=0;i<notas.size();i++) {
        		cal = notas.get(i);
        		if(calificacion >=0 && calificacion <=10 && cal.getMateria().getCodigo() != nuevaNota.getMateria().getCodigo()) {
        			notas.add(nuevaNota);
        		}
        	}
        }else {
        	if(calificacion >=0 && calificacion <=10 ) {
    			notas.add(nuevaNota);
    		}
        }
	}
	public void modificarNota(String codigo, double nuevaNota) {
		Nota cal = null;
		for (int i=0;i<notas.size();i++) {
			cal = notas.get(i);
			if(codigo == cal.getMateria().getCodigo() && nuevaNota >=0 && nuevaNota <=10) {
				cal.setCalificacion(nuevaNota);
			}
		}
	}
	public double calcularPromedioNotasEstudiante() {
		Nota cal = null;
		double prom = 0;
		int i;
		for (i=0;i<notas.size();i++) {
			cal = notas.get(i);
			prom = prom + cal.getCalificacion();
		}
		return prom = prom / i;
	}
	public void mostrar() {
		Nota cal = null;
		for (int i=0;i<notas.size();i++) {
			cal = notas.get(i);
			System.out.println("Materia = "+cal.getMateria().getNombre()+" Nota = "+cal.getCalificacion());
		}
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getCedula() {
		return cedula;
	}
	public void setCedula(String cedula) {
		this.cedula = cedula;
	}
	public ArrayList<Nota> getNotas() {
		return notas;
	}
	public void setNotas(ArrayList<Nota> notas) {
		this.notas = notas;
	}
	
}

