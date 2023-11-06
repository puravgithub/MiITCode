package com.io.serialization;

public class Employee extends Person {

	String course;    
	 int fee;    
	 //static Data member can not be serialized
	 static String company="SSS IT Pvt Ltd";//it won't be serialized  
	 
	 public Employee(int id, String name, String course, int fee) {    
	  super(id,name);    
	  this.course=course;    
	  this.fee=fee;    
	 }    
}
