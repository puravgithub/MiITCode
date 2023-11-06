package com.stringTokenizer;

import java.util.StringTokenizer;

public class StringTokenhasMoreElements {

	public static void main(String[] args) {
		
		//This method returns the same value as hasMoreTokens() method of StringTokenizer class. 
		//The only difference is this class can implement the Enumeration interface.
		
		   StringTokenizer st = new StringTokenizer("Hello everyone I am a Java developer"," ");    
		   
		   while(st.hasMoreElements()) { 
			   
			   System.out.println(st.nextElement());  
			   //nextElement() returns the next token object in the tokenizer String. 
			   //It can implement Enumeration interface.


			   
		   }

	}

}
