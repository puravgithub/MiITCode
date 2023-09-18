package com.innerclass;

public class OuterClass {
//This is OuterClass
	private int number = 50 ;
	
	public void methodOfOuterClass () {
		System.out.println("This method is in outer class");
		
		 class ClassInOuterMethod{
			// Local Inner Class --	A class was created within the method.
		}
	}
	
	
	public class InnnerClass {
		//above class is non-static nested Class
		//This is innerClass (Class into Class) -- Nested Class
		
		
		public void getName() {
			System.out.println("This line from InnerClass --> Inner Method" + number);
		}

	}
	
	static class StaticInnerClass{
		// Above class is static nested class
		
		public void getStaticName() {
			
			System.out.println("This line is from Static Inner Class -- > Inner Method");
		}
	}
	
	
	interface iCallable {
		// Nested Interface --An interface created within class or interface.
	}

}
