package com.exceptionhandling;

public class MultipleCatchBlock {

	public static void main(String[] args) {
		try {

			int a[] = new int[5]; // (declaration)syntax to create array
			a[5] = 25;
			System.out.println(a[5]); // causing array index out of bound exception 

		} catch (ArrayIndexOutOfBoundsException x) {
			System.out.println("Array Out of Bound Exception is occured ::  " + x.getMessage());
		}

		try {
			String s = null; 
			System.out.println(s.length());  //causing null pointer exception
			int sum = 100 / 0;  // causing arithmetic exception
		} catch (ArithmeticException a) {
			System.out.println("Artihmetic Exception is occured ::  " + a.getMessage());

		} catch (NullPointerException n) {
			System.out.println("Null Pointer Exception is occured ::  " + n.getMessage());
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		System.out.println("Rest of code is executed which is out of try block");
	}

}
