package com.multithreading;

public class ShutDownHookRemove extends Thread{
	
	public void run() {
		System.out.println("inside Run method : Executing class Thread : " +Thread.currentThread().getName());
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
	
		ShutDownHookRemove sdr = new ShutDownHookRemove(); //creating object of class
		sdr.start(); //staring another thread
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		
		
		Runtime.getRuntime().addShutdownHook(sdr); //adding class thread(sdr which is object of class)to shutdown hook
		
		//current state of program
		System.out.println("Thread is executing ::" + Thread.currentThread().getName());
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		
		System.out.println("Waiting for few seconds");
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		
		Runtime.getRuntime().removeShutdownHook(sdr); //Removing hook using removeShutdownhook method
		
		System.out.println("Program terminating::" + Thread.currentThread().getName());
		
		
		

	}

}
