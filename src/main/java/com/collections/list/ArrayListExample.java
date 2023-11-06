package com.collections.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

//The ArrayList class implements the List interface. 
//points to remember :
//1.allow duplicate values from different data types
//2. maintain insertion order
//3. non synchronized (not Thread Safe)

//Iterator<T> iterator()   : it is used as loop to retrieve data from Collection (here T is data type)

public class ArrayListExample {

	public static void main(String[] args) {

		ArrayList<String> studentlist = new ArrayList<String>();

		studentlist.add("Purav");
		studentlist.add("kishan");
		studentlist.add("Purav");
		studentlist.add("Dwijen");
		studentlist.add("Sid");
		studentlist.add("kishan");
		studentlist.add("Kinjal");

//		LinkedList<String> studentlink = new LinkedList<>();
//		studentlink.addAll(studentlist);
//		Iterator itlink = studentlink.iterator();
//		while (itlink.hasNext()) {
//			System.out.println(itlink.next());
//		}

		Iterator itr = studentlist.iterator();

		while (itr.hasNext()) {
			System.out.println(itr.next());

		}

	}

}
