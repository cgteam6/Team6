package com.cg.oam.repository;

public interface CustomerRepository {
	Customer addCustomer(Customer var1);

	Customer updateCustomer(Customer var1) throws CustomerNotFoundException;

	Customer viewCustomer(Customer var1) throws CustomerNotFoundException;

	Customer deleteCustomer(int var1) throws CustomerNotFoundException;

	List<Customer> showAllCustomers();

}
