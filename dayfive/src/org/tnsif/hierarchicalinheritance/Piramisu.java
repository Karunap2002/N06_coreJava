//1st child class
package org.tnsif.hierarchicalinheritance;

public class Piramisu extends Android {
	
	private int version;
	
    //getters and setters
	public int getVersion() {
		return version;
	}


	public void setVersion(int version) {
		this.version = version;
	}


	public Piramisu(String brand, String slotType,int version) {
		super(brand, slotType);
		this.version=version;
		// TODO Auto-generated constructor stub
	}

   //tostring
	@Override
	public String toString() {
		return "Piramisu [version=" + version + ", toString()=" + super.toString() + "]";
	}


	
	
	
	

}
