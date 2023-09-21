package org.tnsif.multithreading;

public class RunnableDemo {

	public static void main(String[] args) {
		//first way-using implementable class of runnable
		ThreadRunnableImpl im=new ThreadRunnableImpl();
		Thread threadOne=new Thread(im,"childthread:");
		threadOne.start();
		
		//second way-Anonymous class
		Runnable obj=new Runnable()
		{
			public void run()
			{
				char ch ='A';
				for(int i=1;i<=26;i++)
				{
					System.out.println(Thread.currentThread().getName()+":"+ch);
					try {
						Thread.sleep(400);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		};
		Thread threadTwo=new Thread(obj,"childthread1:");		
		threadTwo.start();	
		
		Runnable objOne=()->
		{
		  for(int i=1000;i<=1050;i++)
		  {
			  System.out.println(Thread.currentThread().getName()+":"+i);
			  try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		  }
		};
		Thread threadThree=new Thread(objOne,"childthread2:");	
		threadOne.start();
		threadTwo.start();
		threadThree.start();
		
		try {
			Thread.sleep(1200);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		System.out.println("------------------------------------------------------------------------------------");
		
		
		

	}

}
