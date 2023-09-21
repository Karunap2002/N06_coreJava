package org.tnsif.bankapplication;

public class DepositLimtExceedException extends Exception {
	public DepositLimtExceedException()
	{
		super("can't Deposit..Limit is exceeded");
	}
	public DepositLimtExceedException(String message)
	{
		super(message);
	}

}
