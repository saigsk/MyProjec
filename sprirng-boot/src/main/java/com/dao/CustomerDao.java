package com.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.model.Customer;

@Service
public class CustomerDao {
	
	@Autowired
	CustomerRepository customerRepository;

	public void register(Customer customer) {
		
		customerRepository.save(customer);
		
	}

	public List<Customer> getAllCustomers() {
		
		return customerRepository.findAll();
	}

}
