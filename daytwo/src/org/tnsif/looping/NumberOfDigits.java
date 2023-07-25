//program to demonstrate number of digits available in number
package org.tnsif.looping;
import java.util.*;
public class NumberOfDigits {

	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("enter number:");
	int n=s.nextInt();
    int cnt=0;
    do
    {
    	cnt++;
    	n=n/10;
    }while(n!=0);
    
    System.out.println("number of digits:"+cnt);
    
	}

}
