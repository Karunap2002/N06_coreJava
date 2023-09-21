package org.tnsif.bankapplication;

public interface Bank {
	
	int DEPOSIT_LIMIT=25000;           //by dfault fields of interface are static and final
	static final int MINIMUM_BALANCE=1000;
	void deposite(int amount)throws  DepositLimtExceedException;
	void withdraw(int amount)throws  InsufficientBalanceException;
}
