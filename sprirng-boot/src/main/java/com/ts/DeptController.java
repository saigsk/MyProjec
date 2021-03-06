package com.ts;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dao.DepartmentDao;
import com.model.Department;


@RestController
public class DeptController {
	
	@Autowired
	DepartmentDao deptDao;
	
	@RequestMapping("/registerDept")
	public void register() {
		Department d1 = new Department();
		d1.setDeptName("Civil");
		d1.setLocation("Location1");
		
		Department d2 = new Department();
		d2.setDeptName("Computers");
		d2.setLocation("Location2");
		
		Department d3 = new Department();
		d3.setDeptName("Mech");
		d3.setLocation("Location3");
		
		deptDao.register(d1);
		deptDao.register(d2);
		deptDao.register(d3);
		
	}
	
	@RequestMapping("/showAllDepartments")
	public List<Department> showAllDepartments(){
		List<Department> deptList = deptDao.getAllDepartments();
		return deptList;
	}

}
