package org.tnsif.multithreading;

public class StudentExecuter {

	public static void main(String[] args) {
		Thread t=Thread.currentThread();     //factory methods
		System.out.println(t.getName());
		System.out.println(t);     //it invokes toString() method
		System.out.println("----------------------------------------");

	}

}
