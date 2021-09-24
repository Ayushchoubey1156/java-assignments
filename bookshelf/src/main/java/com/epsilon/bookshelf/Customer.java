package com.epsilon.bookshelf;

public class Customer {
int customer_id;
String name;
public int getCustomer_id() {
	return customer_id;
}
public void setCustomer_id(int customer_id) {
	this.customer_id = customer_id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public Customer(int customer_id, String name) {
	super();
	this.customer_id = customer_id;
	this.name = name;
}
@Override
public String toString() {
	return "Customer [customer_id=" + customer_id + ", name=" + name + ", getCustomer_id()=" + getCustomer_id()
			+ ", getName()=" + getName() + "]";
}


}
