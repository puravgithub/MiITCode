package com.exceptionhandling;

public class ExceptionExample {

	public static void main(String[] args) {
		int a = 100 ;
		
		int sum ;
		
		try {
		sum = a/0 ;
		System.out.println(sum);
	
		}catch(ArithmeticException e) {
			
			System.out.println(e.getMessage());
		}
		
		
		

	}

}
