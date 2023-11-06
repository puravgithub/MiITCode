package com.io.serialization;

import java.io.Serializable;

//The Serializable interface must be implemented by the class whose object needs to be persisted.


public class Student implements Serializable {
	public int id ;
	public String name ;
	
	public Student(int Id, String name) {
		
		this.id = Id ;
		this.name = name;
	}

}
