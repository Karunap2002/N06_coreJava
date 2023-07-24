//program to demonstrate on cascaded if else statement
package org.ttnsis.decisionmaking;
import java.util.*;
public class CascadedIfElseExecution {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int a1=s.nextInt();
		int a2=s.nextInt();
		int a3=s.nextInt();
		if (a1>a2 && a1>a3)
		{
			System.out.println("age1 is greater:" +a1);
		}
		else if (a2>a1 && a2>a3)
		{
			System.out.println("age2 is greater:" +a2);
		}
		else
		{
			System.out.println("age3 is greater:" +a3);
		}



	}

}
