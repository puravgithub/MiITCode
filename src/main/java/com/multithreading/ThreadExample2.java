package com.multithreading;
// Creating Thread by implementing runnable interface

public class ThreadExample2 implements Runnable {

	public static void main(String[] args) {

		ThreadExample2 tx2 = new ThreadExample2();
		Thread th = new Thread(tx2); // Using the constructor Thread(Runnable r)

		System.out.println("Thread Status  : : " + th.getState());

		th.start(); // Start method automatically call run method

		System.out.println("Thread Status  : : " + th.getState());

		th.run();

		System.out.println("Thread Status  : : " + th.getState());

	}

	@Override // run method should be implemented all the time when when thread is created
				// using runnable interface
	public void run() {
		
		for (int i = 0 ; i<10 ; i++) {
		System.out.println("Thread is runnning");
		}

	}

}
