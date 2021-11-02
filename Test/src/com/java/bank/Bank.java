package com.java.bank;

public class Bank {
	
	public static SavingsAccount getAccount(String hint) {
		if (hint.equalsIgnoreCase("sav"))
			return new SavingsAccount (101, "Jack", 5000);
		else 
			return null;
		
	}
	

public class Test {
	
	public static void name(String [] args) {
		System.out.println(" begin....");
		SavingsAccount saObj = Bank.getAccount("sav");
		
		if(saObj ==null)
		{
			System.out.println("Object not Initialized");
		}
		else  
		{
			
	}
  }
 }
}
