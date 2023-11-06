package com.multithreading;

//yield() : It causes the currently executing thread object to pause and allow other threads to execute temporarily.

public class ThreadYield extends Thread {

	public void run() {
		for (int i = 0; i < 3; i++) {

			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("Current thread Execution ::" + Thread.currentThread().getName());
		}

	}

	public static void main(String[] args) {

		ThreadYield ty1 = new ThreadYield();
		ThreadYield ty2 = new ThreadYield();
		// below lines will call run methods
		ty1.start();
		ty2.start();
	
		for (int i = 0; i < 3; i++) {
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			// Control passes to child thread
			ty1.yield();
		 //Thread-0 paused while executing Thread-1

			System.out.println(Thread.currentThread().getName() + " in control");
		}
		
	
		
	}

}
