package com.app.pojos;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

import org.springframework.format.annotation.DateTimeFormat;

@Embeddable
public class Card {

	@Column(length = 20, name = "card_no", nullable = false)
	private String cardNo;
	
	@Column(length = 20, name = "card_name")
	@Enumerated(EnumType.STRING)
	private CardType cardName;
	
	@Column(name = "exp_date" , nullable = false)
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private LocalDate expDate;
	
	@Column(length = 10, nullable = false)
	private String cvv;

	//default constructor
	public Card() {
		System.out.println("in the constr of Card()");
	}

	
	//constructor
	public Card(String cardNo, CardType cardName, LocalDate expDate, String cvv) {
		super();
		this.cardNo = cardNo;
		this.cardName = cardName;
		this.expDate = expDate;
		this.cvv = cvv;
	}



	//setters and getters
	public String getCardNo() {
		return cardNo;
	}

	public void setCardNo(String cardNo) {
		this.cardNo = cardNo;
	}

	public CardType getCardName() {
		return cardName;
	}

	public void setCardName(CardType cardName) {
		this.cardName = cardName;
	}

	public LocalDate getExpDate() {
		return expDate;
	}

	public void setExpDate(LocalDate expDate) {
		this.expDate = expDate;
	}

	public String getCvv() {
		return cvv;
	}

	public void setCvv(String cvv) {
		this.cvv = cvv;
	}

	@Override
	public String toString() {
		return "Card [cardNo=" + cardNo + ", cardName=" + cardName + ", expDate=" + expDate + ", cvv=" + cvv + "]";
	}
	
	
}
