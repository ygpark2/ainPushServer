package org.ain.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity(name="ios")
public class iOS {
	
	@Id
	private Long id;

	private String pemFile;
	private String pemFilePassword;
	private String p12File;
	private String p12FilePassword;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}

	public String getPemFile() {
		return pemFile;
	}
	public void setPemFile(String pemFile) {
		this.pemFile = pemFile;
	}
	public String getPemFilePassword() {
		return pemFilePassword;
	}
	public void setPemFilePassword(String pemFilePassword) {
		this.pemFilePassword = pemFilePassword;
	}
	public String getP12File() {
		return p12File;
	}
	public void setP12File(String p12File) {
		this.p12File = p12File;
	}
	public String getP12FilePassword() {
		return p12FilePassword;
	}
	public void setP12FilePassword(String p12FilePassword) {
		this.p12FilePassword = p12FilePassword;
	}
}
