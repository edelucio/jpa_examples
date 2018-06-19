package br.edu.uni7.tecnicas.jpa;

public class Contract extends Document {
	private String terms;

	public String getTerms() {
		return terms;
	}

	public void setTerms(String terms) {
		this.terms = terms;
	}

	public Contract(Long id, String terms) {
		super(id);
		this.terms = terms;
	}

}
