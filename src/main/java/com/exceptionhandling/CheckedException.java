package com.exceptionhandling;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class CheckedException {
	

	public static void main(String[] args) {
		PrintWriter pw ; // using Aggregation concepts 
		
		try {
		pw = new PrintWriter("abcdfgdfgdfgdfgdf.txt");  // may throw acception
		
		pw.println("Saved");
		System.out.println("This line in try block");
		
		}
		catch(FileNotFoundException fnf) {
			System.out.println(fnf.getMessage());
		}
		
		  System.out.println("File saved successfully");  
	}

}
