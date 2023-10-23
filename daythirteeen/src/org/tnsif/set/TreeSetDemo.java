package org.tnsif.set;
import java.util.*;
public class TreeSetDemo {

	public static void main(String[] args) {
	TreeSet<String>ts=new TreeSet<String>();	
	ts.add("Rushikesh");
	ts.add("Kunal");
	ts.add("Satish");
	ts.add("Neha");
	//ts.add(null);//in sorting we cant insert null value beacuse treeset is sorted set
	System.out.println(ts);
	
	System.out.println("---------------------------------------");
	Comparator<Customer>comp=(c1,c2)->
	{
		// return c2.getName().compareTo(c1.getName());   descending order
		 return c1.getName().compareTo(c2.getName());//ascending order
	};
	TreeSet<Customer>CustomerSet=new TreeSet<Customer>(comp);
	CustomerSet.add(new Customer("Karuna","Nashik"));
	CustomerSet.add(new Customer("Sakshi","Nashik"));
	CustomerSet.add(new Customer("Renuka","Pune"));
	CustomerSet.add(new Customer("Snehal","Mumbai"));
	System.out.println(CustomerSet);
	

	}

}
