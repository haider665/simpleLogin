package com.example.demo.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.context.annotation.Scope;

@Entity
@Table(name="user_roles")
@Scope("prototype")
public class UserRole {
	
	@Id
	@Column(name="user_role_id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int id;
//	@Column(name="email", insertable=false, updatable=false)
//	String email;

	@Column(name="role")
	String role;
	
	@ManyToOne( fetch=FetchType.LAZY,  cascade= {CascadeType.DETACH,CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH}  )
	@JoinColumn(name="email")
	User user;
	
	public UserRole() {
		
	}
	
	public UserRole(String role) {
		this.role = role;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

//	public String getEmail() {
//		return email;
//	}
//
//	public void setEmail(String email) {
//		this.email = email;
//	}

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
	
	
	
}
