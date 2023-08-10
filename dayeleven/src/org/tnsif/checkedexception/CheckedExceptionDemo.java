package org.tnsif.checkedexception;

import java.io.FileInputStream;

public class CheckedExceptionDemo {

	public static void main(String[] args) {
		try {
		FileInputStream f=new FileInputStream("C:\\Users\\prana\\OneDrive\\Desktop\\coding challenges"
				+ ".txt");
		System.out.println("Exists");
		}
		catch(Exception e)
		{
			System.out.println("Exception :"+e);
		}

	}

}
