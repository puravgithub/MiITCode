package com.multithreading;
//Creating Thread by extending Thread Class

public class ThreadExample extends Thread {

	// IllegalThreadStateException - This exception throws if the start() method is
	// called more than one times.

	public static void main(String[] args) {

		ThreadExample tx = new ThreadExample();
		System.out.println(tx.getState());

		tx.start(); // tx.start();

		System.out.println(tx.getState());

		System.out.println("Thread Started");

		try {
			Thread.sleep(9000);
			System.out.println(tx.getState());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(tx.getState());

	}

	public void run() {
		// run method is method of thread class
		// whatever we write in run method it shows that thread is runnning
		System.out.println("Thread is running....");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
