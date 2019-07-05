package com.example.demo.model;

import javax.validation.constraints.NotNull;

public class Test {
	
	@NotNull(message="is required")
	String name;

	@NotNull(message="is required")
	String id;

	public Test(String name, String id) {
	
		this.name = name;
		this.id = id;
	}
	public Test() {
		
	}
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "Test [name=" + name + ", id=" + id + "]";
	}
	
	

}
