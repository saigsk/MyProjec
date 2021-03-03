package com.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class OrderDetails {

	@Id @GeneratedValue
	private int orderDetailsId;
	private double totalPrice;
	
	public OrderDetails() {
		super();
	   }

	@ManyToOne
	@JoinColumn(name="order_id")
	Orders order;
	
	@ManyToOne
	@JoinColumn(name="recipe_id")
	Recipe recipe;
	
	public OrderDetails(int orderDetailsId, double totalPrice) {
		super();
		this.orderDetailsId = orderDetailsId;
		this.totalPrice = totalPrice;
	}

	public int getOrderDetailsId() {
		return orderDetailsId;
	}

	public void setOrderDetailsId(int orderDetailsId) {
		this.orderDetailsId = orderDetailsId;
	}

	public double getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}
	
	

	public Orders getOrder() {
		return order;
	}

	public void setOrder(Orders order) {
		this.order = order;
	}
	
	

	public Recipe getRecipe() {
		return recipe;
	}

	public void setRecipe(Recipe recipe) {
		this.recipe = recipe;
	}

	@Override
	public String toString() {
		return "OrderDetails [orderDetailsId=" + orderDetailsId + ", totalPrice=" + totalPrice + "]";
	}
	
}
