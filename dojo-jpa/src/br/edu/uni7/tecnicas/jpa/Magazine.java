package br.edu.uni7.tecnicas.jpa;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Magazine {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(nullable = false, unique = true)
	private String isbn;
	private String title;
	private Double price;
	private Integer copiesSold;

	@ManyToOne
	@JoinColumn(name = "company_id", referencedColumnName = "id")
	private Company publisher;

	@OneToOne
	private Article coverArticle;

	@OneToMany
	private List<Article> articles = new ArrayList<>();

	public Magazine() {

	}

	public Magazine(String isbn, Long id, String title, Double price, Integer copiesSold) {
		this.isbn = isbn;
		this.id = id;
		this.title = title;
		this.price = price;
		this.copiesSold = copiesSold;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Integer getCopiesSold() {
		return copiesSold;
	}

	public void setCopiesSold(Integer copiesSold) {
		this.copiesSold = copiesSold;
	}

	public Company getPublisher() {
		return publisher;
	}

	public void setPublisher(Company publisher) {
		this.publisher = publisher;
	}

	public Article getCoverArticle() {
		return coverArticle;
	}

	public void setCoverArticle(Article coverArticle) {
		this.coverArticle = coverArticle;
	}

	public List<Article> getArticles() {
		return articles;
	}

	public void setArticles(List<Article> articles) {
		this.articles = articles;
	}

}
