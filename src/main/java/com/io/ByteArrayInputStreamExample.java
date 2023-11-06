package com.io;

import java.io.ByteArrayInputStream;

public class ByteArrayInputStreamExample {

	public static void main(String[] args) {

		// Constructor
		// ByteArrayInputStream(byte[] ary)

		byte[] byteAry = { 100, 106, 105, 97, 100, 10, 86, 91, 99 };

		ByteArrayInputStream bary = new ByteArrayInputStream(byteAry);

		int i = bary.read();
	
		
		i =0 ;
		while((i=bary.read())!=-1) {
			System.out.print((char)i); //returning character for byte ASCII Code which is defined in Array
		}

	}

}
