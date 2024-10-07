package com.bptn.course._0_oop_demo;

class ShoppingCart {

	private CartItem[] items;
	private int itemCount;

	public ShoppingCart() {
		items = new CartItem[5];
		itemCount = 0;
	}

	// add product to cart, this is the logic
	public void addProductToCart(Product product, int quantity) {
		CartItem newItem = new CartItem(product, quantity);
		items[itemCount] = newItem;
		itemCount++;
		product.reduceStock(quantity);
	}

	// show products in cart
	public CartItem[] getItems() {
		cartItem[] currentItems = new CartItem[itemCount];

		// loop through the array to get the item data
		for (int i = 0; i < itemCount; i++) {
			currentItems[i] = items[i];
		}
		return currentItems;

	}
}
