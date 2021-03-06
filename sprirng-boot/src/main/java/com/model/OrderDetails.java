package com.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class OrderDetails {

	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int orderDetailsId;
	private double totalPrice;
	
	public OrderDetails() {
		super();
	   }

	
	//OrderDetails to order
	@ManyToOne
	@JoinColumn(name="order_id")
	Orders order;
	

	//orderDetails to recipe
   @OneToMany(mappedBy="orderDetails") List<Recipe> recipe = new
	  ArrayList<Recipe>();
	 

   //orderDetails to ingredient
	@OneToMany(mappedBy="orderDetails")
	List<Ingredient> ingredientList = new ArrayList<Ingredient>();
	
	
	/*
	 * @ManyToOne
	 * 
	 * @JoinColumn(name="recipe_id") Recipe recipe;
	 */
	
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
	
	
	
	

	/*
	 * public Recipe getRecipe() { return recipe; }
	 * 
	 * public void setRecipe(Recipe recipe) { this.recipe = recipe; }
	 */

	/*
	 * public List<Recipe> getRecipe() { return recipe; }
	 * 
	 * public void setRecipe(List<Recipe> recipe) { this.recipe = recipe; }
	 */

	public List<Recipe> getRecipe() {
		return recipe;
	}

	public void setRecipe(List<Recipe> recipe) {
		this.recipe = recipe;
	}

	public List<Ingredient> getIngredientList() {
		return ingredientList;
	}

	public void setIngredientList(List<Ingredient> ingredientList) {
		this.ingredientList = ingredientList;
	}

	@Override
	public String toString() {
		return "OrderDetails [orderDetailsId=" + orderDetailsId + ", totalPrice=" + totalPrice + "]";
	}
	
}
