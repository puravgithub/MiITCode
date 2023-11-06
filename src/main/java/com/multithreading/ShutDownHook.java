package com.multithreading;
//A special construct that facilitates the developers to add some code that has to be run when 

//the Java Virtual Machine (JVM) is shutting down is known as the Java shutdown hook. 

//the shutdown hook can be used to perform cleanup resources or save the state when JVM shuts down normally or abruptly

/*
When does the JVM shut down?
The JVM shuts down when:

user presses ctrl+c on the command prompt
System.exit(int) method is invoked
user logoff
user shutdown etc.
*/

//Runtime Class : Runtime r = Runtime.getRuntime();  
//Add Shutdown hook : public void addShutdownHook(Thread hook){}  
//Remove ShutDown hook : public boolean removeShutdownHook(Thread hook){ }    

public class ShutDownHook {

	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getName());

		Runtime run = Runtime.getRuntime();// making object of runtime class to use addshutdownHook() method

		run.addShutdownHook(new MyThread()); // Passing my thread as argument

		System.out.println("Now main thread is sleeping .. Press ctrl+c to exit ");

		try {
			Thread.sleep(10000);
		} catch (Exception e) {

		}
	}

}
