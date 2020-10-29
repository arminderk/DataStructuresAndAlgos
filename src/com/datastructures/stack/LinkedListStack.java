package com.datastructures.stack;
import com.datastructures.linkedlist.Node;

public class LinkedListStack<T> {
	private Node<T> top;
	
	public void push(T n) {
		Node<T> newNode = new Node<T>(n);
		newNode.next = top;
		top = newNode;
	}
	
	public Node<T> pop() {
		Node<T> removed = top;
		top = top.next;
		return removed;
	}
	
	public T peek() {
		return top.getData();
	}
	
	public boolean isEmpty() {
		return top == null; 
	}
}
