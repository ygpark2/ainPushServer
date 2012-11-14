package org.ain.domain;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity(name="user")
public class User {
	
	@Id
	private Long id;

	@Column(length=50)
	private String firstName;
	@Column(length=50)
	private String lastName;
	@Column(length=150, unique=true)
	private String email;
	
	@Column(nullable=false)
	private boolean enabled = true;
	@Column(nullable=false)
	private boolean accountNonExpired = true;
	@Column(nullable=false)
	private boolean credentialsNonExpired = true;
	@Column(nullable=false)
	private boolean accountNonLocked = true;
	
	@Column(length=35, unique=true, nullable=false)
	private String username;
	@Column(length=50, nullable=false)
	private String password;
	
	@OneToOne(mappedBy="user", cascade={CascadeType.ALL})
	private Role role;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
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

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	public boolean getEnabled() {
		return enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

	public boolean getAccountNonExpired() {
		return accountNonExpired;
	}

	public void setAccountNonExpired(boolean accountNonExpired) {
		this.accountNonExpired = accountNonExpired;
	}

	public boolean getCredentialsNonExpired() {
		return credentialsNonExpired;
	}

	public void setCredentialsNonExpired(boolean credentialsNonExpired) {
		this.credentialsNonExpired = credentialsNonExpired;
	}

	public boolean getAccountNonLocked() {
		return accountNonLocked;
	}

	public void setAccountNonLocked(boolean accountNonLocked) {
		this.accountNonLocked = accountNonLocked;
	}
}
