package com.synchronization;

public class InterThread2 extends Thread {

	Customer c;

	public InterThread2(Customer c) {
		this.c = c;
	}

	public void run() {

		//Customer customer = new Customer();
		c.withdraw(15000);
	}
}
