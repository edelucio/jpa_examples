package br.edu.uni7.jpa;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "TB_USUARIO")
public class Usuario {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "cd_usuario")
	private Integer id;
	@Column(name = "nm_usuario")
	private String nome;
	@Column(name = "login_usuario", unique = true)
	private String username;
	private String password;
	@Column(name = "data_criacao")
	@Temporal(TemporalType.TIMESTAMP)
	private Calendar dataCriacao;

	@Enumerated(EnumType.STRING)
	private StatusUsuario status;

	@OneToMany(mappedBy="usuario")
	private List<Veiculo> veiculos = new ArrayList<>();

	public Usuario() {
		status = StatusUsuario.Inativo;
		dataCriacao = new GregorianCalendar();
	}

	public Usuario(Integer id, String nome, String username, String password) {
		this();
		this.id = id;
		this.nome = nome;
		this.username = username;
		this.password = password;
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

	public Calendar getDataCriacao() {
		return dataCriacao;
	}

	public void setDataCriacao(Calendar dataCriacao) {
		this.dataCriacao = dataCriacao;
	}

	public StatusUsuario getStatus() {
		return status;
	}

	public void setStatus(StatusUsuario status) {
		this.status = status;
	}

	public List<Veiculo> getVeiculos() {
		return veiculos;
	}

	public void setVeiculos(List<Veiculo> veiculos) {
		this.veiculos = veiculos;
	}
}
