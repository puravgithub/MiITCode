package com.stringMethods;

/* possible methods for valueOf
public static String valueOf(boolean b)  
public static String valueOf(char c)  
public static String valueOf(char[] c)  
public static String valueOf(int i)  
public static String valueOf(long l)  
public static String valueOf(float f)  
public static String valueOf(double d)  
public static String valueOf(Object o)  */

public class StringValueOf {
	
	public static void main(String[] args) {
		
		
		boolean status = true ;
		
		int number = 100;
		
		
		String s1 = String.valueOf(status);
		System.out.println("Displaying answer in string using valueOf : : " +s1);
		String s2 = String.valueOf(number);
		System.out.println("Displaying integer number in string using valueOf  : :" +s2 );
		
		StringValueOf sof = new StringValueOf();
		
		String s3 = String.valueOf(sof); // changing object into string
		System.out.println(s3);
		
	}

}
