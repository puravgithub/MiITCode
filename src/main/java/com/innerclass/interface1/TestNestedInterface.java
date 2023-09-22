package com.innerclass.interface1;

public class TestNestedInterface implements NestedInterface.Msg,NestedInterface{

	@Override
	public void print() {
	
		System.out.println("This line is method is implemented from Msg Interface NestedInterface>Msg Interface");
	
		
	} // want to implement method of inner interface
	
	@Override
	public void showable() {
		System.out.println("This method is defined in Outer Interface");
		
	}
	
	public static void main(String[] args) {
		TestNestedInterface test = new TestNestedInterface();
		test.print();  //calling method from NestedInterface.Msg
		
		test.showable(); // Calling method from NestedInterface
	}



}
