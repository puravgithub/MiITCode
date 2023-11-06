package com.io;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferOutputStreamExample {

	public static void main(String[] args) {

		// syntax of buffered output stream
		// OutputStream os= new BufferedOutputStream(new FileOutputStream("D:\\IO
		// Package\\testout.txt"));

		// constructors
		// BufferedOutputStream(OutputStream os)
		// BufferedOutputStream(OutputStream os, int size)

		try {
			FileOutputStream fout = new FileOutputStream("E:\\MIIT_Misc\\testout.txt");

			BufferedOutputStream bfout = new BufferedOutputStream(fout);

			String s = "Writing using buffered output stream class";
			byte a[] = s.getBytes();

			bfout.write(a);
			bfout.flush();  //will remove all from file
			
			System.out.println("Success");
			
			bfout.close();
			fout.close();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
