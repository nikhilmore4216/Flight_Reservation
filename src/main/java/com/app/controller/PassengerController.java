package com.app.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.app.pojos.Passenger;

@Controller
@RequestMapping("/passenger")
public class PassengerController {

	
	public PassengerController() {
		System.out.println("in the  PassengerController() ");
	}
	
	
	//method for passenger details
	@GetMapping("/details")
	public String showPassengerDetailsForm(Passenger p) {
		
		return "/passenger/details";
	}
	
	//method for process passenger details & then show Card info form
	@PostMapping("/details")
	public String processPassengerDetails(Passenger p,HttpSession session) {
			//here write we are not adding passenger into DB passenger table 
			//we will add passenger after card details validated
		System.out.println("in the processPassengerDetails() "+ p);
		
		//add passenger in session scope 
		session.setAttribute("passenger_dtl", p);
		
		return "redirect:/customer/card_details";
	}
		

}
