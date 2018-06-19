package br.edu.uni7.jsf;

import java.util.List;

public class Autor {
	private String nome;
	private String email;
	private List<String> autor;
	
	public String getNome() {
		return nome;
	}
	public void setAutor(String nome) {
		this.nome = nome;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public List<String> getAutor() {
		return autor;
	}
	
	public void setAutor(List<String> autor) {
		this.autor = autor;
	}
		
	public String getEmail() {
		return email;
	}
	
}
