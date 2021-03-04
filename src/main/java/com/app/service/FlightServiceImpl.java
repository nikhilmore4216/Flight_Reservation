package com.app.service;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.dao.IFlightDao;
import com.app.pojos.Flight;

@Service
@Transactional
public class FlightServiceImpl implements IFlightService {

	//dependancy
	@Autowired
	private IFlightDao flightdao;
	
	@Override
	public List<Flight> searchFlight(String depCity, String arrivalCity, LocalDate depDate) {
		
		List<Flight> fights = flightdao.searchFlight(depCity, arrivalCity, depDate);
		
		return fights;
	}

}
