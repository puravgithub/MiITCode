package com.synchronization;

public class Customer {

	int amount = 10000;

	synchronized void withdraw(int amount) {
		System.out.println("going to withdraw...");

		if (this.amount < amount) {
			System.out.println("Less balance; waiting for deposit...");
			try {
				wait(10000);  //Thread go to wait state

			} catch (Exception e) {
			}
		}
		this.amount -= amount;
		System.out.println("withdraw completed...current Balance" + this.amount);
	}

	synchronized void deposit(int amount) {
		System.out.println("going to deposit...");
		this.amount += amount;

		for (int i = 0; i < 100; i++) {
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		System.out.println("deposit completed...current balance " + this.amount);
		notify();  //notify keyword inform the waiting thread to resume that current thread execution is done.
	}

}
