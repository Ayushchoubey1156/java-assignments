package DataStructuresAll;

import java.util.Iterator;

@SuppressWarnings("unchecked")
public class Stack<T> implements Iterable<T> {
	private T arr[];
	private int top;
	private int max;
	
	public Stack(int n) {
		this.arr = (T[]) new Object[n];
		this.top =-1;
		this.max = n;
	}
	
	//push, pop, isEmpty, length, print
	
	public boolean isEmpty() {
		return this.top == -1;
	}
	
	public int length() {return this.top + 1;}
	
	public void push(T element) throws Exception {
		if(this.isEmpty()) {this.top = 0;}
		if(this.top >= this.max) throw new Exception("Max length achieved");
		this.arr[this.top++] = element;
	}
	
	public T pop() throws Exception{
		if(this.isEmpty()) throw new Exception("The stack is empty");
		return this.arr[--top];
	}
	
	public void print() throws Exception{
		if (this.isEmpty()) throw new Exception ("The stack is Empty");
		for (int i=0; i<top; i++) { System.out.println(this.arr[i]);}
	}
	@Override
	public Iterator<T> iterator() {
		// TODO Auto-generated method stub
		return new Iterator<T>() {
			
			int index = 0;
			@Override
			public boolean hasNext() {
				// TODO Auto-generated method stub
			return (arr[index+1] != null || index>=max);
			}
			
			@Override
			public T next() {
				// TODO Auto-generated method stub
				return arr[index+1];
			}
		
		};
	}

}
