//program to demonstrate on to check the person is eligible to donate the blood or not
package org.ttnsis.decisionmaking;
import java.util.*;
public class IfElseExecutor {

	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	int age=s.nextInt();
	int wt=s.nextInt();
	if(age>18 && wt>50)
	{
		System.out.println("Eligible to danate the blood");
	}
	else
	{
		System.out.println(" not Eligible to danate the blood");
	}
	s.close();
		
	}
	

}
