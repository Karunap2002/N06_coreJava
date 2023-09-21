package org.tnsif.bankapplication;

public class Account implements Bank {
    private int accNo;
    private String name;
    private int balance;
    
    
	public int getAccNo() {
		return accNo;
	}

	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}
	

	public Account(int accNo, String name, int balance) {
		super();
		this.accNo = accNo;
		this.name = name;
		this.balance = balance;
	}
	

	@Override
	public void deposite(int amount) throws DepositLimtExceedException {
		if(amount>Bank.DEPOSIT_LIMIT)
		{
			throw new DepositLimtExceedException("CANT DEPOSITE:"+amount);
			
			
			//balance+=amount;
		}
		balance+=amount;
		
	}

	@Override
	public void withdraw(int amount) throws InsufficientBalanceException {
		if(amount>balance-Bank.MINIMUM_BALANCE)
		{
			throw new InsufficientBalanceException ("CANT WITHDRAW:"+balance);
			
			
			//balance-=amount;
		}
		
		balance-=amount;
		
		
	}

	@Override
	public String toString() {
		return "Account [accNo=" + accNo + ", name=" + name + ", balance=" + balance + "]";
	}
	

}
