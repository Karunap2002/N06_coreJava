package org.tnsif.collection;
import java.util.*;
public class LinkedListDemo {

	public static void main(String[] args) {
	LinkedList<Integer> l1=new LinkedList<Integer>();
    l1.add(45);
    l1.add(12);
    l1.add(8);
    l1.add(9);
    l1.add(98);
    l1.add(55);
    System.out.println(l1);
    
    l1.addFirst(50);
    l1.addLast(100);
    System.out.println(l1);
    
    System.out.println("first element:"+l1.getFirst());
    System.out.println("last element:"+l1.getLast());
    
    l1.removeFirst();
    l1.removeLast();
    System.out.println(l1);
    
    l1.add(3,40);
    System.out.println(l1);
    
    Collections.reverse(l1);
    System.out.println(l1);
    
    //Iterator
    //iterator only forward direction and we can remove current element
    Iterator<Integer> it=l1.iterator();
    while(it.hasNext())
    {
    	System.out.println(it.next());
    	//l1.remove();
    }
    System.out.println(l1);
    
    ListIterator<Integer>LiIt=l1.listIterator();
    while(LiIt.hasNext())
    {
    	System.out.println(LiIt.next());
    }
    System.out.println("-------------------------------------------");
    while(LiIt.hasPrevious())
    {
    	System.out.println(LiIt.previous());
    }
    
    System.out.println("-------------------------------------------");
    LiIt=l1.listIterator(l1.size());//at last position
    while(LiIt.hasPrevious())
    {
    	int n=LiIt.previous();
    	//System.out.println(LiIt.previous());
    	System.out.println(n);
    	if(n==98)
    	{
    		LiIt.add(200);
    	}
    	
    	
    	if(n==40)
    	{
    		LiIt.add(298);
    	}
    	
    	
    }
    System.out.println("-------------------------------------------");
    System.out.println(l1);
    
	}

}
