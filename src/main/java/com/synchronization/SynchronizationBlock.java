package com.synchronization;

//Synchronized block can be used to perform synchronization on any specific resource of the method.

/*syntax :
 * synchronized (object reference expression) {     
	  //code block     
	}    
*/
public class SynchronizationBlock {

	public static void main(String[] args) {
		
		
		Table t = new Table();
		
		Block1 b1 = new Block1(t);
		
		Block2 b2 = new Block2(t);
		
		b1.start();
		b2.start();

	}

}
