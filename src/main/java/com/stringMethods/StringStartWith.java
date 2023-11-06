package com.stringMethods;

public class StringStartWith {
	
	public static void main(String[] args) {
		
		
		String email = "puravpatel1105@gmail.com";
		
		
		boolean name = email.startsWith("05"); //startWith gives result as boolean
		System.out.println(name); //will give you false cause 05 lies in between the string
		
		
		boolean site = email.endsWith(".com"); // endsWith gives result as boolean
		System.out.println(site);
	}
}
