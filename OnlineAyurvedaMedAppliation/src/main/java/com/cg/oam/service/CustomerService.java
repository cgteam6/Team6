package com.cg.oam.service;

import com.cg.oam.entities.Customer;

public interface CustomerService {

	Customer addCustomer(Customer var1);

	Customer updateCustomer(Customer var1) throws CustomerNotFoundException;

	Customer viewCustomer(Customer var1) throws CustomerNotFoundException;

	Customer deleteCustomer(int var1) throws CustomerNotFoundException;

	List<Customer> showAllCustomers();
}
