package com.stringMethods;

public class StringContains {
	
	
	public static void main(String[] args) {
		
		String email = "puravpatel1105@gmail.com";
		
		boolean result =  email.contains("@"); //true
		
		boolean result1 = email.contains("#");  // false
		
		System.out.println("email contains @ or not : "+result); 
		System.out.println("email contains # or not : "+result1);
		
		
	}

}
