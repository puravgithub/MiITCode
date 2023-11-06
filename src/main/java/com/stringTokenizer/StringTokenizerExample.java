package com.stringTokenizer;

import java.util.StringTokenizer;

//The java.util.StringTokenizer class allows you to break a String into tokens. 
//It is simple way to break a String. It is a legacy class of Java.


public class StringTokenizerExample {

	public static void main(String[] args) {
		//In the StringTokenizer class, the delimiters can be provided at the time of creation or one by one to the tokens.
		
		String s = "This is my first program for StringTokenizer";
		StringTokenizer st = new StringTokenizer(s);
		
		System.out.println(st.countTokens());

	}

}
