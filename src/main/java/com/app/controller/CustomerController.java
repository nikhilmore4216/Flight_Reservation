package com.app.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.app.pojos.Card;
import com.app.pojos.CardType;
import com.app.pojos.Customer;
import com.app.pojos.Passenger;
import com.app.service.ICustomerService;

@Controller
@RequestMapping("/customer")
public class CustomerController {

	//dependency
	@Autowired
	private ICustomerService customerService;
	
	public CustomerController() {
		System.out.println("in the constr of CustomerController()");
	}
	
	//method to show login form : GET
	@GetMapping("/login")
	public String showLoginForm() {
		
		return "/customer/login";
	}
	
	//method to process the login form : post
	@PostMapping("/login")
	public String processLoginForm(@RequestParam String email, @RequestParam String password, HttpSession session, Model map) {
		
		try {	
		Customer cust = customerService.findCustomerByEmailAndPassword(email, password);
		 session.setAttribute("cust_details", cust);
		}catch(RuntimeException e){
			map.addAttribute("invalid_Msg", "Invalid Credientials... Try again.");
			return "/customer/login";
		}
		
		
		return "redirect:/flight/search";	//redirect:
	}

		
	//method to show card details form
	@GetMapping("/card_details")
	public String showCardForm(Card c, Model modelmap) {
		modelmap.addAttribute("card_types", CardType.values());
		return "/customer/card_details";
	}
	
	
	//method for validate card Details and then add passenger details in DB
	@PostMapping("/card_details")
	public String validateCardDetails(Card card, HttpSession session, RedirectAttributes flashMap, Model map) {
		Customer c1 = (Customer) session.getAttribute("cust_details");
		System.out.println(card+" "+c1.getCards());
		
		if(customerService.validateCard(card, c1)) {
			flashMap.addFlashAttribute("message", "Flight Booked Successfully");
			
			Passenger p = (Passenger) session.getAttribute("passenger_dtl");
			
			System.out.println(p);
			p.setCustomer(c1);
			customerService.addPassengerBooking(p);
			
			return "redirect:/customer/status";
		}
		map.addAttribute("message", "Invalid Card Details...");
		return "/customer/card_details";
		
	}
		
	
	//method to show status page
	@GetMapping("/status")
	public String showStatus() {
		
		return "/customer/status";
	}
	
	@GetMapping("/logout")
	public String userLogout(HttpSession session) {
	
		//invalidate session
		session.invalidate();
		
		return "/index";
	}
	
	
}
