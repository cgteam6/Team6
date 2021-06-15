package com.cg.oam.service;

public interface OrderService {
	Order addOrder(Order var1);

	Order viewOrder(Order var1);

	Order updateOrder(Order var1) throws OrderNotFoundException;

	Order cancelOrder(int var1) throws OrderNotFoundException;

	List<Order> showAllOrders(int var1);

	List<Order> showAllOrders(Customer var1);

	List<Order> showAllOrders(LocalDate var1);

}
