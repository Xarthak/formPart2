package com.sarthak.form.entity;

import javax.persistence.*;



@Entity
public class UserDetails {
	
	@Id
	//@Column(name="user_Id")
	private long id;
	

	
	private String firstName;
	
	
	private String lastName;
	
	
	private String middleName;
	
	
	private String address;
	
	
	private String country;
	
	
	private String state;
	
	
	private String zipcode;
	
	
	private String email;
	
	
	private String phoneNumber;
	
	
	private String height;
	
	
	private String weight;
	
	
//	@OneToOne
//	@JoinColumn(name="user_Id")
//	private User user;


	public long getId() {
		return id;
	}


	public void setId(long id) {
		this.id = id;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public String getMiddleName() {
		return middleName;
	}


	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public String getCountry() {
		return country;
	}


	public void setCountry(String country) {
		this.country = country;
	}


	public String getState() {
		return state;
	}


	public void setState(String state) {
		this.state = state;
	}


	public String getZipcode() {
		return zipcode;
	}


	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getPhoneNumber() {
		return phoneNumber;
	}


	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}


	public String getHeight() {
		return height;
	}


	public void setHeight(String height) {
		this.height = height;
	}


	public String getWeight() {
		return weight;
	}


	public void setWeight(String weight) {
		this.weight = weight;
	}


//	public User getUser() {
//		return user;
//	}
//
//
//	public void setUser(User user) {
//		this.user = user;
//	}


	public UserDetails(long id, String firstName, String lastName, String middleName, String address, String country,
			String state, String zipcode, String email, String phoneNumber, String height, String weight) {
		
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.middleName = middleName;
		this.address = address;
		this.country = country;
		this.state = state;
		this.zipcode = zipcode;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.height = height;
		this.weight = weight;
		
	}


	public UserDetails() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	
	

}
