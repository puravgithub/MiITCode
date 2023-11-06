package com.io.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

//refer Member Class for reference
public class TransientKeywordExample {

	public static void main(String[] args) throws IOException, ClassNotFoundException {

		Member member = new Member(105, "Purav", 30);

		FileOutputStream fout = new FileOutputStream("E:\\MIIT_Misc\\out2.txt");

		ObjectOutputStream out = new ObjectOutputStream(fout);

		out.writeObject(member);

		System.out.println("Success...");

		FileInputStream fin = new FileInputStream("E:\\MIIT_Misc\\out2.txt");
		ObjectInputStream objin = new ObjectInputStream(fin);

		Member m = (Member) objin.readObject();

		System.out.println(m.id + " "+m.name+" "+m.age); //age is retrieved as 0 cause it is defined using Transient Keyword

		System.out.println("Success..");

	}

}
