package com.io;

import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

//Java ByteArrayOutputStream class is used to write common data into multiple files. 
//In this stream, the data is written into a byte array which can be written to multiple streams later.

public class ByteArrayOutPutStreamExample {

	public static void main(String[] args) throws IOException {

		FileOutputStream out1 = new FileOutputStream("E:\\MIIT_Misc\\out1.txt");

		FileOutputStream out2 = new FileOutputStream("E:\\MIIT_Misc\\out2.txt");
		
		ByteArrayOutputStream byteOut = new ByteArrayOutputStream(); //creating object
		
		byteOut.write(100); //ASCII for byte
		byteOut.writeTo(out1); //passing of fileoutput Stream
		byteOut.writeTo(out2); //passing another file object to write same thing
		
		
		byteOut.close();
		System.out.println("\nsuccess");
		
	}

}
