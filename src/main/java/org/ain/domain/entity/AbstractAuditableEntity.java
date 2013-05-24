package org.ain.domain.entity;

import javax.persistence.MappedSuperclass;

import org.joda.time.DateTime;
import org.springframework.data.domain.Auditable;
import org.springframework.data.jpa.domain.AbstractPersistable;

import java.lang.SuppressWarnings;

@MappedSuperclass
@SuppressWarnings("serial")
public class AbstractAuditableEntity extends AbstractPersistable<Long> implements Auditable<String, Long> {

    private DateTime lastUpdated;
    private String lastUpdateUser;
    private DateTime created;
    private String createUser;

    /**
     * Gets created by audit user.
     */
    public String getCreatedBy() {
        return createUser;
    }

    /**
     * Sets created by audit user.
     */
    public void setCreatedBy(String createdBy) {
        this.createUser = createdBy;
    }
    
    /**
     * Gets create audit date.
     */    
    public DateTime getCreatedDate() {
        return created;
    }

    /**
     * Sets create audit date.
     */    
    public void setCreatedDate(DateTime creationDate) {
        this.created = creationDate;
    }

    /**
     * Gets last modified by audit user.
     */
    public String getLastModifiedBy() {
        return lastUpdateUser;
    }
    
    /**
     * Sets last modified by audit user.
     */
    public void setLastModifiedBy(String lastModifiedBy) {
        this.lastUpdateUser = lastModifiedBy;
    }

    /**
     * Gets last modified audit date.
     */    
    public DateTime getLastModifiedDate() {
        return lastUpdated;
    }

    /**
     * Sets last modified audit date.
     */    
    public void setLastModifiedDate(DateTime lastModifiedDate) {
        this.lastUpdated = lastModifiedDate;
    }

}