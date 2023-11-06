package com.stringExamples;

/*There are two ways to create String object:

	By string literal
	By new keyword
*/

public class StringExample {

	public static void main(String[] args) {

		// declaring string by literal
		String s = "Welcome";
		String s1 = "Welcome"; // this line does not create a new instance

		// declaring by new keyword
		String s2 = new String("Welcome");// creates two objects and one reference variable
		
		s = "new";
		System.out.println(s);

	}

}
