package com.stringBuilder;

/*Java StringBuilder class is used to create mutable (modifiable) String. 
The Java StringBuilder class is same as StringBuffer class except that it is non-synchronized. It is available since JDK 1.5.*/

//StringBuilder()	It creates an empty String Builder with the initial capacity of 16.
//StringBuilder(String str)	It creates a String Builder with the specified string.
//StringBuilder(int length)	It creates an empty String Builder with the specified capacity as length.

public class StringBuilderExample {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		System.out.println(sb.capacity()); //It has by default capacity of 16
		
		sb.append("How are you?").reverse().delete(10, 20).replace(1, 3, "Hi");  //StringBuilder is non synchronized
		
		System.out.println(sb);
		
		
		//String builder class is faster than StringBuffer Classx
	}

}
