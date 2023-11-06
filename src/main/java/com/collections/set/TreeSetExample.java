package com.collections.set;

import java.util.Iterator;
import java.util.TreeSet;

//TreeSet class implements the Set interface that uses a tree for storage.
//access and retrieval time of TreeSet is quite fast.
//The elements in TreeSet stored in ascending order.

public class TreeSetExample {

	public static void main(String[] args) {
		// Creating and adding elements
		TreeSet<String> set = new TreeSet<String>();
		set.add("Purav");
		set.add("Avinash");
		set.add("Kishan");
		set.add("Vinay");
		// traversing elements
		Iterator<String> itr = set.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());  //sorting in ascending order
		}

	}

}
