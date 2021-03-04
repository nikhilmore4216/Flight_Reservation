package com.app.dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.app.pojos.Card;
import com.app.pojos.Customer;
import com.app.pojos.Passenger;

@Repository
public class CustomerDaoImpl implements ICustomerDao {

	// dependency of dao
	@Autowired
	private EntityManager mgr;

	@Override
	public Customer findCustomerByEmailAndPassword(String email, String password) {

		String jpql = "select c from Customer c join fetch c.cards where c.email = :em and c.password = :pass";

		return mgr.createQuery(jpql, Customer.class).setParameter("em", email).setParameter("pass", password)
				.getSingleResult();
	}

	@Override
	public boolean validateCard(Card card, Customer cust) {

		List<Card> cards = cust.getCards();

		for (Card c : cards) {
			if (c.getCardNo().equals(card.getCardNo()) && c.getCardName().equals(card.getCardName())
					&& c.getCvv().equals(card.getCvv()) && c.getExpDate().equals(card.getExpDate())) {
				return true;
			}
		}
		return false;

	}

	@Override
	public String addPassengerBooking(Passenger p) {
		//p.setPassId(0);
		
		mgr.persist(p);
		
		return "Added Successfully";
	}

}
