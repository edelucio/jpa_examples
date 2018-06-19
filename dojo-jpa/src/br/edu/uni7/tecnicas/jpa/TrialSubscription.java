package br.edu.uni7.tecnicas.jpa;

import java.sql.Date;

public class TrialSubscription extends Subscription {
	public TrialSubscription(Long id, Date startDate, Double payment) {
		super(id, startDate, payment);
		
	}

	public Date getEndDAte() {
		return endDAte;
	}

	public void setEndDAte(Date endDAte) {
		this.endDAte = endDAte;
	}

	private Date endDAte;

}
