package com.multithreading;

public class ThreadIsAlive extends Thread {
	public void run() {
		try {
			Thread.sleep(3000);
			System.out.println("is run() method isAlive " + Thread.currentThread().isAlive());
			System.out.println(Thread.currentThread().getName());
		} catch (InterruptedException ie) {
		}
	}

	public static void main(String[] args) {

		ThreadIsAlive is = new ThreadIsAlive();
		System.out.println("before starting thread isAlive: "+is.isAlive());  
		is.start();
		System.out.println("after starting thread isAlive: "+is.isAlive()); 
		
		
		System.out.println("before starting thread isAlive: "+is.isAlive()); 
		
		ThreadIsAlive is1 = new ThreadIsAlive();
		is1.start();
		System.out.println("after starting thread isAlive: "+is1.isAlive());  
	}

}
