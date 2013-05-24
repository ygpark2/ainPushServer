package org.ain.domain;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;

import org.ain.domain.entity.AbstractAuditableEntity;

@Entity(name="ain_role")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="TYPE", discriminatorType=DiscriminatorType.INTEGER)
public class Role extends AbstractAuditableEntity {

    @ManyToMany(cascade=CascadeType.ALL)
    @JoinTable(name = "user_role",
    	joinColumns = {
    		@JoinColumn(name="roleId")
    	},
    	inverseJoinColumns = {
    		@JoinColumn(name="userId")
    	}
    )
    private List<User> users;

    private String role;

	public List<User> getUser() {
		return users;
	}
	public void setUser(List<User> users) {
		this.users = users;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
}
