package com.exceptionhandling;

import java.util.Scanner;


public class LoopSwitchCase1 {

	public static void main (String args[]) {
		Scanner sc = new Scanner(System.in);
		int result ;
		
		System.out.println("Please Enter Num1 : ");
		int a = sc.nextInt();
	
	
		System.out.println("Please Enter Num2 : ");
		int b = sc.nextInt();
		System.out.println("Please give option from  add : sub : mul :div ");
		String operation = sc.next();
		
		switch(operation) {
		case "add" :
			result = a+b;
			System.out.println("Addition is  : "+result);
			break ;
			
		case "sub" :
			result = a-b;
			System.out.println("Subtraction is  : "+result);
			break ;
		case "mul" :
			result = a*b;
			System.out.println("Multiplication is  : "+result);
			break ;
		case "div" :
			result = a/b;
			System.out.println("Division is  : "+result);
			break ;
			default :
				System.out.println("Have a good Day .!");
		}
		
	}
}
