package com.exceptionhandling;

public class ExceptionExmaple1 {
	
	public static void main(String[] args) {
		
		
		String s = null;
		
		try {
			
		System.out.println(s.length());
		
		int a =10/0;  // this will give arithmetic exception
		
		}catch(NullPointerException n) {
			System.out.println(n);
			
			
		}
		
	}

}
