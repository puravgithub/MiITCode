package com.stringBuffer;

public class StringBufferReplace {

	public static void main(String[] args) {
		
		
		StringBuffer str = new StringBuffer("This is Class with example of StringBuffer replace");
		
		str.replace(5, 25,"Replaced"); // 5-25 charcters removed with "Replaced"
		
		System.out.println(str);

	}

}
