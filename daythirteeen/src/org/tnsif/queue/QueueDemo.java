package org.tnsif.queue;
import java.util.*;
public class QueueDemo {

	public static void main(String[] args) {
	ArrayDeque<Integer>queue=new ArrayDeque<Integer>();
	queue.add(29);
	queue.add(10);
	queue.add(49);
	queue.add(98);
	queue.add(50);
	
	System.out.println("first element:"+queue.getFirst());
	System.out.println("last  element:"+queue.getLast());
	
	System.out.println("element to be removed first:"+queue.peekFirst());
	System.out.println("element to be removed last:"+queue.peekLast());

	
	System.out.println(queue.remove()+ " removed");
	
	System.out.println(queue.isEmpty());
	while(!queue.isEmpty())
	{
		System.out.println(queue.remove()+ " removed");
	}
	
	System.out.println(queue.isEmpty());

	}

}
