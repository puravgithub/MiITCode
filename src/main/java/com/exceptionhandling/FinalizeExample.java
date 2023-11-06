package com.exceptionhandling;

public class FinalizeExample {

	public static void main(String[] args) {
		
		FinalizeExample fn = new FinalizeExample();
		 
		
		//printing hashcode
		System.out.println("hashcode is  : :" +fn.hashCode());
		fn = null;
		
		System.gc();  // garbage collection
		
		System.out.println("End of garbage collection");
		
	}
	
	protected void Finalize() {
		System.out.println("This method is executed which is protected");
	}

}
