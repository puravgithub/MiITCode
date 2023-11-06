package com.synchronization;

public class Block1 extends Thread{

	Table t ;
	public Block1(Table t) {
		this.t = t;
	}
	
	public void run() {
		t.blockTable(5);
		
	}
}
