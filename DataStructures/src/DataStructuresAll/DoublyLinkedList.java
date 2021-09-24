package DataStructuresAll;

import java.util.Iterator;

import javax.management.RuntimeErrorException;
public class DoublyLinkedList<T> implements Iterable <T> {

	private Node <T> head =null;
	private Node <T> tail = null;
	private int length = 0;
	
	@SuppressWarnings("hiding")
	public class Node<T>{
		T data;
		Node <T> next;
		Node <T> prev;
		public Node(T data, Node<T> prev, Node<T> next) {
			this.next = next;
			this.prev=prev;
			this.data = data;
		}
		
		public T getData() {return this.data;}
		
	}
	
	public boolean isEmpty() {return this.length()==0;}
	public int length() {return this.length;}
	
	public void clear() {
		if (this.isEmpty()) throw new IndexOutOfBoundsException("List Is Empty");
		this.head = null;
		this.head.prev=null;
		this.head.next=null;
		this.tail = head;
		this.length = 0;
	}
	//add tail, add head, add at index
	public void add(T element) {
		if(this.isEmpty()) {
			this.head = this.tail = new Node<T>(element, null, null);
		}
		else {
			Node <T> new_Node = new Node<T> (element, null, null);
			this.tail.next = new_Node;
			new_Node.prev = this.tail;
			this.tail = new_Node;
		}
		++this.length;
	}
	
	public void addHead(T element) {
		if(this.isEmpty()) {
			this.head = this.tail = new Node<T>(element, null, null);
		}
		else {
			this.head.prev = new Node<T>(element, null, head);
			this.head = this.head.prev;
		}
		++this.length;
	}
	
	public void addAt(int i, T element) {
		if(this.length() < i) throw new IndexOutOfBoundsException("Index out of bounds");
		if(this.length == i) {this.add(element);}
		if(i==0) {this.addHead(element);}
		else {
		Node <T> trav = this.head;
		for(int m=0 ; m < i-1 ; m++) {
			trav = trav.next;
		}
		Node<T> new_Node = new Node <T> (element, trav, trav.next);
		trav.next.prev = new_Node;
		trav.next = new_Node;
		}
		this.length++;
	}
	
	
	//indexof, contains
	
	public int indexOf (T element) {
		if (this.isEmpty()) throw new IndexOutOfBoundsException("List Is Empty");
		Node <T> trav = this.head;
		int index = 0;
		
		while(trav.next!=null) {
			if(trav.getData().equals(element)) break;
			trav=trav.next;
			index++;
		}
		if(trav.getData().equals(element)) { return index;}
		else {return -1;}
		
	}
	
	public boolean contains(T element) {
		return (this.indexOf(element) != -1);
	}
	
	//removetail, removehead, remove at index, remove element


	public T removeTail() {
		if(this.isEmpty()) throw new IndexOutOfBoundsException("Empty List");
		T data = this.tail.getData();
		if(this.length() == 1) this.clear();
		else {
		this.tail = this.tail.prev;
		this.tail.next = null;
		}	
		this.length--;
		return data;
	}
	
	public T removeHead() {
		if(this.isEmpty()) throw new IndexOutOfBoundsException("Empty List");
		T data = this.head.getData();
		if(this.length() == 1) this.clear();
		else {
		this.head = this.head.next;
		this.head.prev = null;
		}
		this.length--;
		return data;
	}
	
	public T removeAt(int index) {
		if(this.length() <= index) throw new IndexOutOfBoundsException("Index out of bounds");
		
		if(this.length-1 == index) {return this.removeTail();}
		if(index==0) {return this.removeHead();}
		T data=null;
		Node <T> trav = this.head;
		for(int m=0 ; m < index ; m++) {
			trav = trav.next;
		}
		data = trav.getData();
		trav.next.prev = trav.prev;
		trav.prev.next = trav.next;
		this.length--;
		return data;
	}
	
	public void remove(T element) {
		if(this.isEmpty()) throw new IndexOutOfBoundsException("Empty List");
		if(this.contains(element)) {
			this.removeAt(this.indexOf(element));
		}
	}
	
	public void printList() {
		if(this.isEmpty()) throw new RuntimeErrorException(null, "List Empty");
		Node <T> trav = this.head;
		while(trav != this.tail) {
			System.out.println(trav.getData());
			trav = trav.next;
		}
		System.out.println(trav.getData());
	}
	
	
	
	@Override
	public Iterator<T> iterator() {
		// TODO Auto-generated method stub
		return new Iterator<T>() {
		DoublyLinkedList<T>.Node<T> index = head;
		@Override
		public boolean hasNext() {return index.next != null;}
		@Override
		public T next() {
			// TODO Auto-generated method stub
			return index.next.getData();
		}
		};
	}

}
