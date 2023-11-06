package com.exceptionhandling;

import java.util.InputMismatchException;
import java.util.Scanner;

//The Java throw keyword is used to throw an exception explicitly.

public class ThrowKeyword {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Please Enter your age");
		int age = sc.nextInt();
	
		if (age<18) {
		//	System.out.println("person is under age");
			throw new ArithmeticException("Person can not vote.");  // we are creating our own exception here
		}
		else if(age == 18){
			System.out.println("Person can vote !");
		}
		else {
			System.out.println("Person can vote !");
			throw new InputMismatchException("Please enter age in numbers");
		}
		
		System.out.println("Rest of code is executed"); // It is not executed as exception is occurred in else block
	}

}
