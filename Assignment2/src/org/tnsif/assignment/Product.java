package org.tnsif.assignment;
import java.util.*;
public class Product {

	public static void main(String[] args) {
		List<String>prod=new ArrayList<String>();
		prod.add("klm");
		prod.add("aaa");
		prod.add("bbb");
		prod.add("qrs");
		prod.add("xxx");
		prod.add("zzz");
		System.out.println(prod);
		
		Collections.sort(prod);
		System.out.println(prod);
		
		System.out.println("Is product present:"+prod.contains("klm"));
		if(prod.contains("klm"))
		{
			System.out.println("Thank you for purchasing the product");
		}
		
		System.out.println("Is product present:"+prod.contains("qqq"));
		if(prod.contains("qqq"))
		{
			System.out.println("No,Please purchase the product");
		}
		
		 System.out.println(prod.isEmpty());
		 System.out.println("size="+prod.size());
		

	}

}
