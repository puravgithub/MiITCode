package com.synchronization;

//creating a class to use method
public class Table {

	// If you declare any method as synchronized, it is known as synchronized
	// method.
	// When a thread invokes a synchronized method,
	// it automatically acquires the lock for that object and releases it when the
	// thread completes its task.

	// using synchronized method
	synchronized public void printTable(int n) {

		for (int i = 1; i < 5; i++) {
			System.out.println(n * i);

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

	/// using synchronized block
	public void blockTable(int n) {
		synchronized (this) {

			for (int i = 1; i < 5; i++) {
				System.out.println(n * i);

				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

		}

		System.out.println("This line is outside of synchronized block");
	}

	synchronized static void staticTable(int n) {
		
		for (int i = 1; i < 5; i++) {
			System.out.println(n * i);

			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
