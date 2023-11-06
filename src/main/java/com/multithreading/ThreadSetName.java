package com.multithreading;

public class ThreadSetName extends Thread {

	public static void main(String[] args) {

		ThreadSetName kishan = new ThreadSetName();
		kishan.setName("thread Kishan");

		ThreadSetName purav = new ThreadSetName();
		purav.setName("thread purav");

		kishan.start();
		purav.start();

		System.out.println(kishan.getState());
		System.out.println(purav.getState());
	}

	public void run() {

		for (int i = 0; i < 10; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName());
			System.out.println("running thread :: " + Thread.currentThread().getState());
		}
	}

}
