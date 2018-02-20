package com.sam.loginregister.models;
import java.util.List;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import org.springframework.format.annotation.DateTimeFormat;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;

@Entity
@Table(name="subs")
public class Subscription {
	@Id
	@GeneratedValue
	private long id;
	
	
	@Size(min=1)
	private String name;
	
	@Size(min=1)
	private long cost;
	@Size(min=1)
	private boolean status;
	
	@DateTimeFormat(pattern="MM:dd:yyyy HH:mm:ss")
    private Date createdAt;
    @DateTimeFormat(pattern="MM:dd:yyyy HH:mm:ss")
    private Date updatedAt;
    
    @PrePersist
    public void onCreate(){this.createdAt = new Date();}
    @PreUpdate
    public void onUpdate(){this.updatedAt = new Date();}
    
    @OneToMany(mappedBy="subs", fetch = FetchType.LAZY)
    private List<User> user;
    
    public int getNumUsers() {
		return this.user.size();
    }

    public subs() {
	
    }
    
    public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getCost() {
		return cost;
	}
	public void setCost(long cost) {
		this.cost = cost;
	}
	public boolean getStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}
	public Date getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}
	public Date getUpdatedAt() {
		return updatedAt;
	}
	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}
	
	
	
}
