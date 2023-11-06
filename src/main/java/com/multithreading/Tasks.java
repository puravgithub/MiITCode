package com.multithreading;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Tasks implements Runnable {

	private String taskname;

	public Tasks(String taskname) {
		this.taskname = taskname; // Initializing task name
	}

	@Override
	public void run() {
		try {
			for (int i = 0; i < 5; i++) {

				if (i== 0) {
					
					Date dt = new Date();
					SimpleDateFormat df = new SimpleDateFormat("hh:mm:ss");
					System.out.println("starting task : "+taskname+"starting time: "+df.format(dt));
					
				}
				else {
					
					Date dt = new Date();
					SimpleDateFormat df = new SimpleDateFormat("hh:mm:ss");
					System.out.println("task execution time :" +df.format(dt));
				}
				Thread.sleep(1000);
			}
			
			System.out.println(taskname+"completed");
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}

	}

}
