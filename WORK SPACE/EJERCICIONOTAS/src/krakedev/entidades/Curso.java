package krakedev.entidades;

import java.util.ArrayList;

public class Curso {
	private ArrayList<Estudiante> estudiantes;
	public Curso(){
		estudiantes = new ArrayList<Estudiante>();
	}
	public String buscarEstudiantePorCedula(Estudiante estudiante) {
		Estudiante est=null;
		for(int i=0;i<estudiantes.size();i++) {
			est = estudiantes.get(i);
			if(est.getCedula().equals(estudiante.getCedula())) {
				System.out.println("El estudiante es parte del curso!");
			}
		}
		return null;
	}
	public void matricularEstudiante(Estudiante estudiante) {
		if(buscarEstudiantePorCedula(estudiante)== null) {
			estudiantes.add(estudiante);
		}
	}
	public double calcularPromedioCurso() {
		Estudiante est = null;
		double prom=0.0;
		int i;
		for(i=0;i<estudiantes.size();i++) {
			est = estudiantes.get(i);
			ArrayList<Nota> notas = est.getNotas();
			for(int a=0;a<notas.size();a++) {
				return prom += notas.get(a).getCalificacion();	
			}
		}
		return prom;
	}
	public void mostrar() {
		Estudiante cur = null;
		for (int i=0;i<estudiantes.size();i++) {
			cur = estudiantes.get(i);
			System.out.print("Nombre: "+ cur.getNombre()+" Apellido: "+ cur.getApellido()+"Cedula: "+ cur.getCedula());
			for(int a=0;a<cur.getNotas().size();a++) {
				System.out.println(" Notas: "+cur.getNotas().get(a).getCalificacion());
			}
		}
	}
	public ArrayList<Estudiante> getEstudiantes() {
		return estudiantes;
	}
	public void setEstudiantes(ArrayList<Estudiante> estudiantes) {
		this.estudiantes = estudiantes;
	}
	
}
