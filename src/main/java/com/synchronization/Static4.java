package com.synchronization;

public class Static4 extends Thread{

	public void run() {
		Table.staticTable(10000);
	}
}
