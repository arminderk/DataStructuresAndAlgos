package com.datastructures.queue;

public class QueueNode<T> {
	private T data;
	public QueueNode<T> next;
	
	public QueueNode(T data) {
		this.data = data;
		this.next = null;
	}
	
	public T getData() {
		return this.data;
	}
}
