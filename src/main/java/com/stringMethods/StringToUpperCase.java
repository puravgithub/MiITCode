package com.stringMethods;


/*
 * The java.lang.String class provides a lot of built-in methods that are used to manipulate string in Java. 
By the help of these methods, we can perform operations on String objects such as
trimming, concatenating, converting, comparing, replacing strings etc.
*/

public class StringToUpperCase {
	
	public static void main(String[] args) {
		
		
		String line1 = new String("This is CamleCase with some lower case words"); //declaring string using new keyword
		
		
		String upper = line1.toUpperCase(); //it will change all characters to uppercase
		
		
		System.out.println(upper);
	}

}
