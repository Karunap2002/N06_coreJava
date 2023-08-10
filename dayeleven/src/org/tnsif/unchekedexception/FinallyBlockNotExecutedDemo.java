package org.tnsif.unchekedexception;

public class FinallyBlockNotExecutedDemo {
	static void display(int arr[])
    {
	   try {
    	System.out.println(arr[3]);
    	//System.exit(0);
	   }
	   catch(ArrayIndexOutOfBoundsException e)
	   {
		   System.out.println(e);
		   /* if try and catch block contains system.exit(0); after the exception code line
		    * then finally block does not execute.*/
		  // System.exit(0);
	   }
	   finally
	   {
		   //when finally block contain an exception code, then finally block does not execute
		   System.out.println(13/0);
		   System.out.println("finally block always executed");
	   }
	   System.out.println("any statement ouside the try,catch and finally statement is also executed");
    }

	public static void main(String[] args) {
		int arr[]= {12,3,5};
	    display(arr);

	}

}
