package com.cg.mypaymentapp.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.cg.mypaymentapp.beans.Customer;
import com.cg.mypaymentapp.service.WalletService;

@Controller  // With the help of this the Spring will understand that it is Controller class
public class CustomerActionController 
{
	@Autowired
	WalletService walletService;
	
	@RequestMapping(value="/registerCustomer")
	public ModelAndView registerCustomer(@Valid@ModelAttribute("customer") Customer customer, BindingResult result)
	{
		try {
			
			if(result.hasErrors())
				return new ModelAndView("registrationPage");
			customer = walletService.createAccount(customer);
		}		
		catch (Exception e) {
			e.printStackTrace();
			
		}
		
		return new ModelAndView("registrationSuccessPage","customer",customer);
	}
	@RequestMapping(value="/viewBalance")
	public ModelAndView showBalance(@Valid@ModelAttribute("customer") Customer customer, BindingResult result)
	{
		try {
			
			if(result.hasFieldErrors("mobileNo"))
				return new ModelAndView("showBalance");
			
			customer = walletService.showBalance(customer.getMobileNo());
		}		
		catch (Exception e) {
			e.printStackTrace();
			return new ModelAndView("errorPage");
			
		}
		
		return new ModelAndView("walletBalance","customer",customer);
	}

}
