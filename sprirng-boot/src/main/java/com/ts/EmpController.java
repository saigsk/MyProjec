package com.ts;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dao.EmployeeDao;
import com.model.Employee;

@RestController
public class EmpController {
	
	@Autowired
	EmployeeDao employeeDao;
	
	/*
	 * @Autowired DepartmentDao deptDao;
	 */
	
	@RequestMapping("/registerEmp1")
	public void register1(Employee employee) {
		Employee emp1 = new Employee(1,"Sai",  9999.99,"M",new Date("02/24/2020"),"9870987090","INDIA", "sai123",   "password");
		Employee emp2 = new Employee(2,"nabha",9898.99,"F",new Date("05/12/2020"),"9870987980","UK",    "nabha123", "password");
		Employee emp3 = new Employee(3,"Bunny",8989.89,"M",new Date("01/30/2021"),"9870888090","USA",   "bunny123", "password");
		
		employeeDao.register(emp1);
		employeeDao.register(emp2);
		employeeDao.register(emp3);
		System.out.println("Employee Records are inserted");
	}
	
	@PostMapping("/registerEmp")
	public void registerEmp(@RequestBody Employee employee) {
		System.out.println("Data Received from Angular for Register Employee");
		System.out.println(employee);
		
		employeeDao.register(employee);
		
	}
	
	@RequestMapping("/showAllEmployee")
	public List<Employee> showAllEMployee(){
		List<Employee> empList = employeeDao.getAllEmployees();
		return empList;
		
	}
	
	@RequestMapping("/getEmpById/{empId}")
	public Employee getEmpById(@PathVariable("empId") int empId) {
		Employee employee = employeeDao.getEmployeeById(empId);
		return employee;
	}
	
	@RequestMapping("/getEmployee/{loginId}/{password}")
	public Employee getEmp(@PathVariable("loginId") String loginId , @PathVariable("password") String password) {
		Employee employee = employeeDao.getEmployee(loginId,password);
		return employee;
	}

}
