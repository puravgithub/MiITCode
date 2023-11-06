package com.io.serialization;

import java.io.Serializable;

public class Member implements Serializable {

	 int id;    
	 String name;    
	 transient int age;//Now it will not be serialized    
	 
	 public Member(int id,String name, int age) {
		 
		  this.id = id;    
		  this.name = name;    
		  this.age=age;    
	 }
}
