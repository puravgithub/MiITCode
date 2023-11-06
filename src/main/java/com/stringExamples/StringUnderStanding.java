package com.stringExamples;
//String class is immutable means it can not change
public class StringUnderStanding {
	
	//String is basically an object which is sequence of characters (char) 
	public static void main(String[] args) {
		
		char ch[] = {'p','u','r','a','v','_','p','a','t','e','l'};
		String s = new String(ch);
		System.out.println(s); //will print the array sequence of character
		
		
		//The java.lang.String class implements Serializable, Comparable and CharSequence interfaces.
		
		
		//The CharSequence interface is used to represent the sequence of characters. 
		//String, StringBuffer and StringBuilder classes implement it. It means, we can create strings in Java by using these three classes.
		
		
		/*
		 * The Java String is immutable which means it cannot be changed. Whenever we
		 * change any string, a new instance is created. For mutable strings, you can
		 * use StringBuffer and StringBuilder classes.
		 */
	}
	

}
