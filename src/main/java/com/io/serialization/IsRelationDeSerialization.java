package com.io.serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

//Retrieving object from file
public class IsRelationDeSerialization {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		
		
		  //Creating stream to read the object    
		  ObjectInputStream in=new ObjectInputStream(new FileInputStream("E:\\MIIT_Misc\\serialization.txt"));    
		  Employee s=(Employee)in.readObject();    
		  //printing the data of the serialized object    
		  System.out.println(s.id+" "+s.name+" "+s.course+" "+s.fee);    
		  //closing the stream    
		  in.close();    

	}

}
