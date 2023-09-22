package com.innerclass;

public class CallAnyInterface {

	public static void main(String[] args) {
		AnyInterface any = new AnyInterface() {
			
			@Override
			public void AnyInterfaceMethod() {
				System.out.println(" Calling interface method ");
			}
		};
		any.AnyInterfaceMethod();

	}

}
