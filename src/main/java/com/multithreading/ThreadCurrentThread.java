package com.multithreading;
// cuurentThread() It returns the currently executing thread.
//getName() It returns name of the thread
public class ThreadCurrentThread extends Thread {

	public static void main(String[] args) {

		ThreadCurrentThread thread1 = new ThreadCurrentThread();
		thread1.start();
		thread1.setName("First Thread");

		ThreadCurrentThread thread2 = new ThreadCurrentThread();
		thread2.start();
		thread2.setName("Second Thread");

		ThreadCurrentThread thread3 = new ThreadCurrentThread();

		thread3.start();
		thread3.setName("Third Thread");

	}

	@Override
	public void run() {

		System.out.println(Thread.currentThread().getName());
	}

}
