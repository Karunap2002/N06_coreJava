package org.tnsif.customexception;
import java.util.Scanner;
public class CustomExceptionExecutor {

	public static void main(String[] args)throws  LoginCredintials {
		Scanner sc=new Scanner(System.in);
		String userId=sc.nextLine();
		String password=sc.nextLine();
		
		if(userId.equals("Karunapawar@tnsif")&& password.equals("password@123"))
		{
		    System.out.println("credintials are matched");	
		}
		else
		{
			throw new LoginCredintials("invalid credintials");
		}


	}

}
