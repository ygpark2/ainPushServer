package org.ain.domain;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.InheritanceType;
import javax.persistence.DiscriminatorType;

@Entity
@Table(name="ain_user")
public class User {

	@Id
	@Column(length=50, unique=true, nullable=false)
	private String username;
	@Column(length=50, nullable=false)
	private String password;

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

    @ManyToMany(cascade=CascadeType.ALL)
    @JoinTable(name = "user_role",
    	joinColumns = {
    		@JoinColumn(name="roleId")
    	},
    	inverseJoinColumns = {
    		@JoinColumn(name="userId")
    	}
    )
	private List<Role> roles;

    @OneToOne(mappedBy="user", cascade={CascadeType.ALL})
	private Profile profile;

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

	public List<Role> getRoles() {
		return roles;
	}

	public void setRoles(List<Role> roles) {
		this.roles = roles;
	}

	public Profile getProfile() {
		return profile;
	}

	public void setProfile(Profile profile) {
		this.profile = profile;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

}
