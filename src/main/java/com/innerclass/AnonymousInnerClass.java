package com.innerclass;

/*It should be used if you have to override a method of class or interface.*/

/*Java Anonymous inner class can be created in two ways:

Class (may be abstract or concrete).
Interface*/


//Outer Class
public class AnonymousInnerClass {

	//Outer Method
	public static void main(String[] args) {
		
		//Inner Class --> Below we created  AnonymousInnerClass which is already abstract class
		Anonymous any = new Anonymous() {
			
			//@Override
			void anonymousMethod() {
				System.out.println("this method is created in abstract anonymous class ");
				
			}
		};
		
		any.anonymousMethod(); //calling method from Anonymous class (inner Class)

	}

}
