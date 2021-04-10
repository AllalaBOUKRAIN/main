package com.sip.ams.entities;

public class ProviderEntity {

	private String name;
	private String adresse;
	private String email;

	public ProviderEntity(String name, String adresse, String email) {
		super();
		this.name = name;
		this.adresse = adresse;
		this.email = email;
	}

	public ProviderEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public String toString() {
		return "ProviderEntity [name=" + name + ", adresse=" + adresse + ", email=" + email + "]";
	}
	
	

}
