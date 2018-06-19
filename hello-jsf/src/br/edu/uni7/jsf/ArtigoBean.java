package br.edu.uni7.jsf;

import java.util.ArrayList;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class ArtigoBean {
	
	private Artigo artigo = new Artigo();
	private ArrayList<Artigo> artigos = new ArrayList<Artigo>();
	private ArrayList<String> lista = new ArrayList<String>();
	private String autor;
	private String email;

	public String addLista(){
		String next = "artigo";
		
		lista.add(autor);
		lista.add(email);
		
		return next;
	}
	
	public String adicionar(){
		String next = "artigos";
		
		artigo.setAutor(lista);
		artigo.setEmail(lista);
		artigos.add(artigo);
		artigo = new Artigo();
		
		return next;
	}
	
	public ArrayList<Artigo> getArtigos() {
		return artigos;
	}

	public void setArtigos(ArrayList<Artigo> artigos) {
		this.artigos = artigos;
	}

	public String cancelar(){
		String next = "artigo";
					
		return next;
	}

	public ArrayList<String> getLista() {
		return lista;
	}

	public void setLista(ArrayList<String> lista) {
		this.lista = lista;
	}

	public String getautor() {
		return autor;
	}

	public void setautor(String autor) {
		this.autor = autor;
	}
	
	public Artigo getArtigo() {
		return artigo;
	}
	
	public void setArtigo(Artigo artigo) {
		this.artigo = artigo;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}

