package com.collections.queue;

import java.util.ArrayDeque;
import java.util.Deque;

//Deque stands for a (double-ended queue)
//Deque interface extends the Queue interface
//we can remove and add the elements from both the side

public class DequeExample {

	public static void main(String[] args) {
		// Creating Deque and adding elements
		Deque<String> deque = new ArrayDeque<String>();
		deque.add("Gautam");
		deque.add("Karan");
		deque.add("Ajay");
		deque.add("Purav");
		deque.add("Kishan");
		
	
		deque.remove();
		System.out.println("Head :"+deque.peek());
		
		// Traversing elements
		for (String str : deque) {
			System.out.println(str);
		}

		
	}

}
