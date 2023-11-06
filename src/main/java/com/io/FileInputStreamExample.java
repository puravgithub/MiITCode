package com.io;

import java.io.FileInputStream;
import java.io.IOException;

//public class FileInputStream extends InputStream  

public class FileInputStreamExample {

	public static void main(String[] args) throws IOException {
		FileInputStream fin = new FileInputStream("E:\\MIIT_Misc\\testout.txt");
		int i = fin.read();
		System.out.println((char)i);  //will read only first character from testout file
		
		//using below code we can read whole file
		i=0;
		
		while((i=fin.read())!=-1) {
		
			System.out.print((char)i);
			
		}
		
		fin.close();
		
		
		
	}

}
