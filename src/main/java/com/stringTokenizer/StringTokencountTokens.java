package com.stringTokenizer;

import java.util.StringTokenizer;

public class StringTokencountTokens {

	public static void main(String[] args) {
		
		/* StringTokenizer object */  
		StringTokenizer st = new StringTokenizer("Hello everyone .! This keyword will count number of tokens");
				
				System.out.println(st.countTokens()); //It will count tokens and print integer value

	}

}
