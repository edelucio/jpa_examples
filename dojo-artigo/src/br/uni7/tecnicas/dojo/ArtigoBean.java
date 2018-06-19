package br.uni7.tecnicas.dojo;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.event.ValueChangeEvent;

@ManagedBean
@SessionScoped
public class ArtigoBean {
	private Palavra palavra = new Palavra();
	private Artigo artigo = new Artigo();
	private ArtigoDAO dao = new ArtigoDAO();

	public void tratarValorAlterado(ValueChangeEvent event) {
		Object newValue = event.getNewValue();
		System.out.println(newValue);
	}

	public String adicionarArtigo() {
		String next = null;

		if (artigo.getPalavras().size() > 1) {
			dao.salvar(artigo);
			next = "artigos";
		}
		
		return next;

	}

	public void adicionarPalavra() {
		artigo.getPalavras().add(palavra);
		palavra = new Palavra();
	}

	public List<Artigo> getArtigos() {
		return dao.buscarTodos();
	}

	public Palavra getPalavra() {
		return palavra;
	}

	public void setPalavra(Palavra palavra) {
		this.palavra = palavra;
	}

	public Artigo getArtigo() {
		return artigo;
	}

	public void setArtigo(Artigo artigo) {
		this.artigo = artigo;
	}

}
