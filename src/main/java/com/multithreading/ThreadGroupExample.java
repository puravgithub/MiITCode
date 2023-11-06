package com.multithreading;

public class ThreadGroupExample implements Runnable {

	@Override
	public void run() {

		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		System.out.println("Running Thread : :" + Thread.currentThread().getName());

	}

	public static void main(String[] args) {

		ThreadGroupExample classObj = new ThreadGroupExample();

		ThreadGroup groupObj = new ThreadGroup("Parent - Group of Thread"); // declared parent Thread now i can add
																			// Threads to it.

		Thread t1 = new Thread(groupObj, classObj, "one");
		// Thread(ThreadGroup group, Runnable target, String name)
		
		t1.start();
		
		Thread t2 = new Thread(groupObj, classObj, "two");
		t2.start();
		
		Thread t3 = new Thread(groupObj, classObj, "three");
		t3.start();

		
		System.out.println("Thread Group contains mentioned Threads :: "+groupObj.getName());
		groupObj.list();
	}
}
