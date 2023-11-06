package com.stringBuffer;

/*
 * The capacity() method of the StringBuffer class returns the current capacity of the buffer. 
	The default capacity of the buffer is 16. If the number of character increases from its current capacity
, 	it increases the capacity by (oldcapacity*2)+2. For example if your current capacity is 16, it will be (16*2)+2=34.
*/
public class StringBufferCapacity {

	public static void main(String[] args) {

		StringBuffer sb = new StringBuffer();
		sb.capacity();
		System.out.println(sb.capacity()); //by Default 16
		sb.append("Hello");
		System.out.println(sb.capacity()); //now 16
		sb.append("How are you ?");
		System.out.println(sb.capacity()); // now (16*2)+2=34 i.e (oldcapacity*2)+2

	}

}
