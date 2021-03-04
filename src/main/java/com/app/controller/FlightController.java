package com.app.controller;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.app.pojos.Flight;
import com.app.service.IFlightService;

@Controller
@RequestMapping("/flight")
public class FlightController {

	//dependency
	@Autowired
	private IFlightService flightService;
	
	public FlightController() {
		System.out.println("in the constr of FlightController()");
	}
	
	
	//method to show form of searching of flight	:GET
	@GetMapping("/search")
	public String showFlightSearchForm() {
		return "/flight/search";
	}
	
	//method to diplay flight details
	@GetMapping("/display")
	public String displayFlightDetail(@RequestParam String depCity, @RequestParam String arrivalCity, @RequestParam @DateTimeFormat(pattern = "yyyy-MM-dd")LocalDate depDate, Model modelMap) {
		
		System.out.println("in the displayFlightDetail ");
		List<Flight> flights = flightService.searchFlight(depCity, arrivalCity, depDate);
		
		if(flights.isEmpty()) {
			modelMap.addAttribute("flight_details", "Sorry..! No flight Available in this Route.");
			return "/flight/search";
		}
		
		//System.out.println(flights);
		modelMap.addAttribute("flight_details", flights);
		
		return "/flight/display";
	}
	
}
