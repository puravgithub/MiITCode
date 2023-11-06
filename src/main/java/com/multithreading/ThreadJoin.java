package com.multithreading;

/*
 * public final void join()throws InterruptedException  
public void join(long millis)throwsInterruptedException  
public final void join(long millis, int nanos)throws InterruptedException  

*/

public class ThreadJoin extends Thread {

	public void run() {

		for (int i = 1; i <= 4; i++) { // for loop
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				System.out.println(e);
			}
			System.out.println(getName());
			System.out.println(i);
		}
	}

	public static void main(String[] args) {

		ThreadJoin td1 = new ThreadJoin();

		ThreadJoin td2 = new ThreadJoin();

		ThreadJoin td3 = new ThreadJoin();

		// thread t1 starts
		td1.start();

		// starts second thread when first thread td1 is died.
		try {
			td1.join();
		} catch (Exception e) {
			System.out.println(e);
		}
		// start t2 and t3 thread
		td2.start();
	
		td3.start();

	}

}
