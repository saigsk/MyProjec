package com.model;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Ingredient {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int ingredientId;
	@Column(columnDefinition = "TEXT")
	private String ingredientName;
	private String quantity;

	public Ingredient() {
		super();
	}

	public Ingredient( String ingredientName, String quantity) {
		super();
		//this.ingredientId = ingredientId;
		this.ingredientName = ingredientName;
		this.quantity = quantity;
	}
	
	
	@ManyToOne
	@JoinColumn(name="recipe_id")
	private Recipe recipe;
	
	@ManyToOne
	@JoinColumn(name="order_details_id")
	private OrderDetails orderDetails;

	 
	public Recipe getRecipe() {
		return recipe;
	}

	public void setRecipe(Recipe recipe) {
		this.recipe = recipe;
	}

	public int getIngredientId() {
		return ingredientId;
	}

	public void setIngredientId(int ingredientId) {
		this.ingredientId = ingredientId;
	}

	public String getIngredientName() {
		return ingredientName;
	}

	public void setIngredientName(String ingredientName) {
		this.ingredientName = ingredientName;
	}

	public String getQuantity() {
		return quantity;
	}

	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}
	
	

	public OrderDetails getOrderDetails() {
		return orderDetails;
	}

	public void setOrderDetails(OrderDetails orderDetails) {
		this.orderDetails = orderDetails;
	}

	@Override
	public String toString() {
		return "Ingredient [ingredientId=" + ingredientId + ", ingredientName=" + ingredientName + ", quantity="
				+ quantity + "]";
	}


//	@ManyToOne(mappedBy = "recipe")
	
//	@JoinColumn(name="recipe_id") Recipe recipe;
//	 public void setRecipe(Recipe recipe) {
//	  this.recipe=recipe; }
//	 public Recipe getRecipe() { return recipe; }
	  
	 

}

