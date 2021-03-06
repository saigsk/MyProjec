package com.ts;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dao.IngredientDao;
import com.model.Customer;
import com.model.Ingredient;

@RestController
public class IngredientController {

	@Autowired
	IngredientDao ingredientDao;
	
	@RequestMapping("/registerIngredient")
	public void register(Ingredient ingredient) {
		Ingredient i1 = new Ingredient("3 potatoes"
								+    	"2 tbsp red chilli "
								+      "	1/2 tsp Asafoetida"
								+	   "1 1/4 powder tsp Coriander"
								+	   "	1/2 tsp Mustard seeds","1");
		Ingredient i2 = new Ingredient("2 cups pasta,2 tablespoon olive oil ,½ teaspoon cumin seeds ,3 cloves garlic","1");
		Ingredient i3 = new Ingredient("1 kg Chicken on bone,1 1/2 tsp Coriander, powder,2 tbsp Kashmiri red chilli,3  cloves garlic,1/2 inch Ginger ","1");
		Ingredient i4 = new Ingredient("1 cup arhar dal "
									 + "1 medium tomato "
									 + "½ inch ginger"
									 + "3 cloves garlic","1");
		Ingredient i5 = new Ingredient("1 onion peeled and diced"
				+ "1 red bell pepper deseeded and finely chopped"
				+ "2 cloves garlic peeled and minced"
				+ "2/3 cup (115g) frozen peas ","1");
		Ingredient i6 = new Ingredient("500 grams Mutton , boneless and washed"
				+ "1 cup Chana dal (Bengal Gram Dal) , soaked fro 4 hours"
				+ "1/2 teaspoon Turmeric powder (Haldi)"
				+ "10 cloves Garlic"
				+ "1 inch Ginger , roughly chopped","1");
		Ingredient i7 = new Ingredient("150 grams Egg Noodles"
				+ "2 tablespoons Oil"
				+ "½ tablespoon Garlic ( finely chopped)"
				+ "2-3 Green Chillies ( finely chopped)"
				+ "¼ cup Onions (sliced)","1");
		Ingredient i8 = new Ingredient("Paneer – 200 gm"
				+ "All purpose flour – 1/4 cup maida"
				+ "Corn flour – 2 tbsp"
				+ "Plain yogurt – 1 tbsp curd"
				+ "Cooking soda – a generous pinch"
				+ "Ginger garlic paste – 1/2 tsp"
				+ "Red chilli powder – 1 tsp"
				+ "Garam masala powder – 1/2 tsp"
				+ "Black pepper powder – 1/2 tsp optional"
				+ "Lemon juice – 1 tsp"
				+ "Chaat masala – 1/2 tsp"
				+ "Salt – as needed"
				+ "Oil – to deep fry","1");
		
		
		ingredientDao.register(i1);
		ingredientDao.register(i2);
		ingredientDao.register(i3);
		ingredientDao.register(i4);
		ingredientDao.register(i5);
		ingredientDao.register(i6);
		ingredientDao.register(i7);
		ingredientDao.register(i8);
		
	}
	
	@RequestMapping("/showAllIngredients")
	public List<Ingredient> showAllIngredient(){
		List<Ingredient> ingredientList = ingredientDao.getAllIngredients();
		return ingredientList;
		
	}
}
