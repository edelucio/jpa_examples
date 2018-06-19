package br.edu.uni7.tecnicas.jpa;

import java.sql.Date;

public class LifetimeSubscription extends Subscription {
	private Boolean eliteClub;
	
	public LifetimeSubscription(Long id, Date startDate, Double payment) {
		super(id, startDate, payment);
		
	}

	public Boolean getEliteClub() {
		return eliteClub;
	}

	public void setEliteClub(Boolean eliteClub) {
		this.eliteClub = eliteClub;
	}


	
}
