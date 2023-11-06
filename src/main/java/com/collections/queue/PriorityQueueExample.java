package com.collections.queue;

import java.util.Iterator;
import java.util.PriorityQueue;

//The PriorityQueue class implements the Queue interface
//points to remember
//1. It holds the elements or objects which are to be processed by their priorities
//2. PriorityQueue doesn't allow null values to be stored in the queue.

public class PriorityQueueExample {

	public static void main(String[] args) {

		PriorityQueue<String> queue = new PriorityQueue<String>();

		queue.add("Banana");
		queue.offer("Kiwi"); 
		//offer() : Inserts the specified element into the queue. If the task is successful, offer() returns true, if not it returns false.
		//queue.add("Apple");
		queue.add("Orange");
		//queue.add("");
		// queue.add(null); //it does not allow null values (NullPointerException)
		queue.add("Papaya");
		queue.add("Mango");

		System.out.println("Head : " + queue.element()); //Returns the head of the queue. Throws an exception if the queue is empty.
		System.out.println("Head : " + queue.peek()); // Returns the head of the queue. Returns null if the queue is empty.

		System.out.println("iterating the queue elements:");
		Iterator<String> itr = queue.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

		queue.remove(); // remove element from queue{FIFO}
		queue.poll();  //Returns and removes the head of the queue. Returns null if the queue is empty.
		
		System.out.println(queue); //it display all value which is in queue

		System.out.println("after removing two elements:");
		Iterator<String> itr2 = queue.iterator();
		while (itr2.hasNext()) {
			System.out.println(itr2.next());
		}

	}

}
