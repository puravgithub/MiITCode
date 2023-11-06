package com.stringMethods;

/*
String concatenation can be done using 

using operator +
using concat() method

*/

public class StringConcat {

	public static void main(String[] args) {

		String s1 = "MiIT"+40;  // Note: After a string literal, all the + will be treated as string concatenation operator.
		
		
		String s2 = "Technologies".concat(" ltd.");
		
		System.out.println(s1.concat(s2)); //using concat()method
		System.out.println(s1+s2); //using operator +
		
		

	}

}
