package com.stringMethods;

/*
	public String replace(char oldChar, char newChar)    
	public String replace(CharSequence target, CharSequence replacement)
 */

public class StringReplace {
	public static void main(String[] args) {
		
		String str = "The stars above whispered secrets to the night.";
		
		String newStr = str.replace('e', 'o');
		
		System.out.println("Original String :: " +str);
		System.out.println("String after Replacement :: " +newStr);
		
		newStr = str.replace("stars","fireflies");
		System.out.println("New String after CharSequence replacement :: " +newStr);
	}

}
