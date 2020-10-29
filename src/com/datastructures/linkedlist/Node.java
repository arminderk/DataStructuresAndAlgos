package com.datastructures.linkedlist;

public class Node<T> {
	private T type;
	public Node<T> next;
	
	public Node(T type) {
		this.type = type;
		this.next = null;
	}
	
	public T getData() {
		return this.type;
	}
}
