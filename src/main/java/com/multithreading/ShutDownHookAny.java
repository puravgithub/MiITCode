package com.multithreading;

//Here we are creating shutdown hook using anonymous class where anonymous class will be a a Thread

public class ShutDownHookAny {

	public static void main(String[] args) {
		
		Runtime r = Runtime.getRuntime(); //object of Runtime class by calling static factory method
		
		r.addShutdownHook(new Thread() {
			public void run() {
				System.out.println("shut down hook task is completed");
			}
		});
		
		
		System.out.println("Main is sleeping while running shutdown hook thread..press ctrl+c to exit");
		
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
		
			e.printStackTrace();
		}
		

	}

}
