package com.multithreading;

import java.io.IOException;

/*Java Runtime class is used to interact with java runtime environment. 
Java Runtime class provides methods to execute a process, invoke GC, get total and free memory etc. 
There is only one instance of java.lang.Runtime class is available for one java application.

The Runtime.getRuntime() method returns the singleton instance of Runtime class.*/

public class RuntimeExample {

	public static void main(String[] args) throws IOException {

		//exec() method
		  Runtime.getRuntime().exec("notepad");//will open a new notepad  
		 // Runtime.getRuntime().exec("Photos");

		  System.out.println(Runtime.getRuntime().availableProcessors());  //availableProcessors()
	}

}
