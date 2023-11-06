package com.multithreading;

//This class is created for shutdown hook 

public class MyThread extends Thread {

	public void run() {
		//getting name of executing thread
		System.out.println(Thread.currentThread().getName());
		System.out.println("shut down hook task completed..");
	}
}
