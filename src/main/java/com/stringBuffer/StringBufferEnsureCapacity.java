package com.stringBuffer;

/*The ensureCapacity() method of the StringBuffer class ensures that the given capacity is the minimum to the current capacity. 
If it is greater than the current capacity, 
it increases the capacity by (oldcapacity*2)+2. For example if your current capacity is 16, it will be (16*2)+2=34*/

public class StringBufferEnsureCapacity {

	public static void main(String[] args) {

		StringBuffer st = new StringBuffer();
		System.out.println(st.capacity()); // by default capacity 16

		st.ensureCapacity(25); //adding minimum requirement to 25

		System.out.println(st.capacity()); //now capacity is (16*2)+2
	}

}
