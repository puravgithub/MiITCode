package com.io;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class BufferInputStreamExample {

	public static void main(String[] args) {
	
		//syntax for buffered input stream
		//constructor
		//BufferedInputStream(InputStream IS)
		//BufferedInputStream(InputStream IS, int size)
		
		
		try {
			FileInputStream fi = new FileInputStream("E:\\MIIT_Misc\\testout.txt");
			
			BufferedInputStream bfi = new BufferedInputStream(fi);
			
			int a = bfi.read();
			char c = (char)a; //converting read data to char
			
			System.out.print(c);
			
			a= 0;
			while((a=bfi.read())!=-1) {
				c =(char)a;
				System.out.print(c);
			}
			System.out.println();
			System.out.println("success");
			
			bfi.close();
			fi.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
