package com.algorithms.linkedlist;
import com.datastructures.linkedlist.*;

public class KthToLast {
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
		Node k = kthToLast(3, l);
		System.out.println("Kth to Last Element: " + k.getNum());
		l.print();
	}
	
	public static Node kthToLast(int k, LinkedList list) {
		Node i = list.getHead();
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
