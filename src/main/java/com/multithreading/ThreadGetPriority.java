package com.multithreading;

//The thread's priority is in the range of 1 to 10. The default priority of a thread is 5.

public class ThreadGetPriority extends Thread {
	
	public void run() {
		System.out.println("Thread Name :: " +Thread.currentThread().getName());
		System.out.println("Current running thread priority : = "+Thread.currentThread().getPriority());
	}

	public static void main(String[] args) {
		
		ThreadGetPriority p1 = new ThreadGetPriority();
		
		
		ThreadGetPriority p2 = new ThreadGetPriority();
	
		
		ThreadGetPriority p3 = new ThreadGetPriority();
		
		p1.start();
		p2.start();
		try {// once thread2 will end after that thread3 will start
			p2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		p3.start();
	}

}
