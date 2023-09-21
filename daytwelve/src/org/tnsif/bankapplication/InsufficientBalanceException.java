package org.tnsif.bankapplication;

public class InsufficientBalanceException extends Exception{
	public InsufficientBalanceException()
	{
		super("cant withdraw...Insufficient balance");
	}
	
	public InsufficientBalanceException(String message)
	{
		super(message);
	}

}
