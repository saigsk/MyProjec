package com.model;


import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Recipe {

	@Id @GeneratedValue
	private int recipeId;
	private String recipeName;
	private String instructions;
	private double price;

	@OneToMany(mappedBy="recipe")
	private List<Ingredient> ingredientsList = new ArrayList<>();

	@OneToMany(mappedBy="recipe")
	List<OrderDetails> orderDetailsList = new ArrayList<OrderDetails>();
	
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
	
	

	public List<OrderDetails> getOrderDetailsList() {
		return orderDetailsList;
	}

	public void setOrderDetailsList(List<OrderDetails> orderDetailsList) {
		this.orderDetailsList = orderDetailsList;
	}

	@Override
	public String toString() {
		return "Recipe [recipeId=" + recipeId + ", recipeName=" + recipeName + ", instructions=" + instructions
				+ ", price=" + price + ", ingredientsList=" + ingredientsList + "]";
	}

	





}



