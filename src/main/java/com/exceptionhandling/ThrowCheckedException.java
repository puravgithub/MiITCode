package com.exceptionhandling;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ThrowCheckedException {

	public static void method() throws FileNotFoundException {
		FileReader fd = new FileReader(
				"E:\\FullStackDevJavaTraining\\MiITTech\\src\\main\\java\\com\\exceptionhandling\\abc.txt");
		BufferedReader fileInput = new BufferedReader(fd);
		throw new FileNotFoundException();
	}

	public static void main(String[] args) {
		try {
			method();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}

		System.out.println("Execution rest of code");
	}

}
