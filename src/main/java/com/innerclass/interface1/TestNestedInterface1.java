package com.innerclass.interface1;
import com.innerclass.*;

// Interface is nested in Class. Now calling method from Nested Interface
public class TestNestedInterface1 implements NestedInterfaceInClass.InterfaceInClass,OuterClass.iCallable {

	@Override
	public void Msg() {

		System.out.println("This method is implemented from interface which is inside a Class");

	}

	public static void main(String[] args) {

		TestNestedInterface1 test1 = new TestNestedInterface1();
		test1.Msg();
		
		// Calling method from another package which is defined in interface and nested in class
		test1.display();
		
	}

	@Override
	public void display() {
	
		System.out.println("This method is defined in another package com.innerclass>OuterClass>iCallable");
		
	}

}
