package com.stringMethods;

public class StringIsEmpty {

	public static void main(String[] args) {
		
		String emt = new String("");
		
		System.out.println(emt.isEmpty());  //return boolean value
		
		//method checks if the input string is empty or not.
		//Note that here empty means the number of characters contained in a string is zero.
		
		//System.out.println(emt.isBlank());
		System.out.println(emt.length()); //return integer value
		
		emt = new String("Purav");
		
		System.out.println(emt.isEmpty());
		
		
		
		String size = "                  ";
		
		
		//space is consider as value so it gives negative response
		System.out.println(size.isEmpty());
		
		
		//after trim method it gives that string is empty
		System.out.println(size.trim().isEmpty());

	}

}
