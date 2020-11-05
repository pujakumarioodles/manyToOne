package com.example.demo.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


@Entity
public class Role implements Serializable  {
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;
	
	private String role;
	
	
	public Role() {
		super();
		// TODO Auto-generated constructor stub
	}

	@ManyToOne
@JoinColumn(name="userIdInRole",referencedColumnName ="userId")
   private User user;
	

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Override
	public String toString() {
		return "Role [id=" + id + ", role=" + role + ", user=" + user + "]";
	}
	

}
