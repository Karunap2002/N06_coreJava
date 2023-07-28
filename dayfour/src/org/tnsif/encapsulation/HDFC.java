//program to demonstrate on encapsulation
/* encapsulation achieves a data hiding using private access */
package org.tnsif.encapsulation;

public class HDFC {
	private String accType;
	private long accNo;
    private long atmCardNO;
    private int pinNo;
	public String getAccType() {
		return accType;
	}
	
	public void setAccType(String accType) {
		this.accType = accType;
	}
	
	public long getAccNo() {
		return accNo;
	}
	
	public void setAccNo(long accNo) {
		this.accNo = accNo;
	}
	
	public long getAtmCardNO() {
		return atmCardNO;
	}
	
	public void setAtmCardNO(long atmCardNO) {
		this.atmCardNO = atmCardNO;
	}
	
	public int getPinNo() {
		return pinNo;
	}
	
	public void setPinNo(int pinNo) {
		this.pinNo = pinNo;
	}

	@Override
	public String toString() {
		return "HDFC [accType=" + accType + ", accNo=" + accNo + ", atmCardNO=" + atmCardNO + ", pinNo=" + pinNo + "]";
	}
	
	


}
