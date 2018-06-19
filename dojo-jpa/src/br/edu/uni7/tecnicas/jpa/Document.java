package br.edu.uni7.tecnicas.jpa;

import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class Document {
	@Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	public Long getId() {
		return id;
	}

	public Document(Long id) {
		super();

		this.id = id;
	}

	public void setId(Long id) {
		this.id = id;
	}

}
