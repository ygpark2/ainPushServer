package org.ain.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.OneToMany;
import javax.persistence.ManyToOne;;

@Entity(name="android")
public class Android {
	
	@Id
	private Long id;

	private String apiKey;
	private String deviceId;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}

}
