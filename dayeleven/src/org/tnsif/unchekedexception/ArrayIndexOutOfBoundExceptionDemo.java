//program to demonstrate on ArrayIndexOutOfBoundException with finally
package org.tnsif.unchekedexception;

public class ArrayIndexOutOfBoundExceptionDemo {
   static void display(int arr[])
    {
	   try {
    	System.out.println(arr[3]);
	   }
	   catch(ArrayIndexOutOfBoundsException e)
	   {
		   System.out.println(e);
	   }
	   finally
	   {
		   System.out.println("finally block always executed");
	   }
	   System.out.println("any statement ouside the try,catch and finally statement is also executed");
    }
	public static void main(String[] args) {
		
    int arr[]= {12,3,5};
    display(arr);
	}

}
