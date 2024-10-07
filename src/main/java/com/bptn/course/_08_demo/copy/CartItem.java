package com.bptn.course._08_demo.copy;

class CartItem {

	private Product product;
	private int cartQuantity;

	public CartItem(Product product, int quantity) {

		if (quantity > product.getProductQuantity()) {
			throw new IllegalArgumentException("Insufficient Stock!");
		}

		this.product = product;
		this.cartQuantity = quantity;
	}

	// getters and accessors
	public Product getProduct() {
		return this.product;
	}

	public int getCartQuantity() {
		return this.cartQuantity;
	}

	public double getTotalPrice() {
		return this.product.getProductPrice() * this.cartQuantity;
	}
}
