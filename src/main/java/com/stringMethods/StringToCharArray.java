package com.stringMethods;

public class StringToCharArray {

	public static void main(String[] args) {


		String name = "Kishan";
		
		char[] ch = name.toCharArray(); //ToCharArray converts String into CharArray
		
		for (int i = 0 ;i<ch.length;i++) {
			System.out.println(ch[i]);
		}

	}

}
