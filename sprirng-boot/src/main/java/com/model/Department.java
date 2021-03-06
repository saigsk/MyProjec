package com.model;



import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Department {

	@Id@GeneratedValue
	private int deptId;
	private String deptName;
	private String location;
	
	/*
	 * @OneToMany(mappedBy = "department") List<Employeee> employee=new
	 * ArrayList<Employeee>();
	 */
	
	
	public int getDeptId() {
		return deptId;
	}
	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}
	
	public String getDeptName() {
		return deptName;
	}
	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}
	
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	

}

