//2nd child class
package org.tnsif.hierarchicalinheritance;

public class SnowCone extends Android {
private int version;
	
    //getters and setters
	public int getVersion() {
		return version;
	}


	public void setVersion(int version) {
		this.version = version;
	}

	public SnowCone(String brand, String slotType,int version) {
		super(brand, slotType);
		this.version=version;
		// TODO Auto-generated constructor stub
	}

    //toString method
	@Override
	public String toString() {
		return "SnowCone [version=" + version + ", toString()=" + super.toString() + "]";
	}
	

}
