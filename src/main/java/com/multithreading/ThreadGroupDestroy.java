package com.multithreading;

public class ThreadGroupDestroy extends Thread {
	
	public ThreadGroupDestroy(String tName , ThreadGroup tGroup) {
		
		super(tGroup,tName);
		start();
		
	}
	
	public void run() {
		
		for (int i = 0 ; i<100 ; i++) {
			
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
			
				System.out.println("exception occured" +e);
			}
			
		}
		System.out.println(Thread.currentThread().getName()+"Finished Executing");
	}

	public static void main(String[] args) throws InterruptedException {
	
		// creating the thread group  
		ThreadGroup tg = new ThreadGroup("the parent group"); //ThreadGroup1 (Parent)
		  
		ThreadGroup tg1 = new ThreadGroup(tg, "the child group");  //ThreadGroup  2 (Child)
		
		ThreadGroupDestroy td = new ThreadGroupDestroy("First Group", tg);
		System.out.println("Starting First Thread");
		
		ThreadGroupDestroy td1 = new ThreadGroupDestroy("Second Group", tg);
		System.out.println("Starting Second Thread");
		
		//joining thread so one thread will be executed then after another thread will start execution
		td.join();
		td1.join();
		
		tg1.destroy(); //Destroying ThreadGroup 1
		System.out.println(tg1.getName() + " is destroyed.");  
		
		// destroying the parent thread group  
		tg.destroy();  
		System.out.println(tg.getName() + " is destroyed.");  
		
		
		
		
		
		  
		

	}

}
