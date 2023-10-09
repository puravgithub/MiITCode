package com.innerclass.interface1;

public interface NestedInterface { //outer interface

	public void showable(); //method of outer interface
	
	public interface Msg{ //inner interface
		
		
		//method of inner interface
		public void print();  // Declaring method and implementing in another class
		
	
	}
	
}
