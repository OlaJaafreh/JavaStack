package com.example.DojoNinjas.models;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.PrePersist;
import jakarta.persistence.PreUpdate;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
@Table(name="ninjas")
public class Ninja {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String ninjaFirstName;
    private String ninjaLastName;
    private int ninjaAge;
    @Column(updatable=false)
    private Date createdAt;
    private Date updatedAt;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="dojo_id")
    private Dojo dojo;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNinjaFirstName() {
		return ninjaFirstName;
	}

	public void setNinjaFirstName(String ninjaFirstName) {
		this.ninjaFirstName = ninjaFirstName;
	}

	public String getNinjaLastName() {
		return ninjaLastName;
	}

	public void setNinjaLastName(String ninjaLastName) {
		this.ninjaLastName = ninjaLastName;
	}

	public int getNinjaAge() {
		return ninjaAge;
	}

	public void setNinjaAge(int ninjaAge) {
		this.ninjaAge = ninjaAge;
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

	public Dojo getDojo() {
		return dojo;
	}

	public void setDojo(Dojo dojo) {
		this.dojo = dojo;
	}

	public Ninja(Long id, String firstName, String lastName, int age, Dojo dojo) {
		super();
		this.id = id;
		this.ninjaFirstName = firstName;
		this.ninjaLastName = lastName;
		this.ninjaAge = age;
		this.dojo = dojo;
	}
	
	public Ninja() {
		
	}
    
    

}
