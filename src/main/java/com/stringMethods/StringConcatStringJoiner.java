package com.stringMethods;

import java.util.StringJoiner;

public class StringConcatStringJoiner {
	
	// driver code
	public static void main(String[] args) {
		
		
		StringJoiner s = new StringJoiner("-"); // here we are separating string using - 
		
		s.add("Purav");
		s.add("patel");
		
		System.out.println(s.toString()); //toString  will display results
		
		
		
		StringJoiner url = new StringJoiner("/");
		url.add("javatpoint.com");
		url.add ("string-concatenation-in-java");
		
		System.out.println(url.toString());
		
		
		/*
		 * the StringJoiner object s is declared and the constructor StringJoiner()
		 * accepts a separator value. A separator is specified inside quotation marks.
		 * The add() method appends Strings passed as arguments.
		 */
				
	}

}
