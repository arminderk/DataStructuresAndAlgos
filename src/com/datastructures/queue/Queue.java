package com.datastructures.queue;

public class Queue<T> {
	QueueNode<T> head;
	QueueNode<T> tail;
	
	public Queue() {
		this.head = null;
		this.tail = null;
	}
	
	public void enqueue(T data) {
		QueueNode<T> n = new QueueNode<T>(data);
		
		if(tail != null) {
			tail.next = n;
		}
		
		tail = n;
		
		if(head == null) {
			head = tail;
		}
	}
	
	public void dequeue() {
		if(head != null) {
			head = head.next;
		}
		else {
			tail = null;
		}
	}
	
	public T peek() {
		if(head == null) {
			return null;
		}
		
		return head.getData();
	}
	
	public boolean empty() {
		return head == null;
	}
	
	public void print() {
		QueueNode<T> n = this.head;
	
		while(n != null) {
			if(n == head) {
				System.out.print(n.getData() + " (head) --> ");
				
			}
			else if(n == tail) {
				System.out.print(n.getData() + " (tail) --> ");
			}
			else {
				System.out.print(n.getData() + " --> ");
			}
				
			n = n.next;
		}
	}
}
