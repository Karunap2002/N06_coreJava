package org.tnsif.generics;

import java.util.Arrays;

public class ArrayOperations {
	public static <E> void display(E values[])
	{
		for(int i=0;i<values.length;i++)
		{
			System.out.println(values[i]+" ");
		}
		//for(E ele:values)-----for each loop
		
		
	}
    public static<E> void sortArray(E values[])
    {
    	Arrays.sort(values);
    }
}
