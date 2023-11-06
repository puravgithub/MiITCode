package com.stringMethods;

public class StringTrim {
	
	//The String class trim() method eliminates white spaces before and after the String.
	
	public static void main(String[] args) {
		String s = "       trim  method      remove white spaces before and after string only     not between     the string     " ;
		
	
		String t = s.trim();
		System.out.println(t); // it will trim the sentence and remove space
	}

}
