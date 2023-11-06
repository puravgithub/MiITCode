package com.exceptionhandling;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

/*An exception is first thrown from the top of the stack and if it is not caught, it drops down the call stack to the previous method.
If not caught there, the exception again drops down to the previous method,
and so on until they are caught or until they reach the very bottom of the call stack. This is called exception propagation.*/

public class ExceptionPropagation {
	//Note: By default Unchecked Exceptions are forwarded in calling chain (propagated).
	
	public void method1() {
		
		//PrintWriter pw = new PrintWriter("abcdfgdfgdfgdfgdf.txt");  // may throw acception
		int div = 100 / 0;
	}

	public void method2() {
		method1();
	}

	public void method3() {
		

		try {
			method2();
		} catch (Exception e) {
			System.out.println("Exxception is handled");
		}

	}

	public static void main(String[] args) {
		ExceptionPropagation ep = new ExceptionPropagation();
		ep.method3();

		System.out.println("This line after calling method");
		//Note: By default, Checked Exceptions are not forwarded in calling chain (propagated).
	}

}
