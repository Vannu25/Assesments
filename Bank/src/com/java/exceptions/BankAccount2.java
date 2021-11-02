package com.java.exceptions;

public class BankAccount2 {
	private int accountNumber;
	private String accountHolder;
	private double accountBalance;
	
	public BankAccount2(int accountNumber, String accountHolder, double accountBalance) throws AccountNumberException2, AccountHolderNameException2, OpeningBalanceException2 // throws clause is here
	{
		super();
		
	
		
		if(accountNumber <= 0 ) {
			throw new AccountNumberException2("Account number cannot be negative....");
		}
		else 
			this.accountNumber = accountNumber;
		
		boolean found=false;  
		for(int i=0;i<accountHolder.length();i++) {
			char ch = accountHolder.charAt(i);
			if( (ch >= 65 && ch<= 91 ) || (ch>=97 && ch<=122) || ch==32 )
				found=true;
			else {
				found=false;
				break;	
			}				
		}
		if(found) {
				this.accountHolder = accountHolder;
		}
		else {
			throw new AccountHolderNameException2("Account Holder name should have alphabets");
		}
		
		if(accountBalance <5000) {
			throw new OpeningBalanceException2("Account Opening balance  must be more than 5000");
		}
		else
			this.accountBalance = accountBalance;
	
	
	}
	
	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	public String getAccountHolder() {
		return accountHolder;
	}
	public void setAccountHolder(String accountHolder) {
		this.accountHolder = accountHolder;
	}
	public double getAccountBalance() {
		return accountBalance;
	}
	public void setAccountBalance(double accountBalance) {
		this.accountBalance = accountBalance;
	}
	@Override
	public String toString() {
		return "BankAccount [accountNumber=" + accountNumber + ", accountHolder=" + accountHolder + ", accountBalance="
				+ accountBalance + "]";
	}
	
	
}
