package com.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {
	
	public IndexController() {
		System.out.println("in the const of  IndexController()");
	}
	
	@RequestMapping("/")
	public String provideIndexPage() {
		return "/index";		//act view name : /WEB-INF/views/index.jsp
	}
	
}
