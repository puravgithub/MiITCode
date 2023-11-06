package com.multithreading;

public class ThreadGroupActiveCount extends Thread {

	public ThreadGroupActiveCount(String threadName, ThreadGroup tGroup) {

		super(tGroup, threadName);
		start();

	}

	public static void main(String[] args) {
		ThreadGroup tg = new ThreadGroup("Transaction");

		ThreadGroup tg2 = new ThreadGroup(tg,"Debit");

		ThreadGroup tg3 = new ThreadGroup(tg2,"Credit");

		ThreadGroupActiveCount tac1 = new ThreadGroupActiveCount("First", tg);
		System.out.println("Starting First Thread using Constructor");

		ThreadGroupActiveCount tac2 = new ThreadGroupActiveCount("Second", tg);
		System.out.println("Starting Second Thread using Constructor");

		// Checking active thread count
		System.out.println("Active threads right now:: " + tg.activeCount()); // checking active thread in group

		System.out.println("Active ThreadGroups :" + tg2.activeGroupCount()); // checking total ThreadGroup is active
																				// right now or not

	}

	@Override
	public void run() {
		System.out.println("Current thread is :: " + Thread.currentThread().getName());
		for (int i = 0; i < 100; i++) {

			try {
				System.out.println(i);
				Thread.sleep(50);
			} catch (InterruptedException e) {

				System.out.println("Exception is occured");
				e.printStackTrace();
			}
		}

	}

}
