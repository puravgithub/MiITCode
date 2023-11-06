package com.io;

import java.io.File;

public class FileExampleRelativePath {

	public static void main(String[] args) {
		File file = new File("D:\\Canada_Immigration\\01_Study_Permit_Extension\\Documents"); //getting all file details from given path
		
		String filenames[] = file.list();
		
		for(String filename : filenames) {
			System.out.println(filename +" "+ filename.length());  //displaying each file and folder for given relative path for file
			
		}
	}

}
