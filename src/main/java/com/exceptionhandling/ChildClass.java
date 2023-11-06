package com.exceptionhandling;

import java.io.IOException;

public class ChildClass extends ExceptionMethodOverriding { // child class

	@Override
	public void parentClassMethod() throws IOException,ArithmeticException { 
		 //for checked exception have to write throws in all methods : IOException
		// for unchecked exception do not need to write in all method :ArithmeticException

		System.out.println("Method in child class Exception Child");
	}

	public static void main(String[] args) throws IOException {

		ExceptionMethodOverriding cc = new ExceptionMethodOverriding();  
		cc.parentClassMethod();
	}
}
