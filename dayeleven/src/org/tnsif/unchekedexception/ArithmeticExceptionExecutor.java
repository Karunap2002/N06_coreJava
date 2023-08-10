package org.tnsif.unchekedexception;
import java.util.*;
public class ArithmeticExceptionExecutor {

	public static void main(String[] args) {
		//try {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter first number:");
		int n1=sc.nextInt();
		
		System.out.println("enter second number:");
		int n2=sc.nextInt();
		//try block contains an exception code
		try {
		System.out.println(n1/n2);
		}
		//catch block is used to handle that exception
		catch(Exception e)
		{
			System.out.println("exception handled:"+e);
		}

	}

}
