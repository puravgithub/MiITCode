package com.stringMethods;

/*
 * When a string is created in Java, it occupies memory in the heap. Also, we know that the String class is immutable. 
Therefore, whenever we create a string using the new keyword, 
new memory is allocated in the heap for corresponding string, which is irrespective of the content of the array
*/

//intern() returns interned string

public class StringIntern {
	
	public static void main(String[] args) {
		
		
		String s1 = "This is String";
		String s2 = "This is String"; // compiler by default consider as s1.intern()
		
		//"Comparing similar string which is declared by literal  : " (by Default .intern() invoked while declaring string by literal
		System.out.println(s1==s2);
		
		
		String s3 = new String("This is String");
		String s4 = new String("This is String");
		
		//"Comparing similar string which is declared by new keyword  : " +
		System.out.println( s3==s4);
		
		
		
		String s5 = "This is String".intern();
		String s6 = "This is String".intern();
		
		//"Comparing similar string which is defined using intern() method  : "
		System.out.println( s5==s6);
		
		
		String s7 = new String("This is String").intern();
		String s8 = new String("This is String").intern();
		
		System.out.println(s7==s8);
	}

}
