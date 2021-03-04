package com.app.pojos;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "passengers")
public class Passenger {
	
	@Id
	@Column(name = "pass_id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer passId;
	
	
	@Column(length = 30)
	private String email;
	
	@Column(length = 20)
	private String name;
	
	
	@Column(length = 20)
	private String phone;
	
	@ManyToOne
	@JoinColumn(name = "cust_id", nullable = false)
	private Customer customer;
	
	public Passenger() {
		super();
	}

	
	//SETTERS AND GETTERS
	public Integer getPassId() {
		return passId;
	}

	public void setPassId(Integer passId) {
		this.passId = passId;
	}

	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getPhone() {
		return phone;
	}


	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	

	public Customer getCustomer() {
		return customer;
	}


	public void setCustomer(Customer customer) {
		this.customer = customer;
	}


	@Override
	public String toString() {
		return "Passenger Id=" + passId + ", email=" + email + ", name=" + name + ", phone=" + phone;
	}

	

	
	


}
