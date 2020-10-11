package com.datastructures.array;

public class Vector {
	private int size;
	private int[] vector;
	
	public Vector() {
		vector = new int[4];
		size = 0;
	}
	
	public void push(int num) {
		if(size == vector.length-1) {
			increaseSize();
		}
		
		vector[size++] = num;
	}
	
	public void insert(int index, int num) {
		if(size == vector.length-1) {
			increaseSize();
		}
		
		for(int i = vector.length-1; i >= index; i--) {
			vector[i] = vector[i-1];
		}
		
		vector[index] = num;
		size++;
	}
	
	
	public void pop() {
		vector[--size] = 0;
	}
	
	public void remove(int num) {
		for(int i = 0; i<vector.length; i++) {
			if(vector[i] == num) {
				vector[i] = 0;
			}
		}
	}
	
	public void print() {
		System.out.println("Vector size: " + size + ", Capacity: " + vector.length);
		
		for(int i = 0; i<vector.length; i++) {
			System.out.print(vector[i] + ", ");
		}
		
		System.out.println();
	}
	
	private void increaseSize() {
		int[] newVector = new int[vector.length * 2];
		for(int i = 0; i<vector.length; i++) {
			newVector[i] = vector[i];
		}
		
		this.vector = newVector;
	}
}
