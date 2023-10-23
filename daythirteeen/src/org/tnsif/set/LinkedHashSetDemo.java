package org.tnsif.set;
import java.util.*;
public class LinkedHashSetDemo {

	public static void main(String[] args) {
	//order set	
	LinkedHashSet<Integer>link=new LinkedHashSet<Integer>();
	link.add(45);
	link.add(55);
	link.add(67);
	link.add(11);
	link.add(84);
	System.out.println(link);
	
	System.out.println("-----------------------------");
	Iterator<Integer>it=link. iterator();
	while(it.hasNext())
	{
		System.out.println(it.next());
	}
	
	System.out.println("------------------------------");
	ArrayList<Integer>list=new ArrayList<Integer>(link);
	Collections.sort(list);
	System.out.println(list);
	System.out.println("------------------------------");
	
	LinkedHashSet<Customer>CustomerSet=new LinkedHashSet<Customer>();
	CustomerSet.add(new Customer("Karuna","Nashik"));
	CustomerSet.add(new Customer("Sakshi","Nashik"));
	CustomerSet.add(new Customer("Renuka","Pune"));
	CustomerSet.add(new Customer("Snehal","Mumbai"));
	System.out.println(CustomerSet);
	
	System.out.println("------------------------------");
	ArrayList<Customer>c=new ArrayList<Customer>(CustomerSet);
	System.out.println(c);
	
	System.out.println("------------------------------");
	Comparator<Customer>comp=(c1,c2)->{
		
		return c1.getCity().compareTo(c2.getCity());
		
		
	};
	Collections.sort(c,comp);
	System.out.println(c);

	}

}
