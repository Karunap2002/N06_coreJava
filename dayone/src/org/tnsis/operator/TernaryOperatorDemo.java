package org.tnsis.operator;
import java.util.*;
public class TernaryOperatorDemo {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter numbr:");
		int n=sc.nextInt();
		String res=(n%2==0)?"even":"odd";
		System.out.println("The number is:"+res);
	}

}
