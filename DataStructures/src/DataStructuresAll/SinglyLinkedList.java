package DataStructuresAll;

import java.util.Iterator;
@SuppressWarnings("unchecked")
public class SinglyLinkedList <T> implements Iterable<T>{

//	@SuppressWarnings("hiding")
	public class Node<T>{
		T data;
		Node<T> next;
		public Node(T da, Node next){
			this.data = da;
			this.next = next;
		}
		
		public T getdata() {return this.data;}
		
 	}
	
	private Node<T> head;
	private Node<T> tail;
	private int length;
	
	public SinglyLinkedList() {
		this.head = this.tail = null;
		this.length = 0;
	}
	//isempty, length
	public boolean isEmpty() {
		return this.head == null;
	}
	public int length() {return this.length;
	}
	
	//add, addHead, add at index
	
	public void add(T element) {
		if(this.isEmpty()) {
			this.head = this.tail = new Node<T>(element, null);
		}
		else {
		this.tail.next = new Node<>(element, null);
		this.tail = this.tail.next;
		
		}
		this.length++;
	}
	
	public void addHead(T element) {
		if(this.isEmpty()) {
			this.head = this.tail = new Node<T>(element, null);
		}
		Node<T> new_node = new Node<T>(element, this.head);
		this.head = new_node;
		this.length++;
	}
	
	
	public void addAtIndex(int index, T element) {
		if(this.isEmpty() || this.length < index) throw new IllegalArgumentException("The List is empty, or you have exceeded the bounds of the list");
		if(index == 0) {this.addHead(element);}
		if(index == this.length) {this.add(element);}
		else{Node<T> first = this.head;
		Node<T> second = this.head.next;
		int m=1;
		for(int i=0; i<this.length(); i++) {
			if(m++ == index) {
				break;
			}
			first = first.next;
			second = second.next;
		}
		
		first.next = new Node<T>(element, second);
		this.length++;
		}
		
	}
	
	//contains, index of
	
	public int indexOf(T element) {
		if(this.isEmpty()) throw new IllegalArgumentException("The List is empty, or you have exceeded the bounds of the list");
		
		int index =0;
		Node<T> trav =this.head;
		while (trav.next != null && trav.getdata()!=element)
		{trav =trav.next; index++;}
		if(trav.getdata() == element) return index;
		else return -1;
	}
	
	public boolean contains(T element) {
		return this.indexOf(element) != -1;
	}
	// removetail, remove object, removehead, remove at index
	
	public T removeTail() {
		if(this.isEmpty()) throw new IndexOutOfBoundsException();
		this.length--;
		if(this.head == this.tail) {
			Node<T> new_node = this.tail; this.head = this.tail =null;
			return new_node.getdata();
		}
		else {
			Node<T> trav_first = this.head;
			Node<T> trav_second = trav_first.next;
			while(trav_second != this.tail) {
				trav_first = trav_second;
				trav_second = trav_second.next;
			}
			trav_first.next = null;
			this.tail = trav_first;
			return trav_second.getdata();
		}
		
	}
	
	public T removeHead() {
		if(this.isEmpty()) throw new IndexOutOfBoundsException();
		this.length--;
		if(this.head == this.tail) {
			Node<T> new_node = this.tail; this.head = this.tail =null;
			return new_node.getdata();
		}
		else {
			Node<T> trav = this.head;
			this.head = this.head.next;
			return trav.getdata();
		}
	}

	public T removeAt(int index) {
		if(this.isEmpty() || this.length < index) throw new IllegalArgumentException("The List is empty, or you have exceeded the bounds of the list");
		if(index == 0) {return this.removeHead();}
		if(index == this.length) {return this.removeTail();}
		else
		{
			Node<T> first = this.head;
			Node<T> second = this.head.next;
			int m=1;
			for(int i=0; i<this.length(); i++) {
				if(m++ == index) {
					break;
			}
			first = first.next;
			second = second.next;
			}
		
			first.next = first.next.next;
			this.length--;
			second.next = null;
			return second.getdata();
		}
	}
	
	public T remove(T element) {
		return this.removeAt(this.indexOf(element));
	}
	
	public void print() {
		if(this.isEmpty()) throw new IllegalArgumentException("The List is empty, or you have exceeded the bounds of the list");
		Node<T> trav = this.head;
		while(trav.next != null) {
			System.out.println(trav.getdata());
			trav = trav.next;
		}
		System.out.println(trav.getdata());
	}
	
	@Override
	public Iterator<T> iterator() {
		// TODO Auto-generated method stub
		return new Iterator<T>() {
			Node<T> index = head;
			@Override
			public boolean hasNext() {
				// TODO Auto-generated method stub
				return index.next != null;
			}

			@Override
			public T next() {
				// TODO Auto-generated method stub
				return index.next.getdata();
			}
		};
	}

}
