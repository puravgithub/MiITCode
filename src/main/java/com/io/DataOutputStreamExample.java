package com.io;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataOutputStreamExample {
	
	public static void main(String[] args) throws IOException {
		
		
		  FileOutputStream file = new FileOutputStream("E:\\MIIT_Misc\\testout.txt");  
	        DataOutputStream data = new DataOutputStream(file);  
	        data.writeInt(65);  
	        
	        data.writeByte(100);
	        data.writeBoolean(true);
	        System.out.println(data.size());
	      //  data.flush();  
	        data.close();  
	        System.out.println("Succcess...");  
	}

}
