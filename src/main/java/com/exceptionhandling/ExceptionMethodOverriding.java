package com.exceptionhandling;

import java.io.IOException;

/*If the superclass method does not declare an exception, 
subclass overridden method cannot declare the checked exception but it can declare unchecked exception.*/

/*If the superclass method declares an exception, subclass overridden method can declare same, 
subclass exception or no exception but cannot declare parent exception.*/

public class ExceptionMethodOverriding { // Parent Class

	public void parentClassMethod() throws IOException {//method implemented in childClass
		
		
		System.out.println("Method in parent class");
	}

}


