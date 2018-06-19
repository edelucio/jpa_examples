package br.edu.uni7.tecnicas.jpa;

public class LineItem extends Contract {
	private String comments;
	private Double price;
	private Long num;
	
	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Long getNum() {
		return num;
	}

	public void setNum(Long num) {
		this.num = num;
	}

	public LineItem(Long id, String terms, String comments, Double price, Long num) {
		super(id, terms);
		this.comments = comments;
		this.price = price;
		this.num = num;
	}

}
