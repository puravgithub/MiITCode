package com.io.serialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

//Serialization
public class Persist {

	public static void main(String[] args) throws IOException {
		
		
	
			//Creating an Object
			
			Student student  = new Student(101, "Purav");
		
			FileOutputStream fout = new FileOutputStream("E:\\MIIT_Misc\\serialization.txt");
			
			ObjectOutputStream obj = new ObjectOutputStream(fout);
			
			obj.writeObject(student); //writing(saving the state of) object in serialization.txt file
			obj.flush();
			
			//closing Stream
			obj.close();
			
			System.out.println("Success..");
			

	}

}
