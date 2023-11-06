package com.exceptionhandling;

import java.io.IOException;

public class ThrowsKeyword1 {
	
	public void method() throws IOException {
		
		
		throw new IOException("Device Error"); //this exception we have created here
	}

	public static void main(String[] args) {
		try {
		ThrowsKeyword1 th1 = new ThrowsKeyword1();
		th1.method();
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		System.out.println("Line executed after handling Exception");
		
		// For more information refer checked exception and exception propogation
	}

}
