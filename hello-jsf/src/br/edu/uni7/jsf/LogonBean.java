package br.edu.uni7.jsf;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class LogonBean {
	private String username;
	private String password;

	public String execute() {
		String next = null;

		if ("uni7".equals(username) && "123".equals(password)) {
			next = "index";
		}

		return next;
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

}
