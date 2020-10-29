package com.algorithms.linkedlist;
import com.datastructures.linkedlist.*;

public class KthToLast {
	public static void main(String[] args) {
		Node<Integer> n1 = new Node<Integer>(1);
		Node<Integer> n2 = new Node<Integer>(2);
		Node<Integer> n3 = new Node<Integer>(3);
		Node<Integer> n4 = new Node<Integer>(4);
		Node<Integer> n5 = new Node<Integer>(5);
		Node<Integer> n6 = new Node<Integer>(6);
		
		LinkedList<Integer> l = new LinkedList<Integer>();
		
		l.pushFront(n1);
		l.pushFront(n2);
		l.pushFront(n3);
		l.pushFront(n4);
		l.pushFront(n5);
		l.pushFront(n6);
		Node<Integer> k = kthToLast(2, l);
		System.out.println("Node " + k.getData() + " is kth to last");
		l.print();
	}
	
	public static Node<Integer> kthToLast(int k, LinkedList<Integer> list) {
		Node<Integer> i = list.getHead();
		int counter = 1;
		int nodeToSearch = list.size() - k;
		
		if(nodeToSearch <= 0) {
			return null;
		}
		else {
			while(i.next != null) {
				if(counter == nodeToSearch) {
					return i;
				}
				
				i = i.next;
				counter++;
			}
		}
		
		return null;	
	}
}
