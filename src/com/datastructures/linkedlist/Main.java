package com.datastructures.linkedlist;

public class Main {
	public static void main(String[] args) {
		Node n1 = new Node(1);
		Node n2 = new Node(2);
		Node n3 = new Node(2);
		Node n4 = new Node(5);
		
		LinkedList l = new LinkedList();
		l.pushFront(n1);
		l.pushFront(n2);
		l.pushFront(n3);
		l.pushBack(n4);
		l.print();
	}
}
