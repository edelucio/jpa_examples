package br.edu.uni7.jsf;

import java.util.List;

public class Professor {
	private Integer id;
	private String nome;
	private String titulo;
	private String interesse;
	private List<String> areaInterresse;
	
	public Professor(){
		
	}
	
	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getTitulo() {
		return titulo;
	}
	
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public List<String> getAreaInterresse() {
		return areaInterresse;
	}

	public void setAreaInterresse(List<String> areaInterresse) {
		this.areaInterresse = areaInterresse;
	}

	public String getInteresse() {
		return interesse;
	}

	public void setInteresse(String interesse) {
		this.interesse = interesse;
	}
		
}
