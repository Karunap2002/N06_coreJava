package org.tnsif.multithreading;

public class MultithreadingOperation {
	public static int getFactorial(int n)
	{
		int fact=1;
		for(int i=1;i<=n;i++)
		{
			fact=fact*i;
			
		}
		//return fact;
	    System.out.println("factorial="+Thread.currentThread());
		return fact;
	}
	
	public static boolean getPrime(int n)
	{
		boolean flag=true;
		for(int i=2;i<=n/2;i++)
		{
			if(n%2==0)
			{
				flag=false;
				break;
			}
		}
		System.out.println("Is prime?"+Thread.currentThread());
		return flag;
	}
	
}
