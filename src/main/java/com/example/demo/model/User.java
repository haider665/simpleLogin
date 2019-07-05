package com.example.demo.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.transaction.Transactional;
import javax.validation.constraints.NotNull;

import org.springframework.context.annotation.Scope;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;



@Entity
@Table(name="users")
public class User {
	
	
	@Column(name="username")
	@NotNull(message="is required")
	private String name;
	@Column(name="address")
	@NotNull(message="is required")
	private String address;
	@Column(name="phone")
	@NotNull(message="is required")
	private String number;
	@Id
	@Column(name="email")
	@NotNull(message="is required")
	private String email;
	@Column(name="birthday")
	@NotNull(message="is required")
	private String birthday;
	@Column(name="password")
	@JsonIgnore
	@NotNull(message="is required")
	private String password;
	
	// mapping column
	@OneToMany (mappedBy="user" , cascade= {CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH})
	@JsonIgnore
	private List<UserRole> userRoles;
	
	@Transient
	@JsonIgnore
	private String confirmPassword;

	public User() {
		
	}

	public User(String name, String address, String number, String email, String birthday, String password) {
		this.name = name;
		this.address = address;
		this.number = number;
		this.email = email;
		this.birthday = birthday;
		this.password = password;
	}
	
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getConfirmPassword() {
		return confirmPassword;
	}

	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}

	public List<UserRole> getUserRoles() {
		return userRoles;
	}

	public void setUserRoles(List<UserRole> userRoles) {
		this.userRoles = userRoles;
	}
	public void add(UserRole userRole) {
		if(userRoles==null) {
			userRoles = new ArrayList();
		}
		userRoles.add(userRole);
		userRole.setUser(this);
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", address=" + address + ", number=" + number + ", email=" + email + ", birthday="
				+ birthday + ", password=" + password + "]";
	}
	
	
	
	
}
