package com.sarthak.form.entity;

import javax.persistence.*;

@Entity
public class Details {
	
	@Id
	@Column(name="user_Id")
	private long id;
	
	private String name;
	
	
	@OneToOne
	@JoinColumn(name="user_Id")
	private User user;


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


	public User getUser() {
		return user;
	}


	public void setUser(User user) {
		this.user = user;
	}


	public Details() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Details(long id, String name) {
		super();
		this.id = id;
		this.name = name;
		
	}
	
	

}
