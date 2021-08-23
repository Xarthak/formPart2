package com.sarthak.form.entity;

import javax.persistence.*;

@Entity
@Table(name="users")
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	//@Column(unique = true)
	private String userName;
	
	private String email;
	
	private String password;
	
//	@OneToOne(mappedBy = "user")
//	@PrimaryKeyJoinColumn
//	private UserDetails userDetails;
	
	
	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public long getId() {
		return id;
	}

	public User(String userName, String password) {
		super();
		this.userName = userName;
		this.password = password;
	}

	
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "User [userName=" + userName + ", password=" + password + "]";
	}
	
	
	
	
	
}
