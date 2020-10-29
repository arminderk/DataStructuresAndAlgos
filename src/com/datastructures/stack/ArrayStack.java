package com.datastructures.stack;

public class ArrayStack {
	private int size;
	private int[] stack;
	
	public ArrayStack(int capacity) {
		this.stack = new int[capacity];
		this.size = 0;
	}
	
	public int getSize() {
		return this.size;
	}
	
	public void push(int num) {
		stack[size++] = num;
	}
	
	public int peek() {
		return stack[size-1];
	}
	
	public void pop() {
		stack[size--] = 0;
	}
	
	public boolean isEmpty() {
		return size == 0;
	}
}
