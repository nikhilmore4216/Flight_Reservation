package com.app.service;

import java.time.LocalDate;
import java.util.List;

import com.app.pojos.Flight;

public interface IFlightService {

	public List<Flight> searchFlight(String depCity, String arrivalCity, LocalDate depDate); 
}
