package org.tnsif.thisdemo;
class Team
{
	int size;
	Team()
	{
		//calling to parameterized constructor
		this(7);
		System.out.println("default constructor");
	}
	Team(int size)
	{
		
		System.out.println("parameterized constructor:"+size);
	}
}
public class ThisDemo3 {

	public static void main(String[] args) {
	
    Team t=new Team();
    Team t1=new Team(11);
    
	}

}
