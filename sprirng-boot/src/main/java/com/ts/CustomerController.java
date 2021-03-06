package com.ts;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dao.CustomerDao;
import com.model.Customer;
import com.model.Employee;

@RestController
public class CustomerController {
	
	@Autowired
	CustomerDao customerDao;
	
	@RequestMapping("/registercust")
	public void register(Customer customer) {
		Customer c1 = new Customer("sai","9063216349","9-60","Ganesh Nagar","miryalaguda","sai123","password");
		Customer c2 = new Customer("mahindar","906573473","1-4-3","ramanthapur","hyderabad","mahi123","password");
		
		customerDao.register(c1);
		customerDao.register(c2);
		
	}
	
	@RequestMapping("/showAllCustomers")
	public List<Customer> showAllCustomers(){
		List<Customer> custList = customerDao.getAllCustomers();
		return custList;
		
	}

}
