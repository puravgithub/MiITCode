package com.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.SequenceInputStream;

public class SequenceInputStreamExample {

	public static void main(String[] args) throws IOException {
		// constructor
		// SequenceInputStream(InputStream s1, InputStream s2)
		
		FileInputStream input1 = new FileInputStream("E:\\MIIT_Misc\\testin.txt"); 
		
		FileInputStream input2 = new FileInputStream("E:\\MIIT_Misc\\testout.txt");
		
		FileOutputStream output1= new FileOutputStream("E:\\MIIT_Misc\\seqout.txt");
		
		SequenceInputStream seqIn = new SequenceInputStream(input1, input2);
		
		int a = 0;
		
		while ((a = seqIn.read())!= -1) {
			System.out.print((char)a); //reading and printing all from both files
			output1.write((byte)a); //converting int to byte and writing in another file
			
			
		}
		System.out.println();
		System.out.println("success..");
		seqIn.close();
		input1.close();
		input2.close();
		output1.close();

	}

}
