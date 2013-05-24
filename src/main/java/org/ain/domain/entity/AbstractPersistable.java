package org.ain.domain.entity;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

import org.hibernate.annotations.GenericGenerator;
import org.springframework.data.domain.Persistable;

/**
 * Abstract base class for entities. Provides a String ID that will contain a
 * UUID, leverages Hibernate's auto-generation for UUIDs, and
 * implements {@link #equals(Object)} and {@link #hashCode()} based on that id.
 * 
 * Inspired by Spring Data JPA's AbstractPersistable implementation.
 * 
 * @author Steve Finch
 */
@MappedSuperclass
public abstract class AbstractPersistable implements Persistable<String> {

	private static final long serialVersionUID = 230038279450703845L;

	@Id
	@GeneratedValue(generator = "system-uuid")
	@GenericGenerator(name = "system-uuid", strategy = "uuid")
	private String id;

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.springframework.data.domain.Persistable#getId()
	 */
	public String getId() {

		return id;
	}

	/**
	 * Sets the id of the entity.
	 * 
	 * @param id the id to set
	 */
	protected void setId(final String id) {

		this.id = id;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.springframework.data.domain.Persistable#isNew()
	 */
	public boolean isNew() {

		return null == getId();
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {

		return String.format("Entity of type %s with id: %s", this.getClass().getName(), getId());
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {

		if (null == obj) {
			return false;
		}

		if (this == obj) {
			return true;
		}

		if (!getClass().equals(obj.getClass())) {
			return false;
		}

		AbstractPersistable that = (AbstractPersistable) obj;

		return null == this.getId() ? false : this.getId().equals(that.getId());
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {

		int hashCode = 17;

		hashCode += null == getId() ? 0 : getId().hashCode() * 31;

		return hashCode;
	}
}