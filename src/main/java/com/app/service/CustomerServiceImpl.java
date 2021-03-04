package com.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.dao.ICustomerDao;
import com.app.pojos.Card;
import com.app.pojos.Customer;
import com.app.pojos.Passenger;

@Service
@Transactional
public class CustomerServiceImpl implements ICustomerService {

	//dependency
	@Autowired
	private ICustomerDao customerDao;
	
	@Override
	public Customer findCustomerByEmailAndPassword(String email, String password) {
		
		Customer customer = customerDao.findCustomerByEmailAndPassword(email, password);
		return customer;
	}

	@Override
	public boolean validateCard(Card card, Customer cust) {
		
		return customerDao.validateCard(card, cust);
	}

	@Override
	public String addPassengerBooking(Passenger p) {
		
		return customerDao.addPassengerBooking(p);
		
	}

}
