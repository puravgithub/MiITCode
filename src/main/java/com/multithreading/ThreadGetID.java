package com.multithreading;
//getting ID of current thread which is running 
public class ThreadGetID  extends Thread{
	
	public void run() {
		System.out.println("Thread is running..." +currentThread().getId());
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

	public static void main(String[] args) {
		ThreadGetID id = new ThreadGetID();
		id.start();
		/*
		 * id.stop(); id.resume();
		 */
		
		ThreadGetID id1 = new ThreadGetID();
		id1.start();
		

	}

}
