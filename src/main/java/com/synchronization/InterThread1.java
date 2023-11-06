package com.synchronization;

public class InterThread1 extends Thread {
	
	  Customer c; public InterThread1(Customer c) { this.c = c ; }
	 
	
	public void run() {
		//Customer customer = new Customer();
		c.deposit(2000);
	}

}
