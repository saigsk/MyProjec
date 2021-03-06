package com.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.model.Employee;

@Service
public class EmployeeDao {
	@Autowired
	EmployeeRepository employeeRepository;

	public List<Employee> getAllEmployees() {
		// TODO Auto-generated method stub
		return employeeRepository.findAll();
	}

	public void register(Employee employee) {
		System.out.println("employee data receieved from employee controller");
		 employeeRepository.save(employee);
	}

	public Employee getEmployeeById(int empId) {
		// TODO Auto-generated method stub
		Employee emp= employeeRepository.findById(empId).orElse(new Employee());
		return emp;
	}

	public void deleteEmp(Employee employee) {
		// TODO Auto-generated method stub
		employeeRepository.delete(employee);
		
	}

	public void updateEmp(Employee employee) {
		// TODO Auto-generated method stub
	employeeRepository.save(employee);
		
	}

	public Employee getEmployee(String loginId, String password) {
		// TODO Auto-generated method stub
		
		Employee emp= employeeRepository.findByLoginIdAndPassword(loginId,password);
		return emp;
	}

	
	
	

}
