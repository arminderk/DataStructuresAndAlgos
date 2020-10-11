package com.datastructures.bst;

public class Node {
	private Node leftChild;
	private Node rightChild;
	private int value;
	
	public Node(int value) {
		this.value = value;
	}
	
	public void setLeftChild(Node leftChild) {
		this.leftChild = leftChild;
	}
	
	public void setRightChild(Node rightChild) {
		this.rightChild = rightChild;
	}
	
	public Node getLeftChild() {
		return this.leftChild;
	}
	
	public Node getRightChild() {
		return this.rightChild;
	}
	
	public int getValue() {
		return this.value;
	}
}
