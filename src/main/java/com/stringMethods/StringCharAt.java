package com.stringMethods;

public class StringCharAt {
	
	/*
	 * Syntax 
	 * public char charAt(int index)
	 */  
	public static void main(String[] args) {

		String s = "PuravPatel";
		
		System.out.println(s.charAt(5)); //It will display the character at 6 [0 1 2 3 4 5 ]
		
		//It may throw StringIndexOutOfBoundsException
	}

}
