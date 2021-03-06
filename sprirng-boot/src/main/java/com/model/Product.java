package com.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity // in productReppositary JPARepositary<T,ID> i.e T- template,Entity relation i.e table need Entity and Id 
public class Product {
	@Id @GeneratedValue // @id is primary key ,auto generate ,@UniqueConstraint is also used
	private int productId;
	
	private String productName;
	private float productPrice;
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public float getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(float productPrice) {
		this.productPrice = productPrice;
	}

	
}

