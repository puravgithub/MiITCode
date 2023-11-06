package com.multithreading;
//sleep() method throws InterruptedException 

//sleep() do not accept nagative time as an argument
public class ThreadSleep extends Thread {

	public void run() {

		try {
			Thread.sleep(5000); // will wait for 5 seconds
			System.out.println(getState());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void main(String[] args) {
		ThreadSleep ts = new ThreadSleep();
		ts.start();  //run method will  automatically run
		
		try {
			Thread.sleep(8000); // will wait for 6 seconds 
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(ts.getState()); //Thread will be terminated before this line is executed
	

	}

}
