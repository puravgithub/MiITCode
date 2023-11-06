package com.exceptionhandling;


import java.util.Scanner;

// here we have created custom Exception (InValidAgeException) and we are using it in our class
public class CustomException {
	
	public static void ValidateAge(int age) throws InValidAgeException {
		if (age<18) {
			System.out.println("person is under age");
			  // throw an object of user defined exception  
	        throw new InValidAgeException("age is not valid to vote");    
			}
			else if(age == 18){
				System.out.println("Person can vote !");
			}
			else {
				System.out.println("Person can vote !");
				
			}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Please Enter your age");
		int age = sc.nextInt();
		
		try {
			ValidateAge(age);
			
		}
		catch(InValidAgeException i) { //Here Exception is created by me :: custom Exception
			
			System.out.println("Caught the exception");  
			System.out.println("Message from exception : : "+i.getMessage());
		}
	
		
		
		
		System.out.println("Rest of code is executed"); 
	}
}
