package com.io;

import java.io.File;

//Java FileReader class is used to read data from the file. It returns data in byte format like FileInputStream class.

import java.io.FileReader;
import java.io.IOException;

public class FileReaderExample {

	public static void main(String[] args) throws IOException {
		//FileReader(File file)
		//FileReader(String file)
		
		FileReader fr = new FileReader("E:\\MIIT_Misc\\testin.txt");

		//int a = fr.read();
		
		int a = 0;
		while((a = fr.read())!=-1) {
			System.out.print((char)a);
			
		}
		fr.close();
		System.out.println();
		
		File file = new File("E:\\MIIT_Misc\\out1.txt");
		FileReader f = new FileReader(file);
		
		int b =0;
		while((b=f.read())!=-1) {
			System.out.print((char)b);
		}
		
		f.close();
	}

}
