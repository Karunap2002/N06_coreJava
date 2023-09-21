package org.tnsif.multithreading;

public class ChildThread2 extends Thread {

	
		public void run()
		{
			System.out.println(" prime or not:"+MultithreadingOperation.getPrime(10));
		}

	

}
