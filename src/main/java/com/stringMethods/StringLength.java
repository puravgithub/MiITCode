package com.stringMethods;

//The Java String class length() method finds the length of a string. 
//The length of the Java string is the same as the Unicode code units of the string.

public class StringLength {

	public static void main(String[] args) {
		String name = "This is purav patel";
		
		int len = name.length();
		
		
		if (len>0) {
			System.out.println("String is not empty");
			System.out.println("length of String is ::" + len);
			
		}
		name ="";
		len =name.length();
		 if(len==0) {
			 System.out.println("String is empty");
			 System.out.println("length of String is ::" + len);
		 }
	}
	
	

}
