package org.tnsif.assignment;
import java.util.*;

public class ReverseOrder {

public static void main(String[] args) {
Scanner sc=new Scanner (System.in);	
System.out.println("Enter value of n:");
int n=sc.nextInt();
int pinky[]=new int[n];
int mary[]=new int[n];

System.out.println("Numbers said by Pinky:");
for(int i=0;i<n;i++)
{
	pinky[i]=sc.nextInt();
	
}

System.out.println("Numbers said by Mary:");
for(int i=0;i<n;i++)
{
	mary[i]=sc.nextInt();
	
}
boolean isReverse=true;
{
	for(int i=0;i<n;i++)
	{
		if(pinky[i] != mary[n-1-i])
		{
			isReverse=false;
			break;
		}
		
	}
}

if(isReverse)
{
	System.out.println("Yes,it is in reverse order");
}

else
{
	System.out.println("NO,it is not in reverse order");
}

 }

}
