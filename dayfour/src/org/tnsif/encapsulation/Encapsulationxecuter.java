package org.tnsif.encapsulation;

public class Encapsulationxecuter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     HDFC h=new HDFC();
     h.setAccType("Saving account");
     h.setAccNo(12345677897L);
     h.setAtmCardNO(123456789L);
     h.setPinNo(1221);
     
     //System.out.println("Account no:"+h.getAccNo());
     
     //below line will call to ToString() method
     System.out.println(h);
	}

}
