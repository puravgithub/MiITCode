package com.stringBuffer;

public class StringBufferAppend {

	public static void main(String[] args) {

		//StrinBuffer Class
		StringBuffer s1 = new StringBuffer("Hello");

		System.out.println(s1);

		s1.append("world"); // Append attach the mutable string with another mutable string

		System.out.println(s1);
		
		
		//String class
		
		String s = "Purav";
		
		s.concat("patel");
	
		System.out.println(s);  // String is immutable it did not change after concat

	}

}
