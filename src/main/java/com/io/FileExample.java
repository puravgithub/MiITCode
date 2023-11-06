package com.io;

import java.io.File;
import java.io.IOException;

//The File class is an abstract representation of file and directory pathname. A pathname can be either absolute or relative.

public class FileExample {

	public static void main(String[] args) throws IOException {

		File file = new File("createdFile.txt");

		file.createNewFile();

		System.out.println(file);
		System.out.println(file.canRead()); // checking that created file is readable
		System.out.println(file.canWrite()); // checking that created file is writable

		// creating new canonical from file object
		File file2 = file.getCanonicalFile();
		// returns true if the file exists
		System.out.println(file2);
		boolean bool = file2.exists();
		// returns absolute pathname
		String path = file2.getAbsolutePath();
		System.out.println(bool);
		// if file exists
		if (bool) {
			// prints
			System.out.print(path + " Exists? " + bool);
		}
	}

}
