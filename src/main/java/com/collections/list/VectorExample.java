package com.collections.list;

import java.util.Iterator;
import java.util.Vector;

//Vector uses a dynamic array to store the data elements

//1. It is synchronized (Thread Safe)

public class VectorExample {

	public static void main(String[] args) {
		Vector<String> v = new Vector<String>();
		v.add("Ayush");
		v.add("Amit");
		v.add("Ashish");
		v.add("Garima");
		v.add("Purav");
		v.add("Kishan");
		
		
		v.remove(4); //Index start from 0
		v.remove("Ayush");
		
		Iterator<String> itr = v.iterator();
		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
