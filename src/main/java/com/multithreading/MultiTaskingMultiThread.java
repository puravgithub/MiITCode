package com.multithreading;
//multitasking in multithreading
//If you have to perform multiple tasks by multiple threads,have multiple run() methods
public class MultiTaskingMultiThread {

	public static void main(String[] args) {
		
		Car car = new Car(); //object of Car class
		Bike bike = new Bike(); //object of Bike Class
		
		car.start(); //calling run() from car
		bike.start(); //calling run from bike

	}

}
