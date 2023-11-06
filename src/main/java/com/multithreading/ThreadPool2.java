package com.multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

//Task class is used

public class ThreadPool2 {
	static int noOfThreads = 3;

	public static void main(String[] args) {


	//	Runnable r = new Thread()
		
		Runnable r1 = new Tasks("task1");
		Runnable r2 = new Tasks("task2");
		Runnable r3 = new Tasks("task3");
		Runnable r4 = new Tasks("task4");
		Runnable r5 = new Tasks("task5");
		
		
		ExecutorService exs = Executors.newFixedThreadPool(noOfThreads);
		
		exs.execute(r1);
		exs.execute(r2);
		exs.execute(r3);
		exs.execute(r4);
		exs.execute(r5);
		
		exs.shutdown();
		

	}

}
