package org.tnsif.polymorphismdemo;
class ChiefMinister
{
	static void curruption(String str1,float amt)
	{
		System.out.println(str1+" "+"currupted amount of"+" "+amt);
	}
}
class MLA extends ChiefMinister
{
	static void curruption(String str1,float amt)
	{
		ChiefMinister.curruption("bbb", 23456);
		//super.curruption("Ajit Pawar", 2345);
		System.out.println(str1+" "+"currupted amount of"+" "+amt);
	}
}
public class MethodOverridingExecuter {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
   // MLA a=new MLA();
    MLA.curruption("aaa",1234);
	}

}
