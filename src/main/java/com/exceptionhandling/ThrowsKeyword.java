package com.exceptionhandling;

import java.io.IOException;

/*Exception Handling is mainly used to handle the checked exceptions. 
If there occurs any unchecked exception such as NullPointerException, 
it is programmers' fault that he is not checking the code before it being used.
*/
public class ThrowsKeyword {

public void method1() throws IOException {
		
	//Below line Throws IOException
		
    throw new IOException("device error");//checked exception  // have to add throws declaration
	}

	public void method2() throws IOException {
		method1();  // we have to throws Exception here because we re using method1 in this class
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
