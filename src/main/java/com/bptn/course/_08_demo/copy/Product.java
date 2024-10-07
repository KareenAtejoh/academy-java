package com.bptn.course._08_demo.copy;

class Product {

	// this is the declaration
	private String productId;
	private String productName;
	private double productPrice;
	private int productQuantity;

	// this is the constructor
	public Product(String productId, String productNmae, double productPrice, int productQauntity) {
		this.productId = productId;
		this.productName = productName;
		this.productPrice = productPrice;
		this.productQuantity = productQuantity;
	}

	// Getters and Accessors
	public String getProductId() {
		return this.productId;
	}

	public String getProductName() {
		return this.productName;
	}

	public double getProductPrice() {
		return this.productPrice;
	}

	public int getProductQuantity() {
		return this.productQuantity;
	}

	public void reduceStock(int quantity) {
		if (quantity <= this.productQuantity) {
			this.productQuantity -= quantity;
		} else {
			throw new IllegalArgumentException("Insufficient Stock!");
		}
	}

}
