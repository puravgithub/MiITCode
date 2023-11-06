package com.stringMethods;


/*public String substring(int startIndex)  // type - 1  
and    
public String substring(int startIndex, int endIndex)  // type - 2  
*/

public class SubString {

	
	public static void main(String[] args) {
		
		
		String name = "This is purav patel. This is Kishan. This is class";
		
		System.out.println(name.substring(10));
		
		System.out.println(name.substring(5, 15));
		
		//sub string can throw StringIndexOutOfBoundsException 
	}
}
