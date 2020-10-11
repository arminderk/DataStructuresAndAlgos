package com.datastructures.linkedlist;

public class LinkedList {
	public Node head;
	
	public LinkedList() {
		this.head = null;
	}
	
	public void insertAtHead(Node n) {
		if(head == null) {
			head = n;
		}
		else {
			n.next = head;
			head = n;
		}
		
		System.out.println("Node " + n.getNum() + " inserted");
	}
	
	public Node findNode(Node n) {
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
	
	public void removeDups() {
		Node i = head;
		
		while(i != null) {
			Node j = i;
			while(j != null) {
				if(j.getNum() == i.getNum()) {
					j = j.next;
					
				}
				j = j.next;
			}
			i = i.next;
		}
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
