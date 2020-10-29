package com.datastructures.stack;

public class Main {
	public static void main(String[] args) {
		// ArrayStack
		ArrayStack stack = new ArrayStack(10);
		stack.push(4);
		stack.push(10);
		stack.push(7);
		stack.push(1);
		stack.push(20);
		System.out.println("Top of Stack: " + stack.peek());
		
		// LinkedListStack
		LinkedListStack<Integer> linkedStack = new LinkedListStack<>();
		linkedStack.push(10);
		linkedStack.push(20);
		linkedStack.push(45);
		linkedStack.pop();
		System.out.println("Top of Stack: " + linkedStack.peek());
	}
}
