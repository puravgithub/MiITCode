package com.stringMethods;

public class StringLastIndexOf {
	public static void main(String[] args) {
		
		
		String name = "My name is khan. My name is khan";
		
		System.out.println(name.lastIndexOf('s')); //It gives location of last's' in String
		System.out.println(name.lastIndexOf("is"));//It gives location of last'is' in String
		System.out.println(name.lastIndexOf('a', 10));  // find 'a' from first 10 index
		System.out.println(name.lastIndexOf("ha", 25)); //find 'ha' from first 25 index
		
		
		System.out.println(name.lastIndexOf("Khan",15)); //-1 result when do not find the requested value 
	}

}
