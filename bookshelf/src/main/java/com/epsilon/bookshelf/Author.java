package com.epsilon.bookshelf;

public class Author {
int author_id;
String name;
public int getAuthor_id() {
	return author_id;
}
public void setAuthor_id(int author_id) {
	this.author_id = author_id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public Author(int author_id, String name) {
	super();
	this.author_id = author_id;
	this.name = name;
}
@Override
public String toString() {
	return "Author [author_id=" + author_id + ", name=" + name + ", getAuthor_id()=" + getAuthor_id() + ", getName()="
			+ getName() + "]";
}


}
