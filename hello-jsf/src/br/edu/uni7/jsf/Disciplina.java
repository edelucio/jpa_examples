package br.edu.uni7.jsf;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class Disciplina {
	private Integer id;
	private String nome;
	
	public Disciplina(){
			
	}
	
	
	public Disciplina(Integer id, String nome) {
		super();
		this.id = id;
		this.nome = nome;
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
	
}
