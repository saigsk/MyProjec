package com.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.model.Product;

@Service
public class ProductDao {
	
	@Autowired // DependencyInjection
	ProductRepository productRepository;
	
	
	public List<Product> getAllProducts(){
		
		
		return productRepository.findAll();
		
//		  List<Product> productList=productRepository.findAll();
//		   return productList;
		 

		
		
			
	}
	public void register(Product product) {
		// TODO Auto-generated method stub
		
		productRepository.save(product);
		
	}
	public List<Product> showAllProducts() {
		// TODO Auto-generated method stub
//		 List<Product> productList=productRepository.findAll();
//		 return productList;
		 return productRepository.findAll();
		   
		
	}
	public Product getProductById(Integer productId) {
		// TODO Auto-generated method stub
		
		return productRepository.findById(productId).orElse(new Product());
	}
	public Product getProductByName(String productName) {
		// TODO Auto-generated method stub
		Product product= productRepository.findByProductName(productName).orElse(new Product());
		return product;
	}
	public List<Product> getAllSortedProducts() {
		// TODO Auto-generated method stub
		return productRepository.findAllSorted();
	}
}
