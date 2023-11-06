package com.io;

import java.io.Console;

/*The Java Console class is be used to get input from console. It provides methods to read texts and passwords.
If you read password using Console class, it will not be displayed to the user.*/

public class ConsoleExample {

	public static void main(String[] args) throws InterruptedException {
		try {
			
			System.out.println("Enter your name: ");
			Thread.sleep(2000);
			Console c = System.console();
			String n = c.readLine();
			System.out.println("Welcome " + n);
			  
			System.out.println("Enter password: ");    
			char[] ch=c.readPassword();    
			String pass=String.valueOf(ch);//converting char array into string    
			System.out.println("Password is: "+pass);    
		} catch (NullPointerException e) {
			e.printStackTrace();
		}

	}

}
