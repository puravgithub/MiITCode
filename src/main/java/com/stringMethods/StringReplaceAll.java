package com.stringMethods;

//public String replaceAll(String regex, String replacement)  


public class StringReplaceAll {

	public static void main(String[] args) {
		String str = "this is package.this is class.this is method.this is String";
		
		String rplcStr = str.replace("is", "was"); //using replace()
		System.out.println(str);
		System.out.println(rplcStr); 
		
		 rplcStr = str.replaceAll("is", "was"); //using replaceAll()
		 
		 System.out.println(rplcStr);
		 
		 rplcStr = str.replaceAll("\\s", ""); //replacing Regex
		
		 
		 System.out.println(rplcStr);
		

	}

}
