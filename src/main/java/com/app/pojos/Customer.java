package com.app.pojos;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;

@Entity
@Table(name = "customers")
public class Customer {

	@Id
	@Column(name = "cust_id")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer custId;
	
	@Column(name ="cust_name", length = 20)
	private String custName;
	
	@Column(length = 20, nullable = false, unique = true)
	private String email;
	
	@Column(length = 20, nullable = false)
	private String password;
	
	@Column(length = 20)
	private String phoneNo;

	//associtivity : one to many : 1Cust----> *Cards
	//collection of comoposites (embeddables) types
	@ElementCollection
	@CollectionTable(name = "cards", joinColumns = @JoinColumn(name = "cust_id"))
	private List<Card> cards = new ArrayList<>();
	
	
	public Customer() {
		System.out.println("in the const of Customer()");
	}

	public Customer(Integer custId, String custName, String email, String password, String phoneNo) {
		super();
		this.custId = custId;
		this.custName = custName;
		this.email = email;
		this.password = password;
		this.phoneNo = phoneNo;
	}

	
	
	//add assoc. setter
	public List<Card> getCards() {
		return cards;
	}

	public void setCards(List<Card> cards) {
		this.cards = cards;
	}
	
	//setters and getters
	public Integer getCustId() {
		return custId;
	}

	public void setCustId(Integer custId) {
		this.custId = custId;
	}

	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	@Override
	public String toString() {
		return "Customer [custId=" + custId + ", custName=" + custName + ", email=" + email + ", password=" + password
				+ ", phoneNo=" + phoneNo + "]";
	}

	
}
