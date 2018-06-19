package br.edu.uni7.jsf;

import java.util.ArrayList;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class ProfessorBean {
	
	private Professor professor = new Professor();
	private ArrayList<Professor> professores = new ArrayList<Professor>();
	private ArrayList<String> lista = new ArrayList<String>();
	private String areaInteresse;

	public String addLista(){
		String next = "professor";
		
		lista.add(areaInteresse);
		
		return next;
	}
	
	public String adicionar(){
		String next = "professores";
		
		professor.setAreaInterresse(lista);
		professores.add(professor);
		professor = new Professor();
		
		return next;
	}
	
	public ArrayList<Professor> getProfessores() {
		return professores;
	}

	public void setProfessores(ArrayList<Professor> professores) {
		this.professores = professores;
	}

	public String cancelar(){
		String next = "professor";
					
		return next;
	}

	public ArrayList<String> getLista() {
		return lista;
	}

	public void setLista(ArrayList<String> lista) {
		this.lista = lista;
	}

	public String getareaInteresse() {
		return areaInteresse;
	}

	public void setareaInteresse(String areaInteresse) {
		this.areaInteresse = areaInteresse;
	}
	
	public Professor getProfessor() {
		return professor;
	}
	
	public void setProfessor(Professor professor) {
		this.professor = professor;
	}

}
