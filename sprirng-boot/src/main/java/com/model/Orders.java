package com.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Orders {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int orderId;
	private String orderStatus;
	private Date orderDate;
	
	@ManyToOne
	@JoinColumn(name="customer_Id")
	private Customer customer;
	
	@OneToMany(mappedBy="order",  cascade = CascadeType.ALL)
	List<OrderDetails> orderDetailsList = new ArrayList<OrderDetails>();
	
	public Orders() {
		super();
	}

	public Orders(int orderId, String orderStatus, Date orderDate) {
		super();
		this.orderId = orderId;
		this.orderStatus = orderStatus;
		this.orderDate = orderDate;
	}

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public String getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}

	public Date getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}

	
	
	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public List<OrderDetails> getOrderDetailsList() {
		return orderDetailsList;
	}

	public void setOrderDetailsList(List<OrderDetails> orderDetailsList) {
		this.orderDetailsList = orderDetailsList;
	}
	
	

	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", orderStatus=" + orderStatus + ", orderDate=" + orderDate + "]";
	}
	
	
	
	
}
