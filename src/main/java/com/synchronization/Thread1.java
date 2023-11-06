package com.synchronization;

public class Thread1 extends Thread{
	
	Table t;  //aggregation concept
	
	public Thread1(Table t) {
		
		this.t =t;
		
	}
	
	public void run() {
		t.printTable(5); //we are passing value for printable method
		
	}

}
