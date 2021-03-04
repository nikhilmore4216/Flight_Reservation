package com.app.dao;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.app.pojos.Flight;

@Repository
public class FlightDaoImpl implements IFlightDao {
	
	//dependancy
	@Autowired
	private EntityManager mgr;

	@Override
	public List<Flight> searchFlight(String depCity, String arrivalCity, LocalDate depDate) {
		
		String jpql = "select f from Flight f where f.depCity = :depCity and f.arrivalCity = :arrivalCity and f.depDate = :depDate";
		
		List<Flight> flights = mgr.createQuery(jpql, Flight.class)
											.setParameter("depCity", depCity)
											.setParameter("arrivalCity", arrivalCity)
											.setParameter("depDate", depDate)
											.getResultList();
		
		return flights;
	}

}
