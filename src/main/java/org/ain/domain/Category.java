package org.ain.domain;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.OneToMany;
import javax.persistence.ManyToOne;

import org.ain.domain.entity.AbstractAuditableEntity;

@Entity(name="ain_category")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="TYPE", discriminatorType=DiscriminatorType.INTEGER)
public class Category extends AbstractAuditableEntity {

	private String name;
	private String description;

    private Category parent;
    private Category child;

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="ID_CATEGORY_PARENT", nullable=false)
    public Category getParent() {
        return parent;
    }
    public void setParent(Category parent) {
        this.parent = parent;
    }

    @ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="ID_CATEGORY_CHILD", nullable=false)
    public Category getChild() {
        return child;
    }
    public void setChild(Category child) {
        this.child = child;
    }

}
