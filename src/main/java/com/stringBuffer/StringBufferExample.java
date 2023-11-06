package com.stringBuffer;


/*//Java StringBuffer class is used to create mutable (modifiable) String objects. 
The StringBuffer class in Java is the same as String class except it is mutable i.e. it can be changed.*/


public class StringBufferExample {

	public static void main(String[] args) {
	
		StringBuffer sf = new StringBuffer("Hello");
		System.out.println(sf.reverse());
		System.out.println(sf.capacity());
		
	

	}

}
