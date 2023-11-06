package com.stringBuffer;

//The insert() method inserts the given String with this string at the given position.

public class StringBufferInsert {

	public static void main(String[] args) {
		
		StringBuffer in = new StringBuffer("Hello");
		
		in.insert(3,"Purav"); // Now string is changed //Purav is inserted after 3 characters
		
		System.out.println(in);

	}

}
