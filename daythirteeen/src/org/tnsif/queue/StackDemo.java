package org.tnsif.queue;
import java.util.Stack;
public class StackDemo {

	public static void main(String[] args) {
		Stack<Integer>st=new Stack<Integer>();
		st.add(10);
		st.add(30);
		st.add(20);
		st.add(50);
		st.add(40);
		
		System.out.println("size of stack:"+st.size());
		System.out.println("Elements to be removed first:"+st.peek());
		System.out.println("--------------------------------------");
		while(!st.isEmpty())
		{
			System.out.println(st.pop());
		}
		
		System.out.println("size of stack:"+st.size());

	}

}
