package com.io.serialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

//Saving state of object in file
public class IsRelationSerialization {

	public static void main(String[] args) throws IOException {
		
		
		Employee emp = new Employee(01, "Purav", "Java", 1500);
		
		//Creating stream and writing the object    
		  FileOutputStream fout=new FileOutputStream("E:\\MIIT_Misc\\serialization.txt");    
		  ObjectOutputStream out=new ObjectOutputStream(fout);    
		  out.writeObject(emp);    
		  out.flush();    
		  //closing the stream    
		  out.close();    
		  System.out.println("success");    

	}

}
