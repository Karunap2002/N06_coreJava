package org.tnsif.unchekedexception;

public class MultipleCatchDemo {
	static void print(int arr[]) {
	try
	{
		System.out.println(arr[3]);
	}
	catch(ArrayIndexOutOfBoundsException |ArithmeticException |NullPointerException e)
	{
		System.out.println(e);
	}
	
	catch(Exception e)
	{
		System.out.println(e);
	}
	}
    
	
    
	public static void main(String[] args) {
		int arr[]= {12,3,4};
		print(arr);

	}

}
