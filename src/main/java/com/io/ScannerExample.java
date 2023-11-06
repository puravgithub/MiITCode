package com.io;

import java.util.Scanner;

// Java provides various ways to read input from the keyboard, the java.util.Scanner class is one of them.
//To get the instance of Java Scanner which reads input from the user, 
//we need to pass the input stream (System.in) in the constructor of Scanner class

public class ScannerExample {

	public static void main(String[] args) {
		// The Java Scanner class breaks the input into tokens using a delimiter which
		// is whitespace by default.

		System.out.println("Enter your Name::");
		Scanner sc = new Scanner(System.in);
		String myname = sc.nextLine();

		System.out.println("Entered Name  : " + myname);

		String s = "Hello, This is JavaTpoint.";
		// Create scanner Object and pass string in it
		Scanner scan = new Scanner(s);   //Scanner(String s)
		// Check if the scanner has a token
		System.out.println("Boolean Result: " + scan.hasNext());
		// Print the string
		System.out.println("String: " + scan.nextLine());
		scan.close();
		System.out.println("--------Enter Your Details-------- ");
		Scanner in = new Scanner(System.in);
		System.out.print("Enter your name: ");
		String name = in.next();
		System.out.println("Name: " + name);
		System.out.print("Enter your age: ");
		int i = in.nextInt();  //accepts only integer values
		System.out.println("Age: " + i);
		System.out.print("Enter your salary: ");
		double d = in.nextDouble(); //salary number
		System.out.println("Salary: " + d);
		in.close();

	}

}
