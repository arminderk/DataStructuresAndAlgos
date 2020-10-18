package com.datastructures.linkedlist;

public class LinkedList {
	private Node head;
	private int size;
	
	public LinkedList() {
		this.head = null;
		this.size = 0;
	}
	
	public Node getHead() {
		return this.head;
	}
	
	public int size() {
		return this.size;
	}
	
	public void pushFront(Node n) {
		if(head == null) {
			head = n;
		}
		else {
			n.next = head;
			head = n;
		}
		
		size++;
		System.out.println("Node " + n.getNum() + " inserted at front");
	}
	
	public int popFront() {
		Node removed = head;
		head = head.next;
		
		return removed.getNum();
	}
	
	public void pushBack(Node n) {
		Node lastElement = head;
		
		while(lastElement.next != null) {
			lastElement = lastElement.next;
		}
		
		lastElement.next = n;
		size++;
		System.out.println("Node " + n.getNum() + " inserted at back");
	}
	
	public Node valueAt(Node n) {
		if(head.getNum() == n.getNum()) {
			System.out.println("Node " + n.getNum() + " found at head");
			return head;
		}
		else {
			Node i = head;
			
			while(i != null) {
				if(i.getNum() == n.getNum()) {
					System.out.println("Node " + n.getNum() + " found");
					return n;
				}
				i = i.next;
			}
		}
		
		System.out.println("Node " + n.getNum() + " not found");
		return null;
	}
	
	public void print() {
		Node i = head;
		
		while(i != null) {
			System.out.print(i.getNum() + " --> ");	
			i = i.next;
		}
		System.out.println("");
	}
}
