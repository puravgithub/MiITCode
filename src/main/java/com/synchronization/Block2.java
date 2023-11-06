package com.synchronization;

public class Block2 extends Thread{
	Table t ;
	
	public Block2(Table t) {
		this.t = t ;
	}

	public void run() {
		t.blockTable(100);
	}
}
