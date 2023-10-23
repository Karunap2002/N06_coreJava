package org.tnsif.queue;

import java.util.*;

public class PriorityQueueDemo {

	public static void main(String[] args) {
		
			PriorityQueue<Integer>queue=new PriorityQueue<Integer>();
			queue.add(29);
			queue.add(10);
			queue.add(49);
			queue.add(98);
			queue.add(50);
			
			System.out.println(queue);
			
			System.out.println("Element to be removed first:"+queue.peek());
			
			
			System.out.println(queue.remove()+ " removed");
			System.out.println("------------------------------------");
			
			System.out.println(queue.isEmpty());
			while(!queue.isEmpty())
			{
				System.out.println(queue.remove()+ " removed");
			}
			System.out.println(queue.isEmpty());

	}

}
