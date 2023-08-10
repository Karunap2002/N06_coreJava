//program to demonstrate on custom exception
//to custom exception extend an exception class(parent)
package org.tnsif.customexception;

public class LoginCredintials extends Exception {
	private String str;
	
    public String getStr() {
		return str;
	}

	public void setStr(String str) {
		this.str = str;
	}

	//parameterised constructor
	public LoginCredintials(String str) {
		super();
		this.str = str;
	}

	@Override
	public String toString() {
		return "LoginCredintials [str=" + str + "]";
	}
	
	

}
