package com.exceptionhandling;

public class InValidAgeException extends Exception{

	
	public InValidAgeException(String age) {
		
		// calling the constructor of parent Exception  
		super(age);
		System.out.println("Age must be 18 and more than 18");
	}
	
	
}
