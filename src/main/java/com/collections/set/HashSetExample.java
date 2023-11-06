package com.collections.set;

import java.util.HashSet;
import java.util.Iterator;

//HashSet class implements Set Interface


public class HashSetExample {

	public static void main(String[] args) {

		HashSet<String> set = new HashSet<String>();
		set.add("Ravi");
		set.add("Kishan");
		set.add("Purav");
		set.add("Anita");
		set.add("Bhola");

		Iterator<String> itr = set.iterator();

		while (itr.hasNext()) {
			System.out.println(itr.next());
		}

	}

}
