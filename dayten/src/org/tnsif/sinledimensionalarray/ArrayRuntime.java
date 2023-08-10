package org.tnsif.sinledimensionalarray;
import java.util.Arrays;
import java.util.Scanner;
public class ArrayRuntime {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n;
		//int arr[]=new int[n];
		System.out.println("enter size of array:");
		n=sc.nextInt();
		int arr[]=new int[n];
		
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("array elements are:");
		for(int i=0;i<n;i++)
		{
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		int max=arr[0];
		for(int i=0;i<n;i++)
		{
			if(arr[i]>max)
			{
				max=arr[i];
			}
		}
		System.out.println("largest elements is:"+max);
		
		System.out.println(arr.length);
		
		Arrays.sort(arr);
		System.out.println("sorted elements are:");
		for(int i:arr)
		{
			System.out.print(i+" ");
		}
		

	}

}
