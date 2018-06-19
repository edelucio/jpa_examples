package br.edu.uni7.jsf;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class HelloBean {
	private String name;
	private String message;

	public void execute() {
		message = "Hello, " + name + "!";
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
