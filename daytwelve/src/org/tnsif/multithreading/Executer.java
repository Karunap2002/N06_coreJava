package org.tnsif.multithreading;

public class Executer {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("Is"+Thread.currentThread().getName()+"Alive:"+Thread.currentThread().isAlive());
		ChildThread3 one=new ChildThread3();
		ChildThread3 two=new ChildThread3();
		System.out.println("Is"+Thread.currentThread().getName()+"Alive:"+one.isAlive());
		System.out.println("Is"+Thread.currentThread().getName()+"Alive:"+two.isAlive());
		
		one.join();
		two.join();
		
		System.out.println("Is"+Thread.currentThread().getName()+"Alive:"+one.isAlive());
		System.out.println("Is"+Thread.currentThread().getName()+"Alive:"+two.isAlive());

	}

}
