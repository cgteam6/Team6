package com.cg.oam.entities;

import java.util.List;

public class Customer {
	int customerId;
	String customerName;
	String customerPassword;
	List<Medicine> medicineList;
	Order order;

	public Customer() {
	}

	public Customer(int customerId, String customerName, String customerPassword, List<Medicine> medicineList,
			Order order) {
		this.customerId = customerId;
		this.customerName = customerName;
		this.customerPassword = customerPassword;
		this.medicineList = medicineList;
		this.order = order;
	}

	public int getCustomerId() {
		return this.customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return this.customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerPassword() {
		return this.customerPassword;
	}

	public void setCustomerPassword(String customerPassword) {
		this.customerPassword = customerPassword;
	}

	public List<Medicine> getMedicineList() {
		return this.medicineList;
	}

	public void setMedicineList(List<Medicine> medicineList) {
		this.medicineList = medicineList;
	}

	public Order getOrder() {
		return this.order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}
}