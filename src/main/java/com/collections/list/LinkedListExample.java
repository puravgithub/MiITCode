package com.collections.list;

import java.util.Iterator;
import java.util.LinkedList;

//The LinkedList class implements the Collection interface. 
//points to remember :
//1.allow duplicate values from different data types
//2. maintain insertion order
//3. non synchronized (not Thread Safe)
//4. manipulation is fast because no shifting is required.

//Iterator<T> iterator()   : it is used as loop to retrieve data from Collection (here T is data type)

public class LinkedListExample {

	public static void main(String[] args) {
		LinkedList<String> al = new LinkedList<String>();
		al.add("Ravi");
		al.add("Vijay");
		al.add("Ravi");
		al.add("Ajay");
		al.add("Purav");
		al.add("Kishan");

		Iterator<String> itr = al.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

	}
}
