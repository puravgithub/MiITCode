package com.stringBuffer;

public class StringBufferDelete {

	public static void main(String[] args) {


		StringBuffer del = new StringBuffer("Some word will be deleted using delete method of Stringbuffer Class");
		
		del.delete(10, 20); //from index 10 to 20 will be deleted
		
		System.out.println(del);

	}

}
