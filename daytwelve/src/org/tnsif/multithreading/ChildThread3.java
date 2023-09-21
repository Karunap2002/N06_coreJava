package org.tnsif.multithreading;

public class ChildThread3 extends Thread{
	public ChildThread3() {
		setPriority(MAX_PRIORITY);
		start();
	}
	@Override
	public void run()
	{
		System.out.println(Thread.currentThread().getName()+":Hello");
		System.out.println("Is"+Thread.currentThread().getName()+": Alive:"+Thread.currentThread().getName());
	}

}
