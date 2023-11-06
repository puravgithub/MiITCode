package com.stringMethods;
// CompareTo method gives result in integer
// All letters are compared where it stands in ABCD..Z from current comparison 
public class StringCompareTo {

	public static void main(String[] args) {


		String name1 = "Purav";
		String name2 = "Purav" ;
		String name3 ="Kishan";
		String name4 = "Xebra";
		
		System.out.println(name1.compareTo(name2)); // will return p-p u-a r-t a-e v-l
		System.out.println(name3.compareTo(name4)); // will return integer value which is from K to Z
				

	}

}
