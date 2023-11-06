package com.stringMethods;

public class StringFormat {

	public static void main(String[] args) {

		String name = "purav patel";
		String  cpi = "2.25646879546";
		
		String fname = String.format("name is %s", name); // %s is  replaced with string which is name
		
		System.out.println(fname);
		
		String fcpi = String.format("format is %s", cpi);
	
		System.out.println(fcpi);

		
		String time = String.format("current time %t", 2564236);
		System.out.println(time);
	}

}
