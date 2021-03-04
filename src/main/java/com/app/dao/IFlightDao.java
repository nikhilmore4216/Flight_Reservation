package com.app.dao;

import java.time.LocalDate;
import java.util.List;

import com.app.pojos.Flight;

public interface IFlightDao {

	
	//depcity=pune&arrivacity=mumbai&depdate=2021-02-21
	List<Flight> searchFlight(String depCity, String arrivalCity, LocalDate depDate);
}
