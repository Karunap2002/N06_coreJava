package org.tnsis.operator;

public class IncrementDecrementOperatorDemo {

	public static void main(String[] args) {
    int x=23,y=6;
    int res=x++ + ++y;
    System.out.println(res);
    System.out.println(x);
    System.out.println(y);
    
    int res1=x-- + --y;
    System.out.println(res1);
    System.out.println(x);
    System.out.println(y);

	}

}
