package com.cg.mypaymentapp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cg.mypaymentapp.beans.Customer;

@Controller
public class URIController {

	@RequestMapping(value="/")
	public String getIndexPage(){
		return "indexPage";
		
	}
	
	@RequestMapping(value="/login")
	public String getloginPage(){
		return "loginPage";
		
	}
	
	@RequestMapping(value="/registration")
	public String getregistrationPage(){
		return "registration";
		
	}
	
	@ModelAttribute(value="customer")
	public Customer getCustomer()
	{
		return new Customer();
	}
	@ModelAttribute(value="/showBalance")
	public String getBalance()
	{
		return "showBalance";
	}
	
}
