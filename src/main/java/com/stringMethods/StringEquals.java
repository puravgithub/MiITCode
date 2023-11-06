package com.stringMethods;
///comparing 2 string using equals method
public class StringEquals {

	public static void main(String[] args) {
		
		String name1 = "Purav";
		String name2 = "Patel" ;
				
		String name3 = new String("Purav");
		
		System.out.println(name1.equals(name2)); //false //comparing first 2 strings
		
		System.out.println(name1.equals(name3)); //true
		
		
		//String comparison using oprator ==
		
		System.out.println(name1 == name3); //true

	}

}
