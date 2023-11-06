package com.io;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

//Java FileWriter class is used to write character-oriented data to a file. 
//Unlike FileOutputStream class, you don't need to convert string into byte array because it provides method to write string directly.

public class FileWriterExample {

	public static void main(String[] args) throws IOException {
		//FileWriter(String file) -directly write path where file is located
		//FileWriter(File file) - pass the object of file path
		
		FileWriter fw = new FileWriter("E:\\MIIT_Misc\\out1.txt"); //passing String path of file as argument
		fw.write("Filewriter Example where you can directly write in file without converting to char[] array");
		fw.close();
		
	File file = new File("E:\\MIIT_Misc\\out2.txt");
	FileWriter fw1 = new FileWriter(file); //passing file object as an argument
	fw1.write("This line is written using file object");
	
	fw1.close();
	
	System.out.println("Success...");
		

	}

}
