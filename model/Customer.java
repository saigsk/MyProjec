package com.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Customer {
	@Id
	@GeneratedValue
	private int customerId;
	private String customerName;
	private String mobile;
	private String houseNo;
	private String street;
	private String city;
	
	@Column(unique = true)
	private String loginId;
	private String password;
	
	public Customer() {
		super();
	}

	@OneToMany(mappedBy="customer")
	List<Orders> orderlist = new ArrayList<Orders>();
	
	public Customer(int customerId, String customerName, String mobile, String houseNo, String street, String city,
			String loginId, String password) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.mobile = mobile;
		this.houseNo = houseNo;
		this.street = street;
		this.city = city;
		this.loginId = loginId;
		this.password = password;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getHouseNo() {
		return houseNo;
	}

	public void setHouseNo(String houseNo) {
		this.houseNo = houseNo;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getLoginId() {
		return loginId;
	}

	public void setLoginId(String loginId) {
		this.loginId = loginId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	

	public List<Orders> getOrderlist() {
		return orderlist;
	}

	public void setOrderlist(List<Orders> orderlist) {
		this.orderlist = orderlist;
	}

	@Override
	public String toString() {
		return "Customer [customerId=" + customerId + ", customerName=" + customerName + ", mobile=" + mobile
				+ ", houseNo=" + houseNo + ", street=" + street + ", city=" + city + ", loginId=" + loginId
				+ ", password=" + password + "]";
	}
	

}
