package com.brigitte.model;

import java.util.Arrays;

public class Stack {
	
	private int lastItem = 0;
	private int[] items = new int[0];
	
	//add items to stack
	public void push(int newItem) {
		
		int index = items.length; // get current length to store item
		System.out.println("The array length is: " + index);
		
		items = new int[items.length + 1]; //increase array by 1 to add new item
		System.out.println("Items after extending the length by 1: " + Arrays.toString(items));
		
		items[index] = newItem; // store value in index
		System.out.println("Items after storing the new value: " + Arrays.toString(items));
		
		lastItem = newItem; // update last item
		System.out.println("The last item: " + lastItem);
	}
	
	//remove items from stack
	public int pop() {
		int tempItem = lastItem; // store last item into variable
		
		//copy new array but remove last items
		int[] newArray = new int[items.length-1];
		
		for(int i = 0; i<newArray.length; i++) {
			newArray[i] = items[i];
		}
		
		items = newArray; //update items array
		lastItem = items[items.length-1]; //update lastItem
		
		//return our "Popped" element
		return tempItem;
	}
	
	//view last item
	public int peek() {
		return 0;
	}
}
