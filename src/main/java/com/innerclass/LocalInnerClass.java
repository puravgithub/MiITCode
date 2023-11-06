package com.innerclass;

public class LocalInnerClass { // Outer class

	private int a = 10; // varible
	private int b = 20; // variable

	public void localMethod() { // outer method

		class InnerClass { // Inner Class

			int Add = a + b; // local variable must be final till jdk 1.7 only

			public void msg() { // inner method
				int sum = a + b; // Local variables can't be private, public, or protected. i.e sum
				System.out.println("Sum of A and B is  :: " + sum);
			}
		}
		InnerClass incl = new InnerClass();
		incl.msg(); // Calling method of inner class in outermethod

	}

	public static void main(String args[]) {
		LocalInnerClass inClass = new LocalInnerClass();
		inClass.localMethod(); // It will also print results from innerclass methods
	}

}
