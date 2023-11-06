package com.multithreading;
// Threadpool using Thread Class
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Threadpool1 extends Thread {
	int threadno;

	public Threadpool1(int number) {
		this.threadno = number;

	}

	public void run() {
	
		System.out.println(Thread.currentThread().getName() + " (Start) message = " + threadno);
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println(Thread.currentThread().getName() + " (End)");// prints thread name

	}

	public static void main(String[] args) {

		ExecutorService excutor = Executors.newFixedThreadPool(3);
		
		for (int i = 0; i < 10; i++) {
			
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			Threadpool1 t1 = new Threadpool1(i); // value of i will create an new thread every time
			excutor.execute(t1);
		}
		
		excutor.shutdown(); 
		
		while(!excutor.isShutdown()) {
			
		}
		
		 System.out.println("Finished all threads"); 

	}

}
