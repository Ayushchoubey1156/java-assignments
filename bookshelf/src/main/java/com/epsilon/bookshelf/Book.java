package com.epsilon.bookshelf;

public class Book {
int book_id;
String name;
Publisher publisher;
Author author;
public Book(int book_id, String name, Publisher publisher, Author author) {
	super();
	this.book_id = book_id;
	this.name = name;
	this.publisher = publisher;
	this.author = author;
}
public int getBook_id() {
	return book_id;
}
public void setBook_id(int book_id) {
	this.book_id = book_id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public Publisher getPublisher() {
	return publisher;
}
public void setPublisher(Publisher publisher) {
	this.publisher = publisher;
}
public Author getAuthor() {
	return author;
}
public void setAuthor(Author author) {
	this.author = author;
}
@Override
public String toString() {
	return "Book [book_id=" + book_id + ", name=" + name + ", publisher=" + publisher + ", author=" + author
			+ ", getBook_id()=" + getBook_id() + ", getName()=" + getName() + ", getPublisher()=" + getPublisher()
			+ ", getAuthor()=" + getAuthor() + "]";
}


}
