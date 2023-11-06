package com.stringMethods;

public class StringFormat1 {

	public static void main(String[] args) {

		String str1 = String.format("%d", 101); // Integer value
		String str2 = String.format("%s", "Purav patel"); // String value
		String str3 = String.format("%f", 101.00); // Float value
		String str4 = String.format("%x", 101); // Hexadecimal value
		String str5 = String.format("%c", 'c'); // Char value
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		System.out.println(str4);
		System.out.println(str5);
		
		
		 String str6 = String.format("%d", 101);  
	        String str7 = String.format("|%10d|", 101);  // Specifying length of integer  
	        String str8 = String.format("|%-10d|", 101); // Left-justifying within the specified width  
	        String str9 = String.format("|% d|", 101);   
	        String str10 = String.format("|%010d|", 101); // Filling with zeroes  
	        System.out.println(str6);  
	        System.out.println(str7);  
	        System.out.println(str8);  
	        System.out.println(str9);  
	        System.out.println(str10); 

	}

}
