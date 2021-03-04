package com.app.service;

import com.app.pojos.Card;
import com.app.pojos.Customer;
import com.app.pojos.Passenger;

public interface ICustomerService {

	Customer findCustomerByEmailAndPassword(String email, String password);	
	
	boolean validateCard(Card card, Customer cust);
	
	 String addPassengerBooking(Passenger p);
}	
