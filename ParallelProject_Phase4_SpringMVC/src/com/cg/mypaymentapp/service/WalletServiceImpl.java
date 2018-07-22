
package com.cg.mypaymentapp.service;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.cg.mypaymentapp.beans.Customer;
import com.cg.mypaymentapp.beans.Wallet;
import com.cg.mypaymentapp.exception.InsufficientBalanceException;
import com.cg.mypaymentapp.exception.InvalidInputException;
import com.cg.mypaymentapp.repo.WalletRepo;

@Component(value= "walletService")
public class WalletServiceImpl implements WalletService {
	
	@Autowired
	private WalletRepo repo;



	public Customer showBalance(String mobileNo) {
		return repo.findOne(mobileNo);
	}

	@Override
	public Customer fundTransfer(String sourceMobileNo, String targetMobileNo, BigDecimal amount) {

		if (sourceMobileNo.equals(targetMobileNo))
			throw new InvalidInputException("Source and target mobile number cannot be same");

		if (sourceMobileNo == null || targetMobileNo == null || amount == null)
			throw new NullPointerException();

		Customer sourceCustomer = withdrawAmount(sourceMobileNo, amount);
		depositAmount(targetMobileNo, amount);
		System.out.println("Fund Transfer suuccessfully");

		return sourceCustomer;
	}

	@Override
	public Customer depositAmount(String mobileNo, BigDecimal amount) {
		// TODO Auto-generated method stub
		Customer customer = repo.findOne(mobileNo);

		if (customer == null)
			throw new InvalidInputException("Mobile number does not exist: " + mobileNo);

		Wallet wallet = customer.getWallet();
		BigDecimal oldamount = wallet.getBalance();
		wallet.setBalance(oldamount.add(amount));
		customer.setWallet(wallet);
		
		repo.save(customer);
//		
		return customer;
	}

	@Override
	public Customer withdrawAmount(String mobileNo, BigDecimal amount) {

		Customer customer = repo.findOne(mobileNo);
		if (customer == null)
			throw new InvalidInputException("Mobile number does not exist: " + mobileNo);

		Wallet wallet = customer.getWallet();
		BigDecimal oldamount = wallet.getBalance();
		int res = amount.compareTo(oldamount);
		if (res == 1) {
			throw new InsufficientBalanceException("Cannot withdraw Insufficient Balance");
		}

		wallet.setBalance(oldamount.subtract(amount));
		customer.setWallet(wallet);
		
		repo.save(customer);
		

		return customer;
	}

	@Override
	public Customer createAccount(Customer customer) {
		
		return repo.save(customer);
		
	}

	public boolean isValidMobile(String mobile) {
		String pattern = "[1-9][0-9]{9}";
		if (mobile.matches(pattern))
			return true;

		return false;
	}

	public boolean isValidName(String name) {
		String pattern = "[A-Z][a-z]*";
		if (name.matches(pattern))
			return true;

		return false;
	}
}
