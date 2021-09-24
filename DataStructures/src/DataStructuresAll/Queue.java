package DataStructuresAll;

import java.util.Iterator;
@SuppressWarnings("unchecked")
public class Queue<T> implements Iterable<T> {

	private T[] arr;
	private int max;
	private int f, l;
	
	public Queue(int n) {
		this.arr = (T[]) new Object[n];
		this.max = n;
		this.f =0;
		this.l=0;
	}
	
	// push, pop, print, isempty, length
	
	public boolean isEmpty() {
		return (this.l==0 || this.f>=this.l);
	}
	public int length() {return (this.l - this.f);}
	
	public void push (T element) {
		if(this.isEmpty()){
			this.f = 0;
			this.l=0;
		}
		if(this.l + 1 > this.max) throw new IndexOutOfBoundsException("Max Length");
		this.arr[this.l++] = element;
	}
	
	public T pop() {
		if(this.isEmpty()) throw new IndexOutOfBoundsException("Empty Queue");
		T res = this.arr[f];
		this.arr[f++] = null;
		return res;
	}
	
	public void print() {
		if(this.isEmpty()) throw new IndexOutOfBoundsException("Empty Queue");
		for(int i=this.f; i<this.l; i++) {
			System.out.println(this.arr[i]);
		}
	}
	@Override
	public Iterator<T> iterator() {
		// TODO Auto-generated method stub
		return null;
	}

}
