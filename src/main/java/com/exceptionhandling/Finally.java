package com.exceptionhandling;

public class Finally {

	public static void main(String[] args) {

		try {
			int sum;

			sum = 100 / 0;

		} catch (Exception e) {
			int sum = 100 / 0;
		} finally {
			int number = 25 * 5;
			System.out.println("hi this is finally : : " + number);
			

		}
		System.out.println("this line should be executed");
	}

}
