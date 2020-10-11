package com.datastructures.bst;

public class BST {
	private Node root;
	
	public BST(Node root) {
		this.root = root;
	}
	
	public void insert(int value) {
		Node n = new Node(value);
		Node i = root;
		
		while(true) {
			if(n.getValue() < i.getValue()) {
				if(i.getLeftChild() == null) {
					i.setLeftChild(n);
					break;
				}
				else {
					i = i.getLeftChild();
				}
			}
			else {
				if(i.getRightChild() == null) {
					i.setRightChild(n);
					break;
				}
				else {
					i = i.getRightChild();
				}
			}
		}
	}
	
	public Node search(int value) {
		Node current = root;
		
		while(current.getValue() != value) {
			if(current != null) {
				System.out.println(current.getValue());
				
				if(current.getValue() > value) {
					current = current.getLeftChild();
				}
				else {
					current = current.getRightChild();
				}
				
				if(current == null) {
					return null;
				}
			}
		}
		
		return current;
	}
}
