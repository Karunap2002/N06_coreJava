package org.tnsif.looping;
import java.util.*;
public class WhileLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Scanner s=new Scanner(System.in);
    System.out.println("enter value of n:");
    int n=s.nextInt();
    while(n>=1)
    {
    	System.out.print(n +" ");
    	n--;
    }
    s.close();
	}

}
