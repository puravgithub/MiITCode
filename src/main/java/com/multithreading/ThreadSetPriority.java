package com.multithreading;

//The thread's priority is in the range of 1 to 10.

//execution is also depends on arrival time

public class ThreadSetPriority extends Thread {

	public void run() {



		System.out.println(Thread.currentThread().getName()); // will display current thread name
		System.out.println("Priority : :" + Thread.currentThread().getPriority());
		

	}

	public static void main(String[] args) {
		ThreadSetPriority sp1 = new ThreadSetPriority();
		sp1.setPriority(Thread.MIN_PRIORITY); // setting minimum priority 1

		ThreadSetPriority sp2 = new ThreadSetPriority();
		sp2.setPriority(Thread.MAX_PRIORITY); // setting maximum priority 10

		ThreadSetPriority sp3 = new ThreadSetPriority(); // it has default priority 5

		ThreadSetPriority sp4 = new ThreadSetPriority();
		sp4.setPriority(9); //created priority 6  can not give more than 10 otherwise will give exception IllegalArgumentException

		sp1.start();
	
	
		sp2.start();
		
		sp3.start();
	
		sp4.start();
		
		
		System.out.println("Thread Status :" + sp1.getState());
		

	}

}
