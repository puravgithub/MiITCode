package com.innerclass;

public class StaticNestedClass { // Outer class

	static int a = 50;  //global variables using in static class must be defined as static
	private static String name;
	
	//using encapsulation for understanding
	public static String getName() {
		return name;
	}


	public static void setName(String name) {
		StaticNestedClass.name = name;
	}


	public static class InnerClass { // Static Inner Class
		void staticInstaceInnerMethod() {
			System.out.println("This method is non - Static in Inner Class");
			System.out.println("Enroll No :: " + a + "student Name :: " + name);
		}

		static void staticInnerMethod() {
			System.out.println("This method is  Static and inside Static class and It is inside Outer Class");
			System.out.println("Enroll No :: " + a + "student Name :: " + name);
		}
	}

	
	public static void main(String[] args) {
		
		setName("purav");
		//calling static methods from Static Inner Class
		StaticNestedClass.InnerClass statInc = new StaticNestedClass.InnerClass(); //syntax of calling static class
		statInc.staticInstaceInnerMethod(); // calling non static method from static class
		
		
		StaticNestedClass.InnerClass.staticInnerMethod();  //no need to create the instance of static method of static nested class  
		
	}
}
