package com.io;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamExample {

	public static void main(String[] args) throws IOException {
		
		FileOutputStream fout=new FileOutputStream("E:\\MIIT_Misc\\testout.txt");  
		fout.write(65); //will write ascii char in file which is A for 65
	
		
		System.out.println("Success...");
		
		
		String s = "String wanted to insert in .txt file ";
		
		//if we want to write string value in file we need to convert it to byte array cause it accepts only byte values
		
		byte b[] = s.getBytes();  //converting string to byte array
		fout.write(b);
		
		System.out.println("Success..inserted string in file");
		
		fout.close();
		

	}

}
