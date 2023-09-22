package com.innerclass;

import com.innerclass.OuterClass.StaticInnerClass;

public class Main  {
	
	public static void main(String[] args) {
		OuterClass out = new OuterClass();  // Creating instance of Outer Class
		OuterClass.InnnerClass inn = out.new InnnerClass() ;  // Creating instance of InnerClass(non-static)
		
		
		out.methodOfOuterClass();  // Calling method of outer class
		inn.getName(); // Calling method of inner class
		
		// Calling method from static Inner Class  
		OuterClass.StaticInnerClass statInn = new StaticInnerClass(); //no need of OuterClass Object for Static Class
		statInn.getStaticName();
		
		
		
		
		University mainUni = new University();
		University.MechanicalDep mechDep = mainUni.new MechanicalDep();  // Instantiate Mechanical Department
		mechDep.facultyName(); // Calling method from inner class
		University.Civil cvl = mainUni.new Civil();
		cvl.facultyName(); // Calling method from inner class
		
		mainUni.getfacultyname(); // Calling method (outer method) from outer class
		
		

	}
	

}
