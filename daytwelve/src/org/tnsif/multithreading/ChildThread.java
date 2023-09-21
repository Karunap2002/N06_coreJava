package org.tnsif.multithreading;

public class ChildThread extends Thread {
	public void run()
	{
		System.out.println("factorial of 5 is:"+MultithreadingOperation.getFactorial(5));
	}

}
