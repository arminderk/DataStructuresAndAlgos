package com.algorithms.linkedlist;

import com.datastructures.linkedlist.*;

public class RemoveDups {
	public static void main(String[] args) {
		Node<Integer> n1 = new Node<Integer>(1);
		Node<Integer> n2 = new Node<Integer>(2);
		Node<Integer> n3 = new Node<Integer>(1);
		Node<Integer> n4 = new Node<Integer>(2);
		Node<Integer> n5 = new Node<Integer>(3);
//		Node<Integer> n6 = new Node<Integer>(6);
		
		LinkedList<Integer> l = new LinkedList<Integer>();
		l.pushFront(n1);
		l.pushFront(n2);
		l.pushFront(n3);
		l.pushFront(n4);
		l.pushFront(n5);
		removeDups(l);
		l.print();
		
	}
	
	public static void removeDups(LinkedList<Integer> list) {
		Node<Integer> i = list.getHead();
		
		while(i != null && i.next != null) {
			Node<Integer> j = i;
			while(j.next != null) {
				if(j.next.getData() == i.getData()) {
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
