package com.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.model.Department;
@Service
public class DepartmentDao {
	@Autowired
	DepartmentRepository departmentRepository;

	public List<Department> getAllDepartments() {
		// TODO Auto-generated method stub
		return departmentRepository.findAll();
	}

	public void register(Department department) {
		
		departmentRepository.save(department);
		
	}

}
