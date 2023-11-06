package com.synchronization;

//Inter-thread communication or Co-operation is all about allowing synchronized threads to communicate with each other.


//Cooperation (Inter-thread communication) is a mechanism in which a thread is paused running in its critical section 
//and another thread is allowed to enter (or lock) in the same critical section to be executed.
//It is implemented by following methods of Object class:
//
//wait()
//notify()
//notifyAll()

public class TestInterThreadCom {

	public static void main(String[] args) {
	
		
		Customer customer = new Customer();
		
		InterThread1 i1= new InterThread1(customer);
		i1.start();
		
		InterThread2 i2 = new InterThread2(customer);
		i2.start();
		
		
	}

}
