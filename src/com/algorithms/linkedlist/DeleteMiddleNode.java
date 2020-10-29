package com.algorithms.linkedlist;
import com.datastructures.linkedlist.*;

public class DeleteMiddleNode {
	public static void main(String[] args) {
		Node<Integer> n1 = new Node<Integer>(1);
		Node<Integer> n2 = new Node<Integer>(2);
		Node<Integer> n3 = new Node<Integer>(3);
		Node<Integer> n4 = new Node<Integer>(4);
		Node<Integer> n5 = new Node<Integer>(5);
//		Node<Integer> n6 = new Node<Integer>(6);
		
		LinkedList<Integer> l = new LinkedList<Integer>();
		l.pushFront(n1);
		l.pushFront(n2);
		l.pushFront(n3);
		l.pushFront(n4);
		l.pushFront(n5);
//		l.pushFront(n6);
		deleteMiddle(l);
		l.print();
	}
	
	public static void deleteMiddle(LinkedList<Integer> list) {
		Node<Integer> i = list.getHead();
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
