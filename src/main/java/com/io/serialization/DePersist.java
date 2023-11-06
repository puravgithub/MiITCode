package com.io.serialization;

import java.io.FileInputStream;
import java.io.IOException;

import java.io.ObjectInputStream;

//DeSerialization

public class DePersist {

	public static void main(String[] args) throws Exception {
		
		
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("E:\\MIIT_Misc\\serialization.txt")) ;
		
		Student s = (Student)ois.readObject(); //reading Student Class Object which we save in file using serialization
		
		 //printing the data of the serialized object  
		  System.out.println(s.id+" "+s.name);   //will get Exception if object is compromised in file.
		  
		  //closing stream
		  ois.close();

		
	}

}
