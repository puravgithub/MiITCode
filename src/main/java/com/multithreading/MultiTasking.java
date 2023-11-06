package com.multithreading;

//If you have to perform a single task by many threads, have only one run() method
///Program of performing single task by multiple threads
public class MultiTasking extends Thread{
	
	public void run() {	
		System.out.println("Task one");
	}
	

	public static void main(String[] args) {
		MultiTasking m1 = new MultiTasking();
		MultiTasking m2 = new MultiTasking();
		MultiTasking m3 = new MultiTasking();
		
		m1.start();
		m2.start();
		m3.start();

	}

}
