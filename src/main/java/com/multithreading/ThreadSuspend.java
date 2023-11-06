package com.multithreading;

public class ThreadSuspend extends Thread {
	
	
	public void run() { //Thread class method
		
		for(int i= 0 ;i<5; i++) {
			
			try {
				sleep(1000);
				System.out.println(Thread.currentThread().getName());
				//System.out.println(currentThread().getState());
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(i);
		}
		
	}
	


	public static void main(String[] args) {
		ThreadSuspend ts1 = new ThreadSuspend(); // created thread1
	
		ThreadSuspend ts2 = new ThreadSuspend(); //created thread2
		
		ThreadSuspend ts3 = new ThreadSuspend(); //created thread3
		
		ThreadSuspend ts4 = new ThreadSuspend(); //created thread3
		
		
		
		ts1.start(); //starting thread1
		
		ts2.start(); //starting thread2
		ts2.suspend(); //Suspending thread2
		
		ts3.start(); //starting thread3
		
		ts2.resume();
		
		ts4.stop(); //stoping the execution of thread4
		
		

	}

}
