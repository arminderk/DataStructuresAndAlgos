package com.algorithms.linkedlist;
import com.datastructures.linkedlist.*;

public class DeleteMiddleNode {
	public static void main(String[] args) {
		Node n1 = new Node(1);
		Node n2 = new Node(2);
		Node n3 = new Node(3);
		Node n4 = new Node(4);
		Node n5 = new Node(5);
		Node n6 = new Node(6);
		
		LinkedList l = new LinkedList();
		l.pushFront(n1);
		l.pushFront(n2);
		l.pushFront(n3);
		l.pushFront(n4);
		l.pushFront(n5);
//		l.pushFront(n6);
		deleteMiddle(l);
		l.print();
	}
	
	public static void deleteMiddle(LinkedList list) {
		Node i = list.getHead();
		int midIndex = list.size() / 2;
		int counter = 1;
		
		while(i.next != null) {
			if(counter + 1 == midIndex) {
				i.next = i.next.next;
			}
			i = i.next;
			counter++;
		}
	}
}
