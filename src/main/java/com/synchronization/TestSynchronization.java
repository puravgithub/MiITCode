package com.synchronization;

public class TestSynchronization {
	
	public static void main(String[] args) {
		
		Table tb = new Table(); //only one object
		
		Thread1 t1 = new Thread1(tb); //Shared tb object
		Thread2 t2 = new Thread2(tb); //shared tb object
		
		//here when tb object is executing printTable() method object is locked and finish first thread, 
		//becuase we have used synchronized keyword for method
		
		
		t1.start();
		t2.start();
	}

}
