package com.synchronization;

public class Static2 extends Thread{

	public void run() {
		Table.staticTable(100);
	}
}
