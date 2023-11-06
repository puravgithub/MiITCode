package com.stringMethods;


//String Concatenation using join() method
public class StringConcatJoin {
	

	public static void main(String[] args) {
		
		String fname = "Purav";
		String lname = "Patel";
		String cellNo = "9998231887";
		
	String s = String.join("-",fname, lname,cellNo); //joining mentioned Strings
	
	//String.join() method accepts arguments first a separator and an array of String objects.
	
	System.out.println(s);
		
	}

}
