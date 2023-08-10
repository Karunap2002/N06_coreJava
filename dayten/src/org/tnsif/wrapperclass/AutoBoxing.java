//program to demonstrate autoboxing
//conversion of primitive datatypes to object type
package org.tnsif.wrapperclass;

public class AutoBoxing {

	public static void main(String[] args) {
		int num=97;
		//converting a primitive type to object
		Integer value=num;
		System.out.println(value);
		System.out.println(value.getClass().getName());

	}

}
