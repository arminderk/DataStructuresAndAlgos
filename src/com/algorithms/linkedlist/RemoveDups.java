package com.algorithms.linkedlist;

import com.datastructures.linkedlist.*;

public class RemoveDups {
	public static void main(String[] args) {
		Node n1 = new Node(1);
		Node n2 = new Node(2);
		Node n3 = new Node(2);
		Node n4 = new Node(3);
		Node n5 = new Node(2);
		
		LinkedList l = new LinkedList();
		l.pushFront(n1);
		l.pushFront(n2);
		l.pushFront(n3);
		l.pushFront(n4);
		l.pushFront(n5);
		removeDups(l);
		l.print();
		
	}
	
	public static void removeDups(LinkedList list) {
		Node i = list.getHead();
		
		while(i != null && i.next != null) {
			Node j = i;
			while(j.next != null) {
				if(j.next.getNum() == i.getNum()) {
					j.next = j.next.next;
				}
				else {
					j = j.next;
				}
			}
			
			i = i.next;
		}
	}
}
