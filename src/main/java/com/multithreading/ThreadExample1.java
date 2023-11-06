package com.multithreading;
// Creating Thread by creating object of thread class
public class ThreadExample1 {
	
	public static void main(String[] args) {
		
		Thread t = new Thread();
		System.out.println(t.getState());
		t.start();
		t.run();
		System.out.println(t.getState());
	}
	
	public void run() {
	
		System.out.println("Thread is running");
	}

}
