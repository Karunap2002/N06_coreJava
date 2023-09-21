package org.tnsif.multithreading;

public class MultithreadingExecuter {

	public static void main(String[] args) {
		System.out.println("main maethod"+Thread.currentThread());
		System.out.println(MultithreadingOperation.getFactorial(5));
		System.out.println(MultithreadingOperation.getPrime(9));
		
		ChildThread t1=new ChildThread();
		t1.start();
		
		ChildThread2 t2=new ChildThread2();
		t2.start();
		
		
		
		try {
			t2.join();
			t1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
        System.out.println("--------------------------------------------------------");
	}

}
