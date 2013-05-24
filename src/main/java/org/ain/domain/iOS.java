package org.ain.domain;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToOne;

import org.ain.domain.entity.AbstractAuditableEntity;

@Entity(name="ain_ios")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="TYPE", discriminatorType=DiscriminatorType.INTEGER)
public class iOS extends AbstractAuditableEntity {

	private String pemFile;
	private String pemFilePassword;
	private String p12File;
	private String p12FilePassword;

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
