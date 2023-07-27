package org.tnsif.singleinheritance;
//base class
public class Citizen {
private String city;
private int pincode;
private String area;
private long adharNO;

public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public int getPincode() {
	return pincode;
}
public void setPincode(int pincode) {
	this.pincode = pincode;
}
public String getArea() {
	return area;
}
public void setArea(String area) {
	this.area = area;
}
public long getAdharNO() {
	return adharNO;
}
public void setAdharNO(long adharNO) {
	this.adharNO = adharNO;
}

@Override
public String toString() {
	return "Citizen [city=" + city + ", pincode=" + pincode + ", area=" + area + ", adharNO=" + adharNO + "]";
}
public Citizen()
{
	System.out.println("Citizen parent class");
}

public Citizen(String city, int pincode, String area, long adharNO) {
	super();
	this.city = city;
	this.pincode = pincode;
	this.area = area;
	this.adharNO = adharNO;
}

}
