package com.datastructures.array;

import java.util.List;
import java.util.ArrayList;

public class ArrayLists {
	
	public static void main(String[] args) {
		List<String> fruits = new ArrayList<String>();
		
		// Add Items
		fruits.add("Mango");
		fruits.add("Peach");
		fruits.add("Watermelon");
		fruits.add("Orange");
		fruits.add("Apple");
		
		// Get Size (No. of Elements in List)
		System.out.println(fruits.size());
		
		// Check if array list contains object
		System.out.println(fruits.contains("Grapes"));
		
		// Return index of the first occurrence of the element
		System.out.println(fruits.indexOf("Apple"));
	}
	
	

}
