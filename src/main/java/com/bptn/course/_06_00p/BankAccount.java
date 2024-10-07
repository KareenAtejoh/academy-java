package com.bptn.course._06_00p;

class BankAccount {
	
	// these are the data members/ properties
	private String accountNumber;
	private double balance;
	
	// constructor used to initialise the members, this will be used to create the object for the class
	public BankAccount(String accountNumber, double initialBalance) {
		this.accountNumber = accountNumber; 
		this.balance = initialBalance;
	}
	
	//this is the method (instance method, class method of behaviour of the class)
	public void deposit(double amount) {
		if(amount > 0) {
			balance += amount;
		}
	}
	
    public void withdraw(double amount) {
    	if(amount>0 && amount<=balance) {
    		balance -= amount;
    	}
    }
    
    // Getters and Setters
    public double getBalance() {
    	return balance;
    }
    
    public void displayAccountInfo() {
    	System.out.println("Account Number: "+accountNumber);
    	System.out.println("Current Balance: "+balance);
    }
    
    
}
