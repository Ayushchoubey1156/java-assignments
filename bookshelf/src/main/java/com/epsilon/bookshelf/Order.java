package com.epsilon.bookshelf;

import java.util.List;

public class Order {
	
	int order_ID;
	Customer customer;
	List<Book> order_items;
	public int getOrder_ID() {
		return order_ID;
	}
	public void setOrder_ID(int order_ID) {
		this.order_ID = order_ID;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public List<Book> getOrder_items() {
		return order_items;
	}
	public void setOrder_items(List<Book> order_items) {
		this.order_items = order_items;
	}
	public Order(int order_ID, Customer customer, List<Book> order_items) {
		super();
		this.order_ID = order_ID;
		this.customer = customer;
		this.order_items = order_items;
	}
	@Override
	public String toString() {
		return "Order [order_ID=" + order_ID + ", customer=" + customer + ", order_items=" + order_items
				+ ", getOrder_ID()=" + getOrder_ID() + ", getCustomer()=" + getCustomer() + ", getOrder_items()="
				+ getOrder_items() + "]";
	}

	
	
	
	
}
