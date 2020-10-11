package com.datastructures.bst;

public class Main {
	
	public static void main(String[] args) {
		Node a = new Node(8);
		Node b = new Node(4);
		Node c = new Node(10);
		Node d = new Node(20);
		
		BST bst = new BST(a);
		bst.insert(4);
		bst.insert(10);
		bst.insert(20);
		
		System.out.println(bst.search(4).getValue());
		
	}
}
