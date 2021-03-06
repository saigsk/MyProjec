package com.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.model.Ingredient;

@Service
public class IngredientDao {

	@Autowired
	IngredientRepository ingredientRepository;
	
	public void register(Ingredient ingredient) {
	 
		ingredientRepository.save(ingredient);
		
	}

	public List<Ingredient> getAllIngredients() {
		
		return ingredientRepository.findAll();
	}

}
