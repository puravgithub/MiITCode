package com.exceptionhandling;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

/**
 * <h2>Calculator app</h2> This program implements an application to perform
 * operation such as addition/subtraction/multiplication/division of numbers and
 * print the result
 * <p>
 * <b>Note:</b> Comments make the code readable and easy to understand.
 * 
 * @author Purav patel
 * @version 1.0
 * @since 2023-09-03
 */

public class Calculator {

	public static void main(String[] args) {
		for (int i = 0; i < 100; i++) {

			Scanner sc = new Scanner(System.in);
			int result;
			int number;

			System.out.println("Please Enter Num1 : ");
			/*
			 * for (int j = 0; j < 10; j++) { if (sc.hasNext() == true) {
			 * System.out.println("Please enter valid input"); break; } else if
			 * (sc.hasNextInt() == true) { int a = sc.nextInt(); } }
			 */

			int a = sc.nextInt();

			System.out.println("Please Enter Num2 : ");
			int b = sc.nextInt();

			System.out.println("Please give option from  add : sub : mul :div ");
			String operation = sc.next();

			switch (operation) {
			case "add":
				result = a + b;
				System.out.println("Addition is  : " + result);
				break;

			case "sub":
				result = a - b;
				System.out.println("Subtraction is  : " + result);
				break;
			case "mul":
				result = a * b;
				System.out.println("Multiplication is  : " + result);
				break;
			case "div":
				try {
					result = a / b;
					System.out.println("Division is  : " + result);
				} catch (ArithmeticException e) {
					System.out.println("Can not divide by zero");
					continue;
				}
				break;
			default:
				System.out.println("Have a good Day .!");

			}
			System.out.println("Press 5 to Exit");
			int exit = sc.nextInt();
			if (exit == 5) {
				break;
			}

		}
	}

}
