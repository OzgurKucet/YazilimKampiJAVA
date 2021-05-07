package Demo.entities.concretes;

import Demo.entities.abstracts.Entity;

public class User implements Entity{
	
	private int id;
	private String ad;
	private String Soyad;
	private String ePosta;
	private String parola;
	
	
	public User(int id, String ad, String soyad, String ePosta, String parola) {
		
		this.id = id;
		this.ad = ad;
		Soyad = soyad;
		this.ePosta = ePosta;
		this.parola = parola;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getAd() {
		return ad;
	}


	public void setAd(String ad) {
		this.ad = ad;
	}


	public String getSoyad() {
		return Soyad;
	}


	public void setSoyad(String soyad) {
		Soyad = soyad;
	}


	public String getePosta() {
		return ePosta;
	}


	public void setePosta(String ePosta) {
		this.ePosta = ePosta;
	}


	public String getParola() {
		return parola;
	}


	public void setParola(String parola) {
		this.parola = parola;
	}
	
}
