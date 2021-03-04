package com.app.dao;

import com.app.pojos.Card;
import com.app.pojos.Customer;
import com.app.pojos.Passenger;

public interface ICustomerDao {

	Customer findCustomerByEmailAndPassword(String email, String password);
	
	boolean validateCard(Card card, Customer cust);
	
	String addPassengerBooking(Passenger p);
}
