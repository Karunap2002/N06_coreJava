//program to demonstrate on bunjee jumping using nested if
package org.ttnsis.decisionmaking;
import java.util.*;
public class NestedIfExecuter {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int age=sc.nextInt();
	int wt=sc.nextInt();
	if(age >12)
	{
		if(wt>45)
		{
			System.out.println("eligible for bunjee jumping");
			if(wt>110)
			{
				System.out.println("extra ropes will be added");
			}
		}
		else
		{
			System.out.println("not eligible");
		}
	}
	else
	{
		System.out.println("not eligible");
	}

	}

}
