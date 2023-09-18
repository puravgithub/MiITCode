package com.innerclass;
/*A non-static class that is created inside a class but outside a method is called member inner class. 
It is also known as a regular inner class*/

public class MemberInnerClass { // Outer Class

	int data = 50 ;
	public class InnerClass{ // Inner Class
		public void getData() {
			System.out.println("Data from Member Inner Class data from(OuterClass)  : :" + data);
		}
	}
	
	public static void main(String[] args) {
		MemberInnerClass memClass = new MemberInnerClass();
		MemberInnerClass.InnerClass memIn = memClass.new InnerClass();
		
		System.out.println("Below Line is from Member Inner Class which use data of Outer Class : :");
		memIn.getData();

	}

}
