package com.exceptionhandling;

public class TryCatch {
	
	public static void main(String[] args) {
		
		String s = null ;
		
		try {
		System.out.println(s.length());  //Exception occurs
		System.out.println("This statement after exception occurs");  // This code will not be executed
		}
	
		catch(NullPointerException n){
			System.out.println("Catch block is exectured");
		}
	}

}
