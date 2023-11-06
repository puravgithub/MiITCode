package com.stringMethods;

/*
 * public String split(String regex)  
and,  
public String split(String regex, int limit)  
*/
public class StringSplit {

	public static void main(String[] args) {
		
		String s = "This:is:String:This:Class:This:is:example:ofSplit";
		
		String[] words = s.split(":"); //returns more than one string so declaring array
		
		//using java foreach loop to print elements of string array  
		for (String splitwords : words) {
			
			
			System.out.println(splitwords);
			
		}
		
	
		
		 words = s.split(":",4);  //limiting split. it will split the string only for 4 times
		
		 System.out.println("Split after limiting::");
		for (String limitsplit : words) {
			System.out.println(limitsplit);
		}
		

	}

}
