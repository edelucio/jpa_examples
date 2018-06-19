package br.edu.uni7.jsf;

import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class ProdutoBean {
	private Produto produto = new Produto();
	private List<Produto> produtos = new ArrayList<>();

	public String adicionar() {
		String next = "produtos";
		
		produto.setDataFabricacao(new GregorianCalendar());

		produtos.add(produto);
		produto = new Produto();

		return next;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public List<Produto> getProdutos() {
		return produtos;
	}

	public void setProdutos(List<Produto> produtos) {
		this.produtos = produtos;
	}
}
