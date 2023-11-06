package com.stringMethods;

import java.io.UnsupportedEncodingException;

public class StringGetBytes {

	public static void main(String[] args) throws UnsupportedEncodingException {

		String s1 = "abcdefghijklmn";
		byte[] barr = s1.getBytes(); 
		// getbytes by default give ASCII value by passing argument we can change it to UTF-16, and more
		//byte[] barr1 = s1.getBytes("UTF-16LE");  
		
		for (int i = 0; i < barr.length; i++) { // returns ASCII code for the characters
			System.out.println(barr[i]);

		}

		// Getting string back
		String s2 = new String(barr);
		System.out.println(s2);
	}
}
