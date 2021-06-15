package com.cg.oam.entities;

import java.util.List;

public class Cart {
	String cartId;
	Customer customer;
	List<CartItem> items;

	public Cart() {
	}

	public Cart(String cartId, Customer customer, List<CartItem> items) {
		this.cartId = cartId;
		this.customer = customer;
		this.items = items;
	}

	public String getCartId() {
		return this.cartId;
	}

	public void setCartId(String cartId) {
		this.cartId = cartId;
	}

	public Customer getCustomer() {
		return this.customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public List<CartItem> getItems() {
		return this.items;
	}

	public void setItems(List<CartItem> items) {
		this.items = items;
	}
}