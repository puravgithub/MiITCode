package com.io;
//Stream : A stream is a sequence of data. In Java, a stream is composed of bytes

import java.io.IOException;

//A stream is a sequence of data. In Java, a stream is composed of bytes. 
//It's called a stream because it is like a stream of water that continues to flow.

/*
 * In Java, 3 streams are created for us automatically. All these streams are attached with the console.

1) System.out: standard output stream

2) System.in: standard input stream

3) System.err: standard error stream

*/

public class StreamExample {

	public static void main(String[] args) throws IOException {
		int a = System.in.read();
		
		System.out.println( (char)a); //reading first character which you will enter

		System.out.println("Simple message");

		System.err.println("Error message"); // printed in red lines

	}

}
