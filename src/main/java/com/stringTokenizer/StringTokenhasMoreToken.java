package com.stringTokenizer;

import java.util.StringTokenizer;

public class StringTokenhasMoreToken {
	
	
	public static void main(String[] args) {
		
		String s = "My name is Purav. His name is Kishan";
		StringTokenizer st = new StringTokenizer(s);
		
		while(st.hasMoreTokens()) { //checking there is token 
			
			System.out.println(st.nextToken()); //printing the token
		}
	}

}
