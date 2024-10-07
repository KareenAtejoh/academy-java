package com.bptn.course._06_00p;



 
	 class ChequingAccount extends BankAccount {
		 
		 private double overDraftLimit;
		 
	public ChequingAccount(String accountNumber, double initialBalance, double overDraftLimit);
	super(accountNumber, initialBalance);
	this.overDraftLimit = overDraftLimit;
	 }
public void withdraw(double amount) {
	if (amount>0 && amount<=(getBalance() + overDraftLimit) ) {
		super.withdrawal(amount);
		
	}
}
}
