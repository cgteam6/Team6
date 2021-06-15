package com.cg.oam.entities;

public class Admin {
	String id;
	String password;
	Customer customer;
	User user;
	Medicine medicine;
	Category category;

	public Admin() {
	}

	public Admin(String id, String password, Customer customer, User user, Medicine medicine, Category category) {
		this.id = id;
		this.password = password;
		this.customer = customer;
		this.user = user;
		this.medicine = medicine;
		this.category = category;
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Customer getCustomer() {
		return this.customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public User getUser() {
		return this.user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Medicine getMedicine() {
		return this.medicine;
	}

	public void setMedicine(Medicine medicine) {
		this.medicine = medicine;
	}

	public Category getCategory() {
		return this.category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}
}
