package com.multithreading;
//In java, garbage means unreferenced objects.

/*How can an object be unreferenced?
There are many ways:

By nulling the reference
By assigning a reference to another
By anonymous object etc.*/

//It is automatically done by the garbage collector(a part of JVM) so we don't need to make extra efforts.

/*finalize() method
The finalize() method is invoked each time before the object is garbage collected. 
This method can be used to perform cleanup processing. This method is defined in Object class */

/*gc() method
The gc() method is used to invoke the garbage collector to perform cleanup processing.
The gc() is found in System and Runtime classes.
*/
public class GarbageCollection {
	
	
	public void finalize() {
		System.out.println("object is garbage collected");
	}

	public static void main(String[] args) {

		// By nulling a reference:
		GarbageCollection g = new GarbageCollection();
		g = null;

		// By assigning a reference to another:
		GarbageCollection g1 = new GarbageCollection();
		GarbageCollection g2 = new GarbageCollection();
		g1 = g2;

		// By anonymous object:
		new GarbageCollection();
		
		System.gc();

	}

}
