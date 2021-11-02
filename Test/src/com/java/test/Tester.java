package com.java.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.java.bank.Bank;
import com.java.bank.SavingsAccount;

public class Tester {

	@Test
	public void testA() {
		System.out.println("a Testing 2 saving account...");
		SavingsAccount saObj = Bank.getAccount("sav");
		Assertions.assertTrue(saObj!=null);
		System.out.println("Test passed 1");
	    System.out.println("Object created..");
	    saObj.withdraw(4000);
	    Assertions.assertEquals(1000, saObj.getAccountBalance());
	    System.out.println("Test passed 2");
	
}
}
