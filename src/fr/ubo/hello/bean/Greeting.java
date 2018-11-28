package fr.ubo.hello.bean;

import java.io.Serializable;

public class Greeting implements Serializable {
	
	private String message;
	private String auteur;		
	
	public Greeting() {
		super();
	}

	public Greeting(String message, String auteur) {
		super();
		this.message = message;
		this.auteur = auteur;
	}

	public Greeting(String message) {
		super();
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getAuteur() {
		return auteur;
	}

	public void setAuteur(String auteur) {
		this.auteur = auteur;
	}
	
	
	
	

}
