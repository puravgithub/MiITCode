package com.collections.set;

import java.util.Iterator;
import java.util.LinkedHashSet;

//It extends the HashSet class and implements Set interface
//1.  It maintains the insertion order
//2. It allows null elements

public class LinkedHashSetExample {

	public static void main(String[] args) {

		LinkedHashSet<String> set = new LinkedHashSet<String>();
		set.add("Kishan");
		set.add("Vijay");
		set.add("Purav");
		set.add("Ajay");
		set.add("Divya");
		set.add(null); //allows null values

		Iterator<String> itr = set.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
