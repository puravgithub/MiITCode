package com.multithreading;

//Daemon Thread is background thread which runs in background with user thread (user Thread : thread which is created by us)
//Daemon Thread is low priority thread which runs parallel with user thread
// Daemon thread automatically dies after the execution of user thread dies
// Example of DaemonThread : garbage collector(gc()) runs in background while executing code

// we can not make user thread a Daemon Thread otherwise it will give an exception
//If you want to make a user thread as Daemon, it must not be started otherwise it will throw IllegalThreadStateException.

public class ThreadDaemon extends Thread{
	
	//isDaemon() : method to check that current thread is daemon or not
	public void run() {
		if(Thread.currentThread().isDaemon()) {
			System.out.println(Thread.currentThread().getName() +" is Daemon");
		}
		else
		{
			System.out.println(Thread.currentThread().getName() + " is not a Daemon");
		}
		
	}

	public static void main(String[] args) {
		
		ThreadDaemon td1 = new ThreadDaemon();
		ThreadDaemon td2 = new ThreadDaemon();
		ThreadDaemon td3 = new ThreadDaemon();
		
		//main thread check for daemon
		if(Thread.currentThread().isDaemon())
		{
			System.out.println(Thread.currentThread().getName() + "is Daemon");
		}
		else {
			System.out.println(Thread.currentThread().getName() + "is not Daemon");
		}
		
		//setDaemon() is method to set any user thread to daemon
		
		td2.setDaemon(true); //setting thread -1 a Daemon Thread
		
		//starting threads
		td1.start();
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		td2.start();
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		td3.start();
		
		//td3.setDaemon(true);  //setting thread a Daemon after starting is throw IllegalThreadStateException
		

	}

}
