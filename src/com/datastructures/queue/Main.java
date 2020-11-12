package com.datastructures.queue;

public class Main {
	public static void main(String[] args) {
		Queue<String> queue = new Queue<String>();
		
		queue.enqueue("One");
		queue.enqueue("Two");
		queue.enqueue("Three");
		queue.print();
	}
}
