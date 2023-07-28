/* there are n people standing in a circle waiting to be executed.The counting out begins at some point in the circle
 * and  proceeds around the circle in a fix direction.In each step certain no of people are skipped and the next person is executed.
 * The elimination proceeds around the circle(which is becoming smaller and smaller as the executed peoples are removed),until
 * only the last person remains,who is given freedom.
 * 
 * given: total no of person is n and no k which indicates that k-1 person are skipped and the kth person is killed in a circle
 * task is to choose the person in the initial circle that survives.*/
package org.tnsif.dayfourchallenge;
import java.util.*;

public class CircleSurviveChallenge {
	static int survive(int n,int k)
	{
		if(n==1)
		{
			return 1;
		}
		else
		{
			return(survive(n-1,k)+k-1)%n+1;
		}
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter value for n and k");
		int n=sc.nextInt();
		int k=sc.nextInt();
		System.out.println(survive(n,k));
		

	}

}


