package com.sonata.mvc.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Product {
	@Id
	private int prodId;
	private String prodName;
	private String prodCategory;
	private double prodPrice;
	private String prodColor;

	public int getProdId() {
		return prodId;
	}

	public void setProdId(int prodId) {
		this.prodId = prodId;
	}

	public String getProdName() {
		return prodName;
	}

	public void setProdName(String prodName) {
		this.prodName = prodName;
	}

	public String getProdCategory() {
		return prodCategory;
	}

	public void setProdCategory(String prodCategory) {
		this.prodCategory = prodCategory;
	}

	public double getProdPrice() {
		return prodPrice;
	}

	public void setProdPrice(double prodPrice) {
		this.prodPrice = prodPrice;
	}

	public String getProdColor() {
		return prodColor;
	}

	public void setProdColor(String prodColor) {
		this.prodColor = prodColor;
	}
	
	public Product(int prodId, String prodName, String prodCategory, double prodPrice, String prodColor) {
		this.prodId = prodId;
		this.prodName = prodName;
		this.prodCategory = prodCategory;
		this.prodPrice = prodPrice;
		this.prodColor = prodColor;
	}
	
	public Product() {
		//super();
		// TODO Auto-generated constructor stub
	}
	
}