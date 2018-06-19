package br.edu.uni7.jsf;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class FormBean {
	private String username;
	private String password;
	private String perfil;
	private boolean bloqueado;
	private String disponibilidade;
	
	public List<Disciplina> getDisciplinas(){
		List<Disciplina> result = new ArrayList<>();
		
		result.add(new Disciplina(1, "POO"));
		result.add(new Disciplina(3, "Estágio II"));
		result.add(new Disciplina(2, "Técnicas"));
		result.add(new Disciplina(5, "POD"));
		
		return result;
	}

	public String getDisponibilidade() {
		return disponibilidade;
	}

	public void setDisponibilidade(String disponibilidade) {
		this.disponibilidade = disponibilidade;
	}

	public boolean isBloqueado() {
		return bloqueado;
	}

	public void setBloqueado(boolean bloqueado) {
		this.bloqueado = bloqueado;
	}

	public String execute() {
		return null;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPerfil() {
		return perfil;
	}

	public void setPerfil(String perfil) {
		this.perfil = perfil;
	}
}
