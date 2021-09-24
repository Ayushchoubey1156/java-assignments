package com.epsilon.bookshelf;

public class Publisher {
	String name;
	String location;
	int publisher_id;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public int getPublisher_id() {
		return publisher_id;
	}
	public void setPublisher_id(int publisher_id) {
		this.publisher_id = publisher_id;
	}
	public Publisher(String name, String location, int publisher_id) {
		super();
		this.name = name;
		this.location = location;
		this.publisher_id = publisher_id;
	}
	@Override
	public String toString() {
		return "Publisher [name=" + name + ", location=" + location + ", publisher_id=" + publisher_id + ", getName()="
				+ getName() + ", getLocation()=" + getLocation() + ", getPublisher_id()=" + getPublisher_id() + "]";
	}
	
	
}
