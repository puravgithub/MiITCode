package com.synchronization;

public class Static1 extends Thread{

	public void run() {
		Table.staticTable(5);
	}
}
