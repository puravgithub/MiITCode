package com.stringMethods;

public class StringEqualIgnoreCase {

	public static void main(String[] args) {


		String lower = new String("purav"); //declaring String using new keyword
		String upper = "PURAV" ; // declaring String using Literal
		
		
		System.out.println(lower.equals(upper)); //false 
		
		System.out.println(upper.equalsIgnoreCase(lower)); //true //ignores upper-lower case

	}

}
