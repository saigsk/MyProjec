package com.ts;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dao.ProductDao;
import com.model.Product;

@RestController
public class ProductController {
	
	@Autowired //dependency injection
	ProductDao productDao;
	
	@RequestMapping("/register")
	public void register() {
		Product product1 = new Product();
		product1.setProductName("Mobile");
		product1.setProductPrice((float) 25000.00);
		
		Product product2 = new Product();
		product2.setProductName("Airpods");
		product2.setProductPrice((float) 1299.00);
		
		productDao.register(product1);
		productDao.register(product2);
	}
	
	@RequestMapping("/showAllProducts")
	public List <Product> showAllProducts(){
		List <Product> productList = productDao.getAllProducts();
		return productList;
	}
	
	@RequestMapping("/showProductById/{productId}")
	public Product showProductById(@PathVariable("productId") Integer productId){		
		Product product = productDao.getProductById(productId);
		return product;
	}
	
	@RequestMapping("/showProductByName/{productName}")
	public Product showProductByName(@PathVariable("productName") String productName){		
		Product product = productDao.getProductByName(productName);
		return product;
	}
	
	@RequestMapping("/showAllSortedProducts")
	public List<Product> showAllSortedProducts(){		
		List<Product> productList = productDao.getAllSortedProducts();
		return productList;
	}
}






