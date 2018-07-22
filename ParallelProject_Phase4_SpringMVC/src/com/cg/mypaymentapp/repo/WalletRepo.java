package com.cg.mypaymentapp.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cg.mypaymentapp.beans.Customer;

public interface WalletRepo extends JpaRepository<Customer, String>{

//	public boolean save(Customer customer);
//
//	public Customer findOne(String mobileNo);
//	
//	public boolean update(Customer customer);
//
//	public void startTransaction();
//
//	public void commitTransaction();


}
