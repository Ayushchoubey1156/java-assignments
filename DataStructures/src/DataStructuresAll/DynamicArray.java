package DataStructuresAll;

import java.util.Iterator;

@SuppressWarnings("unchecked")
public class DynamicArray <T> implements Iterable <T> {
	
	private T[] arr;
	private int length;
	private int capacity;
	public DynamicArray() {
		// TODO Auto-generated constructor stub
		this(8);
	}

	public DynamicArray(int i) {
		// TODO Auto-generated constructor stub
		if(i < 0) throw new IllegalArgumentException("Array Length should be more than 0");
		this.capacity = i;
		this.length = 0;
		this.arr = (T[]) new Object[i];
	}
	
	public boolean isEmpty() {
		return this.length() == 0;
		
	}
	
	public int length() {
		return this.length;
	}
	
	//get, set, indexOf, contains, add, remove, removeAt, clear
	
	public T get(int index) {
		if(this.isEmpty() || index >= length) throw new IndexOutOfBoundsException("Array Empty or Array Index Out Of Bounds");
		return this.arr[index];
	
	}
	
	public void set(int index, T value) {
		if(this.isEmpty() && index>0) throw new IndexOutOfBoundsException("Array Empty. Add at Index 0 or use the add() function");
		if(index >= this.length()) throw new IndexOutOfBoundsException("Index needs to be filled before setting. Add an element there.");
		
		this.arr[index] = value;
		
	}
	
	public int indexOf(T value) {
		if(this.isEmpty()) throw new IndexOutOfBoundsException("Array Empty");
		for (int i=0; i<this.length() ; i++) {
			if(this.arr[i]==value) return i;
		}
		return -1;
	}
	
	public boolean contains(T value) {
		if(this.isEmpty()) throw new IndexOutOfBoundsException("Array Empty or Array Index Out Of Bounds");
		return this.indexOf(value)!=-1;
		
	}
	
	public void add(T value) {
		if(this.length >= this.capacity) {
			if(this.capacity==0) this.capacity+=1;
			else this.capacity*=2;
			T new_arr[] = (T[]) new Object[this.capacity];
			for(int i=0; i<this.length(); i++) {
				new_arr[i] = this.arr[i];
			}
			this.arr = new_arr;
		}
		this.arr[this.length++] = value;
		
	}
	public T remove() {
		if(this.isEmpty()) throw new IndexOutOfBoundsException("Array Empty or Array Index Out Of Bounds");
		T res = this.arr[this.length - 1];
		this.arr[--this.length] = null;
		return res;
	}
	
	public T removeAt(int index) {
		if(this.isEmpty() || index >= length) throw new IndexOutOfBoundsException("Array Empty or Array Index Out Of Bounds");
		T res = this.arr[index];
		for(int i = index; i<this.length-1; i++) {
			this.arr[i]=this.arr[i+1];
		}
		this.arr[--this.length] = null;
		
		return res;
	}
	
	public void removeObject(T value) {
		int index = this.indexOf(value);
		this.removeAt(index);
		
	}
	
	public void clear() {
		if(this.isEmpty()) throw new IndexOutOfBoundsException("Array Empty or Array Index Out Of Bounds");
		for (int i=0; i<this.capacity ; i++) {
			this.arr[i]=null;
		}
	}
	
	public void printArr() {
		if(this.isEmpty()) throw new IndexOutOfBoundsException("Array Empty or Array Index Out Of Bounds");
		for(int i=0; i<this.length; i++) {
			System.out.println(""+this.arr[i]);
		}
	}

	@Override
	public Iterator<T> iterator() {
		// TODO Auto-generated method stub
		return new Iterator<T>() {
		int index =0;
		public boolean hasNext() {return index < length;}
		public T next() {return arr[index++];}
		};
	}

}
