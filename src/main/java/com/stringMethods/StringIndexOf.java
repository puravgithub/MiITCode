package com.stringMethods;

public class StringIndexOf {

	public static void main(String[] args) {

		String index = "This is String index of example";
		
		System.out.println(index.length()); //finding length of above mentioned string
		
		System.out.println("displaying the index where e is located in string : "+index.indexOf("e")); //	int indexOf(int ch)
		
		System.out.println("finding 'of' in string and displaying first index : "+index.indexOf("of")); //int indexOf(String substring)
		// it gives the value from which the mentioned character start

		
		System.out.println("finding 'ex' but skipping first 19 characters cause start index with 19 : "+index.indexOf("ex",19)); 
		//int indexOf(String substring, int fromIndex)
		
		
		
		
		
	}

}
