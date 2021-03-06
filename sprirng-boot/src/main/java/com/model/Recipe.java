package com.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Recipe {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int recipeId;
	private String recipeName;
	@Column(columnDefinition = "TEXT")
	private String instructions;
	private double price;

	
	//recipe to ingredients
	@OneToMany(mappedBy = "recipe")
	private List<Ingredient> ingredientsList = new ArrayList<>();

	//recipe to orderdetails
	  @ManyToOne
	  @JoinColumn(name="order_details_id")
	  private OrderDetails orderDetails;
	 


	//Recipe to orderDetails
	/*
	 * @OneToMany(mappedBy="recipe") List<OrderDetails> orderDetailsList = new
	 * ArrayList<OrderDetails>();
	 */
 
	public Recipe() {
		super();
	}

	public Recipe(int recipeId, String recipeName, String instructions, double price,
			List<Ingredient> ingredientsList) {
		super();
		this.recipeId = recipeId;
		this.recipeName = recipeName;
		this.instructions = instructions;
		this.price = price;
		this.ingredientsList = ingredientsList;
	}

	public int getRecipeId() {
		return recipeId;
	}

	public void setRecipeId(int recipeId) {
		this.recipeId = recipeId;
	}

	public String getRecipeName() {
		return recipeName;
	}

	public void setRecipeName(String recipeName) {
		this.recipeName = recipeName;
	}

	public String getInstructions() {
		return instructions;
	}

	public void setInstructions(String instructions) {
		this.instructions = instructions;
	}

	public List<Ingredient> getIngredientsList() {
		return ingredientsList;
	}

	public void setIngredientsList(List<Ingredient> ingredientsList) {
		this.ingredientsList = ingredientsList;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	public OrderDetails getOrderDetails() {
		return orderDetails;
	}

	public void setOrderDetails(OrderDetails orderDetails) {
		this.orderDetails = orderDetails;
	}

	/*
	 * public OrderDetails getOrderDetails() { return orderDetails; }
	 * 
	 * public void setOrderDetails(OrderDetails orderDetails) { this.orderDetails =
	 * orderDetails; }
	 */

	
	

	/*
	 * public List<OrderDetails> getOrderDetailsList() { return orderDetailsList; }
	 * 
	 * public void setOrderDetailsList(List<OrderDetails> orderDetailsList) {
	 * this.orderDetailsList = orderDetailsList; }
	 */
	@Override
	public String toString() {
		return "Recipe [recipeId=" + recipeId + ", recipeName=" + recipeName + ", instructions=" + instructions
				+ ", price=" + price + ", ingredientsList=" + ingredientsList + "]";
	}

}
