//program to demonstrate homogeneous List
package org.tnsif.collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.List;
public class ArrayListDemo {

	public static void main(String[] args) {
    List<Integer> inList=new ArrayList<Integer>();
    inList.add(10);
    inList.add(8);
    inList.add(42);
    inList.add(30);
    inList.add(5);
    
    System.out.println(inList);
    Collections.sort(inList);
    System.out.println("--------------After sorting--------------:");
    System.out.println(inList);
    
    //insert new element in second position
    inList.add(2,80);
    System.out.println(inList);
    System.out.println("size="+inList.size());
    
    Collections.reverse(inList);
    System.out.println("----------After reversing--------------:");
    System.out.println(inList);
    
    System.out.println("Is 42 present:" +inList.contains(42)); 
    System.out.println("42 present at:" +inList.indexOf(42)); 
    System.out.println("50 present at:" +inList.indexOf(50)); 
   
    System.out.println(" remove element at 3 position:"+inList.remove(3));
    System.out.println(inList);
   
   /*inList.remove(13);//it will give indexoutofbound exception
   System.out.println(inList);*/
    System.out.println("Is 5 remove:" +inList.remove(inList.indexOf(5))); 
    System.out.println(inList);
    
    //Iterate the list
    Iterator<Integer>it=inList.iterator();
    while(it.hasNext())
    {
    	int n=it.next();
    	System.out.println(n+ "is:"+(n%2==0?"Even":"Odd"));
    }
   
    inList.clear();
    System.out.println(inList.isEmpty());
    
    
    
    List<String> name=new ArrayList<String>();
    name.add("Karuna");
    name.add("Sakshi");
    name.add("Snehal");
    name.add("Neha");
    name.add("Madhuri");
    
    System.out.println(name);
    
    Collections.sort(name);
    System.out.println(name);

	}

}
