package br.edu.uni7.jsf;

import java.util.Calendar;

public class Produto {
	private Integer id;
	private String nome;
	private String descricao;
	private Double preco;
	private boolean editavel;
	private Calendar dataFabricacao;
	private Double desconto;
	
	
	public Calendar getDataFabricacao() {
		return dataFabricacao;
	}

	public void setDataFabricacao(Calendar dataFabricacao) {
		this.dataFabricacao = dataFabricacao;
	}

	public Double getDesconto() {
		return desconto;
	}

	public void setDesconto(Double desconto) {
		this.desconto = desconto;
	}

	public Produto() {
	}

	public Produto(Integer id, 
			String nome, 
			String descricao, 
			Double preco) {
		this.id = id;
		this.nome = nome;
		this.descricao = descricao;
		this.preco = preco;
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

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}
	
	public boolean isEditavel() {
		return editavel;
	}
	
	public void setEditavel(boolean editavel) {
		this.editavel = editavel;
	}
}
