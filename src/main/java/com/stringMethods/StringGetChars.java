package com.stringMethods;

public class StringGetChars {
	public static void main(String[] args) {
		String str = new String("Purav patel");
		char[] ch = new char[20];
		try {
			str.getChars(0, 11, ch, 0); // total value is 26 so give exception array defined is for 20
			System.out.println(ch);
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
