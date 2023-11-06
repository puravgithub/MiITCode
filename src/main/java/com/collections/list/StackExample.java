package com.collections.list;

import java.util.Iterator;
import java.util.Stack;

//The stack is the subclass of Vector.
//It implements the LIFO(last-in-first-out) data structure

//push(),peek(),pop()

public class StackExample {

	public static void main(String[] args) {

		Stack<String> stack = new Stack<String>();
		stack.push("Apple");
		stack.push("Banana");
		stack.push("Mango");
		stack.push("Orange");
		stack.push("Watermelon");
		stack.push("Apple");
		stack.pop(); //does not allow duplicate values

		Iterator<String> itr = stack.iterator();

		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
