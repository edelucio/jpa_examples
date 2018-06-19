package br.edu.uni7.tecnicas.jpa;

import java.sql.Date;

public abstract class Subscription {
	private Long id;
	private static Date startDate;
	private Double payment;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public static Date getStartDate() {
		return startDate;
	}

	public void setStartDate(Date startDate) {
		Subscription.startDate = startDate;
	}

	public Double getPayment() {
		return payment;
	}

	public void setPayment(Double payment) {
		this.payment = payment;
	}

	public Subscription(Long id, Date startDate, Double payment) {
		super();
		this.id = id;
		Subscription.startDate = startDate;
		this.payment = payment;
	}
		
}
