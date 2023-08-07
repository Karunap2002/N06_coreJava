package org.tnsif.interfaceexecuter;
//child class
public class Human implements ColdDrink,AlcoholDrinks {

	@Override
	public void show() {
		System.out.println(colddrinkname +" "+type+" "+brand);
		
	}

}
