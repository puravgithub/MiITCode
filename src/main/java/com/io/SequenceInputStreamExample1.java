package com.io;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.SequenceInputStream;
import java.util.Enumeration;
import java.util.Vector;

//SequenceInputStream using Enumeration
//Please check Enumeration on tutorial and refer this program

//Here we are getting details from multiple files(more than two) and trying to print here
public class SequenceInputStreamExample1 {

	public static void main(String[] args) throws IOException {

		FileInputStream input1 = new FileInputStream("E:\\MIIT_Misc\\a.txt");
		FileInputStream input2 = new FileInputStream("E:\\MIIT_Misc\\b.txt");
		FileInputStream input3 = new FileInputStream("E:\\MIIT_Misc\\c.txt");
		FileInputStream input4 = new FileInputStream("E:\\MIIT_Misc\\d.txt");

		Vector<FileInputStream> v = new Vector<>();
		v.add(input1);
		v.add(input2);
		v.add(input3);
		v.add(input4);

		// creating enumeration object by calling the elements method
		Enumeration<FileInputStream> e = v.elements();

		// passing the enumeration object in the constructor
		SequenceInputStream bin = new SequenceInputStream(e);

		int a = 0;
		while ((a = bin.read()) != -1) {
			System.out.print((char) a);
		}
		System.out.println();
		System.out.println("sucess..");
		bin.close();
		input1.close();
		input2.close();
		input3.close();
		input4.close();
	}

}
