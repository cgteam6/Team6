package com.cg.oam.entities;

public class CartItem {
	String itemId;
	Cart cart;
	Medicine medicine;
	int quantity;

	public CartItem() {
	}

	public CartItem(String itemId, Cart cart, Medicine medicine, int quantity) {
		this.itemId = itemId;
		this.cart = cart;
		this.medicine = medicine;
		this.quantity = quantity;
	}

	public String getItemId() {
		return this.itemId;
	}

	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

	public Cart getCart() {
		return this.cart;
	}

	public void setCart(Cart cart) {
		this.cart = cart;
	}

	public Medicine getMedicine() {
		return this.medicine;
	}

	public void setMedicine(Medicine medicine) {
		this.medicine = medicine;
	}

	public int getQuantity() {
		return this.quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
}