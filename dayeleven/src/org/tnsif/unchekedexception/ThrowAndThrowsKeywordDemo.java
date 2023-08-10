//program to demonstrate throw and throws keyword

package org.tnsif.unchekedexception;

public class ThrowAndThrowsKeywordDemo {
	static void eligible(int age,int wt)
	{
		if(age>18 && wt>50)
		{
			System.out.println("person is eligible");
		}
		//throw keyword is used to throw an exception explicitly
		else
			throw new ArithmeticException("criteria is not satisfied");
	}

	public static void main(String[] args)throws ArithmeticException {
		
      eligible(13,55);
	}

}
