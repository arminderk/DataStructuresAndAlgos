package com.datastructures.linkedlist;

public class LinkedList<T> {
	private Node<T> head;
	private int size;
	
	public LinkedList() {
		this.head = null;
		this.size = 0;
	}
	
	public Node<T> getHead() {
		return this.head;
	}
	
	public int size() {
		return this.size;
	}
	
	public void pushFront(Node<T> n) {
		if(head == null) {
			head = n;
		}
		else {
			n.next = head;
			head = n;
		}
		
		size++;
		System.out.println("Node " + n.getData() + " inserted at front");
	}
	
	public Node<T> popFront() {
		Node<T> removed = head;
		head = head.next;
		
		return removed;
	}
	
	public void pushBack(Node<T> n) {
		Node<T> lastElement = head;
		
		while(lastElement.next != null) {
			lastElement = lastElement.next;
		}
		
		lastElement.next = n;
		size++;
		System.out.println("Node " + n.getData() + " inserted at back");
	}
	
	public Node<T> valueAt(Node<T> n) {
		if(head.getData() == n.getData()) {
			System.out.println("Node " + n.getData() + " found at head");
			return head;
		}
		else {
			Node<T> i = head;
			
			while(i != null) {
				if(i.getData() == n.getData()) {
					System.out.println("Node " + n.getData() + " found");
					return n;
				}
				i = i.next;
			}
		}
		
		System.out.println("Node " + n.getData() + " not found");
		return null;
	}
	
	public void print() {
		Node<T> i = head;
		
		while(i != null) {
			System.out.print(i.getData() + " --> ");	
			i = i.next;
		}
		System.out.println("");
	}
}
